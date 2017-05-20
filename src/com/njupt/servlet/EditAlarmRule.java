package com.njupt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.njupt.client.CloudClient;

/**
 * Servlet implementation class EditAlarmRule
 */
@WebServlet("/EditAlarmRule")
public class EditAlarmRule extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditAlarmRule() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("GBK"); 
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		int userid =  Integer.parseInt(session.getAttribute("userid").toString());
		
		int deviceid = Integer.parseInt(request.getParameter("deviceid").trim());
		int alarmruleid = Integer.parseInt(request.getParameter("alarmruleid").trim());
		
		String rule =  request.getParameter("rule").trim();
//		int typeid = Integer.parseInt(request.getParameter("typeid").trim());
		float threshold = Float.parseFloat(request.getParameter("threshold").trim());
		
		try {
			String result = CloudClient.getInstance().client.updateAlarmRule(alarmruleid,rule,threshold);
			if (result.contains("success")) {
				out.println("<script>alert('数据类型修改成功!');location.href='ViewSensingDevice?deviceid="+deviceid+"';</script>");
			}
			else if(result.contains("exist")){
				out.println("<script>alert('该设备不存在!');location.href='ViewSensingDevice?deviceid="+deviceid+"';</script>");
			}
			else {
				out.println("<script>alert('未知错误!');location.href='ViewSensingDevice?deviceid="+deviceid+"';</script>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			out.close();
		}
	}

}
