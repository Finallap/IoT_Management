package com.njupt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.njupt.bean.PageBean;
import com.njupt.bean.Project;
import com.njupt.client.CloudClient;

/**
 * Servlet implementation class index
 */
@WebServlet("/index")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8"); 
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, +20);
		String end_day =  format.format(cal.getTime());
		cal.add(Calendar.YEAR, -40);
		String start_day = format.format(cal.getTime());
		
		try {
			int userid =  Integer.parseInt(session.getAttribute("userid").toString());
			
			String ProjectNumJsonString = CloudClient.getInstance().client.countProject(userid);
			JSONObject ProjectNumJsonObject = JSONObject.fromObject(ProjectNumJsonString);
			request.setAttribute("ProjectNum", ProjectNumJsonObject.getInt("ProjectNum"));
			
			String SensingDeviceNumJsonString = CloudClient.getInstance().client.countUserSensingDevice(userid);
			JSONObject SensingDeviceNumJsonObject = JSONObject.fromObject(SensingDeviceNumJsonString);
			request.setAttribute("SensingDeviceNum", SensingDeviceNumJsonObject.getInt("SensingDeviceNum"));
			
			String ControllingDeviceNumJsonString = CloudClient.getInstance().client.countUserControllingDevice(userid);
			JSONObject ControllingDeviceNumJsonObject = JSONObject.fromObject(ControllingDeviceNumJsonString);
			request.setAttribute("ControllingDeviceNum", ControllingDeviceNumJsonObject.getInt("ControllingDeviceNum"));
				
			String AlarmDataJsonString = CloudClient.getInstance().client.getAlarmDataByUserID(userid,start_day,end_day, -1,0);
			JSONObject AlarmDataJsonObject = JSONObject.fromObject(AlarmDataJsonString);
			request.setAttribute("AlarmDataNum", AlarmDataJsonObject.getInt("count"));
			
			request.getRequestDispatcher("index.jsp").forward(request, response);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			out.close();
		}
		
	}

}
