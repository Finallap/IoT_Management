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
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		HttpSession session = request.getSession();
		
		if(session.getAttribute("username")!=null)
			response.sendRedirect(request.getContextPath()+"/login.jsp");
		else
			response.sendRedirect(request.getContextPath()+"/index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8"); 
		
		String username=request.getParameter("username").trim();
		String password=request.getParameter("password").trim();
		
		if(username==null||password==null){
			out.println("<script>alert('参数为空!');location.href='login.jsp';</script>");
		}
		
		String result;
		
		try {
			result = CloudClient.getInstance().client.getPermission(username, password);
			if (result.contains("success")) {
//				request.getRequestDispatcher("index.jsp").forward(request, response);
				response.sendRedirect(request.getContextPath()+"/index.jsp");
				
				HttpSession session = request.getSession();
				session.setAttribute("username", username.trim());
			}
			else {
				out.println("<script>alert('用户名或密码错误!');location.href='login.jsp';</script>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			out.close();
		}
	}

}
