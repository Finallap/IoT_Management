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
 * Servlet implementation class DeleteProject
 */
@WebServlet("/DeleteSensingDevice")
public class DeleteSensingDevice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteSensingDevice() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("GBK"); 
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		int userid =  Integer.parseInt(session.getAttribute("userid").toString());
		
		int deviceid = Integer.parseInt(request.getParameter("deviceid").trim());
		
		
		try {
			String result = CloudClient.getInstance().client.deleteSensingDevice(deviceid);
			if (result.contains("success")) {
				out.println("<script>alert('传感设备删除成功!');location.href='SensingDeviceProfile?currentPage=1';</script>");
			}
			else if(result.contains("exist")){
				out.println("<script>alert('该控制设备不存在!');location.href='SensingDeviceProfile?currentPage=1';</script>");
			}
			else {
				out.println("<script>alert('未知错误!');location.href='SensingDeviceProfile?currentPage=1';</script>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			out.close();
		}
	}

}
