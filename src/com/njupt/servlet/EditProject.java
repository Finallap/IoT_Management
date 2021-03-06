package com.njupt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import com.njupt.bean.Project;
import com.njupt.client.CloudClient;

/**
 * Servlet implementation class EditProject
 */
@WebServlet("/EditProject")
public class EditProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditProject() {
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
		
		int projectid = Integer.parseInt(request.getParameter("projectid").trim());
		
		int userid =  Integer.parseInt(session.getAttribute("userid").toString());
		
		try {
			String jsonString = CloudClient.getInstance().client.getProjectByProjectID(projectid);
			System.out.println(jsonString);
			if (jsonString.contains("success")) {
				JSONObject jsonObject = JSONObject.fromObject(jsonString); 
				JSONObject projectObject = (JSONObject) jsonObject.get("Project");
				Project project = (Project)JSONObject.toBean(projectObject, Project.class);
		     
				request.setAttribute("project", project);
				
				request.getRequestDispatcher("EditProject.jsp").forward(request, response);
			}
			else {
				out.println("<script>alert('出现错误!');location.href='ProjectProfile';</script>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			out.close();
		}
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
		
		int projectid = Integer.parseInt(request.getParameter("projectid").trim());
		
		String projectname = request.getParameter("projectname").trim();
		String ispublic =  request.getParameter("ispublic").trim();
		String projectkey = request.getParameter("projectkey").trim();
		
		boolean publicstatus = false;
		if(ispublic.equals("1"))
			publicstatus = true;
			
		if(projectname==null||ispublic==null||projectkey==null){
			out.println("<script>alert('存在空参数!');location.href='ProjectProfile';</script>");
		}
		
		String result;
		
		try {
			result = CloudClient.getInstance().client.updateProject(projectid, projectname, publicstatus);
			if (result.contains("success")) {
				out.println("<script>alert('项目信息修改成功!');location.href='ProjectProfile';</script>");
			}
			else if(result.contains("exist")){
				out.println("<script>alert('该项目不存在!');location.href='ProjectProfile';</script>");
			}
			else {
				out.println("<script>alert('未知错误!');location.href='ProjectProfile';</script>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			out.close();
		}
	}

}
