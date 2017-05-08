package com.njupt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.njupt.bean.PageBean;
import com.njupt.bean.Sensingdevice;
import com.njupt.client.CloudClient;

/**
 * Servlet implementation class SensingDeviceProfile
 */
@WebServlet("/SensingDeviceProfile")
public class SensingDeviceProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SensingDeviceProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("GBK"); 
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		int pageSize = 10;
		String currentPageString=request.getParameter("currentPage").trim();
		if(currentPageString==null)
			currentPageString = "1";
		int currentPage = Integer.parseInt(currentPageString);
		
		int userid =  Integer.parseInt(session.getAttribute("userid").toString());
		
		try {
			String jsonString = CloudClient.getInstance().client.queryUserSensingDevice(userid, pageSize, (currentPage-1)*pageSize);
			System.out.println(jsonString);
			if (jsonString.contains("success")) {
				JSONObject jsonObject = JSONObject.fromObject(jsonString); 
				JSONArray DeviceArray = jsonObject.getJSONArray("SensingDeviceList");
				
				ArrayList<Sensingdevice> list = new ArrayList<Sensingdevice>();

				if (DeviceArray.size()>0) {
					for (int i = 0; i <DeviceArray.size(); i++) {
						Sensingdevice sensingDevice = new Sensingdevice();
						sensingDevice = (Sensingdevice)JSONObject.toBean(DeviceArray.getJSONObject(i), Sensingdevice.class);
						
						list.add(sensingDevice);
					}
				}
				
				PageBean page = new PageBean();
			    page.setContentData(list);
			    page.setTotalRecords(jsonObject.getInt("count"));
			    page.setCurrentPage(currentPage);
			    page.setPageSize(pageSize);
			     
			    request.setAttribute("pagebean", page);
				
				request.getRequestDispatcher("SensingDeviceProfile.jsp").forward(request, response);
			}
			else {
				out.println("<script>alert('³öÏÖ´íÎó!');location.href='SensingDeviceProfile?currentPage=1';</script>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			out.close();
		}
	}
}
