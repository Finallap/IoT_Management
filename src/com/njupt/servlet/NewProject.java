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
 * Servlet implementation class NewProject
 */
@WebServlet("/NewProject")
public class NewProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewProject() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("NewProject.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("GBK"); 
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		int userid =  Integer.parseInt(session.getAttribute("userid").toString());
		
		String projectname = request.getParameter("projectname").trim();
		String ispublic =  request.getParameter("ispublic").trim();
		String projectkey = request.getParameter("projectkey").trim();
		
		boolean publicstatus = false;
		if(ispublic.equals("1"))
			publicstatus = true;
			
		if(projectname==null||ispublic==null||projectkey==null){ 
			out.println("<script>alert('存在空参数!');location.href='NewProject.jsp';</script>");
		}
		
		String result;
		
		try {
			result = CloudClient.getInstance().client.addProject(userid, projectname, publicstatus, projectkey);
			if (result.contains("success")) {
				out.println("<script>alert('项目添加成功!');location.href='ProjectProfile';</script>");
			}
			else if(result.contains("exist")){
				out.println("<script>alert('该用户不存在!');location.href='NewProject';</script>");
			}
			else {
				out.println("<script>alert('未知错误!');location.href='NewProject';</script>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			out.close();
		}
	}

}
