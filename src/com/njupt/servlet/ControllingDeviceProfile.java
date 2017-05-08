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

import com.njupt.bean.Controllingdevice;
import com.njupt.bean.PageBean;
import com.njupt.client.CloudClient;

/**
 * Servlet implementation class ControllingDeviceProfile
 */
@WebServlet("/ControllingDeviceProfile")
public class ControllingDeviceProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllingDeviceProfile() {
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
			String jsonString = CloudClient.getInstance().client.queryUserControllingDevice(userid, pageSize, (currentPage-1)*pageSize);
			System.out.println(jsonString);
			if (jsonString.contains("success")) {
				JSONObject jsonObject = JSONObject.fromObject(jsonString); 
				JSONArray controllingDeviceArray = jsonObject.getJSONArray("ControllingDeviceList");
				
				ArrayList<Controllingdevice> list = new ArrayList<Controllingdevice>();

				if (controllingDeviceArray.size()>0) {
					for (int i = 0; i <controllingDeviceArray.size(); i++) {
						Controllingdevice controllingDevice = new Controllingdevice();
						controllingDevice = (Controllingdevice)JSONObject.toBean(controllingDeviceArray.getJSONObject(i), Controllingdevice.class);
						
						list.add(controllingDevice);
					}
				}
				
				PageBean page = new PageBean();
			    page.setContentData(list);
			    page.setTotalRecords(jsonObject.getInt("count"));
			    page.setCurrentPage(currentPage);
			    page.setPageSize(pageSize);
			     
			    request.setAttribute("pagebean", page);
				
				request.getRequestDispatcher("ControllingDeviceProfile.jsp").forward(request, response);
			}
			else {
				out.println("<script>alert('³öÏÖ´íÎó!');location.href='ControllingDeviceProfile?currentPage=1';</script>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			out.close();
		}
	}

}
