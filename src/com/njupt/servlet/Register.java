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
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.sendRedirect(request.getContextPath()+"/register.jsp");
		request.getRequestDispatcher("register.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("GBK"); 
		PrintWriter out = response.getWriter();
		
		String username=request.getParameter("username").trim();
		String password=request.getParameter("password").trim();
		String email=request.getParameter("email").trim();
		
		if(username==null||password==null||email==null){ 
			out.println("<script>alert('存在空参数!');location.href='Register';</script>");
		}
		
		String result;
		
		try {
			result = CloudClient.getInstance().client.userRegister(username, password, email);
			if (result.contains("success")) {
				out.println("<script>alert('注册成功!');location.href='index';</script>");
				
				HttpSession session = request.getSession();
				session.setAttribute("username", username.trim());
			}
			else if(result.contains("exist")){
				out.println("<script>alert('改用户名已存在!');location.href='Register';</script>");
			}
			else {
				out.println("<script>alert('未知注册错误!');location.href='Register';</script>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			out.close();
		}
	}

}
