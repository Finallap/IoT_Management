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
import com.njupt.bean.Datatype;
import com.njupt.bean.Sensingdevice;
import com.njupt.client.CloudClient;

/**
 * Servlet implementation class ViewSensingDevice
 */
@WebServlet("/ViewSensingDevice")
public class ViewSensingDevice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewSensingDevice() {
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
			String jsonString = CloudClient.getInstance().client.getSensingDeviceByDeviceID(deviceid);
			System.out.println(jsonString);
			if (jsonString.contains("success")) {
				JSONObject jsonObject = JSONObject.fromObject(jsonString); 
				JSONObject deviceObject = (JSONObject) jsonObject.get("SensingDevice");
				Sensingdevice device = (Sensingdevice)JSONObject.toBean(deviceObject, Sensingdevice.class);
				request.setAttribute("device", device);
				
				String DataTypeListString = CloudClient.getInstance().client.getDataTypeListByDeviceID(deviceid);
				JSONObject DataTypeListObject = JSONObject.fromObject(DataTypeListString); 
				JSONArray DataTypeArray = DataTypeListObject.getJSONArray("DataTypeList");
				ArrayList<Datatype> DataTypeList = new ArrayList<Datatype>();
				if (DataTypeArray.size()>0) {
					for (int i = 0; i <DataTypeArray.size(); i++) {
						Datatype datatype = new Datatype();
						datatype = (Datatype)JSONObject.toBean(DataTypeArray.getJSONObject(i), Datatype.class);
						DataTypeList.add(datatype);
					}
				}
				request.setAttribute("DataTypeList", DataTypeList);
				
				request.getRequestDispatcher("ViewSensingDevice.jsp").forward(request, response);
			}
			else {
				out.println("<script>alert('���ִ���!');location.href='SensingDeviceProfile';</script>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			out.close();
		}
	}

}
