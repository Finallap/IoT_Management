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

import com.njupt.bean.Controllingdevice;
import com.njupt.client.CloudClient;

/**
 * Servlet implementation class EditControllingDevice
 */
@WebServlet("/EditControllingDevice")
public class EditControllingDevice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditControllingDevice() {
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
		
		int deviceid = Integer.parseInt(request.getParameter("deviceid").trim());
		
		int userid =  Integer.parseInt(session.getAttribute("userid").toString());
		
		try {
			String jsonString = CloudClient.getInstance().client.getControllingDeviceByDeviceID(deviceid);
			System.out.println(jsonString);
			if (jsonString.contains("success")) {
				JSONObject jsonObject = JSONObject.fromObject(jsonString); 
				JSONObject deviceObject = (JSONObject) jsonObject.get("ControllingDevice");
				Controllingdevice device = (Controllingdevice)JSONObject.toBean(deviceObject, Controllingdevice.class);

				request.setAttribute("device", device);
				
				request.getRequestDispatcher("EditControllingDevice.jsp").forward(request, response);
			}
			else {
				out.println("<script>alert('出现错误!');location.href='ControllingDeviceProfile?currentPage=1';</script>");
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
		
		int deviceid = Integer.parseInt(request.getParameter("deviceid").trim());
		
		String deviceName = request.getParameter("devicename").trim();
		String mac =  request.getParameter("mac").trim();
		String protocol = request.getParameter("protocol").trim();
		String description = request.getParameter("description").trim();
		String localtion = request.getParameter("localtion").trim();
		String deviceKey = request.getParameter("deviceKey").trim();
		
		try {
			String result = CloudClient.getInstance().client.updateControllingDevice(deviceid ,deviceName ,mac ,protocol ,description ,localtion ,deviceKey);
			if (result.contains("success")) {
				out.println("<script>alert('设备信息修改成功!');location.href='ControllingDeviceProfile?currentPage=1';</script>");
			}
			else if(result.contains("exist")){
				out.println("<script>alert('该设备不存在!');location.href='ControllingDeviceProfile?currentPage=1';</script>");
			}
			else {
				out.println("<script>alert('未知错误!');location.href='ControllingDeviceProfile?currentPage=1';</script>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			out.close();
		}
	}

}
