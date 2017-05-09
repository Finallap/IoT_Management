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

import com.njupt.bean.Controllingdevice;
import com.njupt.bean.Project;
import com.njupt.bean.Sensingdevice;
import com.njupt.client.CloudClient;

/**
 * Servlet implementation class ViewProject
 */
@WebServlet("/ViewProject")
public class ViewProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewProject() {
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
				
				//
				String ControllingDeviceListString = CloudClient.getInstance().client.getControllingDeviceListByProjectID(projectid);
				JSONObject ControllingDeviceListObject = JSONObject.fromObject(ControllingDeviceListString); 
				JSONArray controllingDeviceArray = ControllingDeviceListObject.getJSONArray("ControllingDeviceList");
				ArrayList<Controllingdevice> ControllingDeviceList = new ArrayList<Controllingdevice>();
				if (controllingDeviceArray.size()>0) {
					for (int i = 0; i <controllingDeviceArray.size(); i++) {
						Controllingdevice controllingDevice = new Controllingdevice();
						controllingDevice = (Controllingdevice)JSONObject.toBean(controllingDeviceArray.getJSONObject(i), Controllingdevice.class);
						ControllingDeviceList.add(controllingDevice);
					}
				}
				request.setAttribute("ControllingDeviceList", ControllingDeviceList);
				
				String SensingDeviceListString = CloudClient.getInstance().client.getSensingDeviceListByProjectID(projectid);
				JSONObject SensingDeviceListObject = JSONObject.fromObject(SensingDeviceListString); 
				JSONArray SensingDeviceArray = SensingDeviceListObject.getJSONArray("SensingDeviceList");
				ArrayList<Sensingdevice> SensingDeviceList = new ArrayList<Sensingdevice>();
				if (SensingDeviceArray.size()>0) {
					for (int i = 0; i <SensingDeviceArray.size(); i++) {
						Sensingdevice sensingDevice = new Sensingdevice();
						sensingDevice = (Sensingdevice)JSONObject.toBean(SensingDeviceArray.getJSONObject(i), Sensingdevice.class);
						SensingDeviceList.add(sensingDevice);
					}
				}
				request.setAttribute("SensingDeviceList", SensingDeviceList);
				
				request.getRequestDispatcher("ViewProject.jsp").forward(request, response);
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
