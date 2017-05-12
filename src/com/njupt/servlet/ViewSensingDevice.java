package com.njupt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

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
import com.njupt.bean.Devicedata;
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
				
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				Calendar cal = Calendar.getInstance();
				cal.add(Calendar.YEAR, +20);
				String end_day =  format.format(cal.getTime());
				cal.add(Calendar.YEAR, -40);
				String start_day = format.format(cal.getTime());
				
				ArrayList<Devicedata> DataLogList = new ArrayList<Devicedata>();
				String DataLogListJsonString = CloudClient.getInstance().client.getDataLogByDeviceID(deviceid, start_day, end_day, 20,0);
				if (DataLogListJsonString.contains("success")) {
					JSONObject DataLogListJsonObject = JSONObject.fromObject(DataLogListJsonString);
					if(DataLogListJsonObject.get("DataLogList")!=null){
						JSONArray DataLogListArray = DataLogListJsonObject.getJSONArray("DataLogList");
						if (DataLogListArray.size()>0) {
							for (int i = 0; i <DataLogListArray.size(); i++) {
								Devicedata DataLog = new Devicedata();
								DataLog = (Devicedata)JSONObject.toBean(DataLogListArray.getJSONObject(i), Devicedata.class);
							
								DataLogList.add(DataLog);
							}
						}
					}
					request.setAttribute("DataLogList", DataLogList);
				}
				
				request.getRequestDispatcher("ViewSensingDevice.jsp").forward(request, response);
			}
			else {
				out.println("<script>alert('³öÏÖ´íÎó!');location.href='SensingDeviceProfile';</script>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			out.close();
		}
	}

}
