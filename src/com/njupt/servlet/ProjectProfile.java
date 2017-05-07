package com.njupt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.njupt.bean.PageBean;
import com.njupt.bean.Project;
import com.njupt.client.CloudClient;


/**
 * Servlet implementation class ProjectProfile
 */
@WebServlet("/ProjectProfile")
public class ProjectProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProjectProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("GBK"); 
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		int pageSize = 8;
		int currentPage = 1;
//		String currentPageString=request.getParameter("currentPage").trim();
//		if(currentPageString==null)
//			currentPageString = "1";
		
		int userid =  Integer.parseInt(session.getAttribute("userid").toString());
		
		try {
			String jsonString = CloudClient.getInstance().client.queryProject(userid, -1, 0);
			System.out.println(jsonString);
			if (jsonString.contains("success")) {
				JSONObject jsonObject = JSONObject.fromObject(jsonString); 
				JSONArray projectArray = jsonObject.getJSONArray("ProjectList");
				
				ArrayList<Project> list = new ArrayList<Project>();

				if (projectArray.size()>0) {
					for (int i = 0; i <projectArray.size(); i++) {
						Project project = new Project();
						project = (Project)JSONObject.toBean(projectArray.getJSONObject(i), Project.class);
						
						list.add(project);
					}
				}
				
				PageBean page = new PageBean();
			    page.setContentData(list);
			    page.setTotalRecords(jsonObject.getInt("count"));
			    page.setCurrentPage(currentPage);
			    page.setPageSize(pageSize);
			     
			    request.setAttribute("pagebean", page);
				
				request.getRequestDispatcher("ProjectProfile.jsp?currentPage=1").forward(request, response);
//				response.sendRedirect(request.getContextPath()+"/index.jsp");
			}
			else {
				out.println("<script>alert('³öÏÖ´íÎó!');location.href='ProjectProfile';</script>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			out.close();
		}
	}

}
