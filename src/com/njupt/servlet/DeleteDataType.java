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
 * Servlet implementation class DeleteDataType
 */
@WebServlet("/DeleteDataType")
public class DeleteDataType extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteDataType() {
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
		int typeid = Integer.parseInt(request.getParameter("typeid").trim());
		
		
		try {
			String result = CloudClient.getInstance().client.deleteDataType(typeid);
			if (result.contains("success")) {
				out.println("<script>alert('数据类型删除成功!');location.href='ViewSensingDevice?deviceid="+deviceid+"';</script>");
			}
			else if(result.contains("exist")){
				out.println("<script>alert('该数据类型不存在!');location.href='ViewSensingDevice?deviceid="+deviceid+"';</script>");
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
