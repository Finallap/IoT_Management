package com.njupt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;

import com.njupt.client.CloudClient;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("login.jsp").forward(request, response);
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
		
		if(username==null||password==null){
			out.println("<script>alert('参数为空!');location.href='Login';</script>");
		}
		
		String result;
		
		try {
			result = CloudClient.getInstance().client.getPermission(username, password);
			if (result.contains("success")) {
				HttpSession session = request.getSession();
				session.setAttribute("username", username.trim());
				
				String jsonString = CloudClient.getInstance().client.getUserByUserName(username);
				JSONObject jsonObject = new JSONObject(jsonString);
				if(jsonObject.getString("status").equals("success")){
					JSONObject userJsonObject = (JSONObject) jsonObject.get("User");
					int userId = userJsonObject.getInt("userId");
					session.setAttribute("userid", userId);
				}
				
//				request.getRequestDispatcher("index.jsp").forward(request, response);
				response.sendRedirect(request.getContextPath()+"/index");
			}
			else {
				out.println("<script>alert('用户名或密码错误!');location.href='Login';</script>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			out.close();
		}
	}

}
