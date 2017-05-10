package com.njupt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.njupt.bean.Configtype;
import com.njupt.bean.Controllingdevice;
import com.njupt.bean.PageBean;
import com.njupt.client.CloudClient;

/**
 * Servlet implementation class LogView
 */
@WebServlet("/LogView")
public class LogView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogView() {
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
		Map<String, String[]> params = request.getParameterMap();
		
		int pageSize = 10;
		int currentPage = 1;
		int deviceid = 0;
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		String end_day =  format.format(cal.getTime());
		cal.add(Calendar.DAY_OF_MONTH, -7);
		String start_day = format.format(cal.getTime());

		for (String key : params.keySet()) {
			String[] values = params.get(key);
			for (int i = 0; i < values.length; i++) {
				if(key.equals("currentPage"))currentPage = Integer.parseInt(values[i]);
				if(key.equals("deviceid"))deviceid = Integer.parseInt(values[i]);
				if(key.equals("start_day"))start_day = values[i];
				if(key.equals("end_day"))end_day = values[i];
//				System.out.println(key + "=" + values[i] );
			}
		}
		request.setAttribute("currentDeviceID", deviceid);
		request.setAttribute("start_day", start_day);
		request.setAttribute("end_day", end_day);

		int userid =  Integer.parseInt(session.getAttribute("userid").toString());
		
		try {
			String jsonString = CloudClient.getInstance().client.queryUserControllingDevice(userid, -1, 0);
			System.out.println(jsonString);
			if (jsonString.contains("success")) {
				JSONObject jsonObject = JSONObject.fromObject(jsonString); 
				JSONArray controllingDeviceArray = jsonObject.getJSONArray("ControllingDeviceList");
				
				ArrayList<Controllingdevice> ControllingDeviceList = new ArrayList<Controllingdevice>();

				if (controllingDeviceArray.size()>0) {
					for (int i = 0; i <controllingDeviceArray.size(); i++) {
						Controllingdevice controllingDevice = new Controllingdevice();
						controllingDevice = (Controllingdevice)JSONObject.toBean(controllingDeviceArray.getJSONObject(i), Controllingdevice.class);
						
						ControllingDeviceList.add(controllingDevice);
					}
				}
				request.setAttribute("ControllingDeviceList", ControllingDeviceList);
				
				
				
				PageBean page = new PageBean();
			    page.setContentData(ControllingDeviceList);
			    page.setTotalRecords(jsonObject.getInt("count"));
			    page.setCurrentPage(currentPage);
			    page.setPageSize(pageSize);
			     
			    request.setAttribute("pagebean", page);
				
				request.getRequestDispatcher("LogView.jsp").forward(request, response);
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
