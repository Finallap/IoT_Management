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

import com.njupt.bean.AlarmData;
import com.njupt.bean.Configlog;
import com.njupt.bean.Configtype;
import com.njupt.bean.Controllingdevice;
import com.njupt.bean.PageBean;
import com.njupt.bean.Sensingdevice;
import com.njupt.client.CloudClient;

/**
 * Servlet implementation class AlarmProfile
 */
@WebServlet("/AlarmProfile")
public class AlarmProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlarmProfile() {
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
		Map<String, String[]> params = request.getParameterMap();
		
		int pageSize = 10;
		int currentPage = 1;
		
		for (String key : params.keySet()) {
			String[] values = params.get(key);
			for (int i = 0; i < values.length; i++) {
				if(key.equals("currentPage"))currentPage = Integer.parseInt(values[i]);
			}
		}
		
		int userid =  Integer.parseInt(session.getAttribute("userid").toString());
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, +20);
		String end_day =  format.format(cal.getTime());
		cal.add(Calendar.YEAR, -40);
		String start_day = format.format(cal.getTime());
		
		try {
			String jsonString = CloudClient.getInstance().client.getAlarmDataByUserID(userid,start_day,end_day, pageSize, (currentPage-1)*pageSize);
			System.out.println(jsonString);
			if (jsonString.contains("success")) {
				JSONObject jsonObject = JSONObject.fromObject(jsonString); 
				JSONArray AlarmDataArray = jsonObject.getJSONArray("AlarmDataList");
				
				ArrayList<AlarmData> list = new ArrayList<AlarmData>();

				if (AlarmDataArray.size()>0) {
					for (int i = 0; i <AlarmDataArray.size(); i++) {
						AlarmData alarmdata = new AlarmData();
						alarmdata = (AlarmData)JSONObject.toBean(AlarmDataArray.getJSONObject(i), AlarmData.class);
						
						list.add(alarmdata);
					}
				}
				
				PageBean page = new PageBean();
			    page.setContentData(list);
			    page.setTotalRecords(jsonObject.getInt("count"));
			    page.setCurrentPage(currentPage);
			    page.setPageSize(pageSize);
			     
			    request.setAttribute("pagebean", page);
				
				request.getRequestDispatcher("AlarmProfile.jsp").forward(request, response);
			}
			else {
				out.println("<script>alert('³öÏÖ´íÎó!');location.href='index';</script>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			out.close();
		}
	}

}
