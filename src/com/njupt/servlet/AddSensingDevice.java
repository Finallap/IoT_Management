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
 * Servlet implementation class AddSensingDevice
 */
@WebServlet("/AddSensingDevice")
public class AddSensingDevice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSensingDevice() {
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
		
		int projectid = Integer.parseInt(request.getParameter("projectid").trim());
		
		String deviceName = request.getParameter("devicename").trim();
		String mac =  request.getParameter("mac").trim();
		String protocol = request.getParameter("protocol").trim();
		String description = request.getParameter("description").trim();
		String localtion = request.getParameter("localtion").trim();
		String deviceKey = request.getParameter("deviceKey").trim();
		
		try {
			String result = CloudClient.getInstance().client.addSensingDevice(projectid ,deviceName ,mac ,protocol ,description , localtion, deviceKey);
			if (result.contains("success")) {
				out.println("<script>alert('传感设备添加成功!');location.href='ViewProject?projectid="+projectid+"';</script>");
			}
			else if(result.contains("exist")){
				out.println("<script>alert('该项目不存在!');location.href='ViewProject?projectid="+projectid+"';</script>");
			}
			else {
				out.println("<script>alert('未知错误!');location.href='ViewProject?projectid="+projectid+"';</script>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			out.close();
		}
	}

}
