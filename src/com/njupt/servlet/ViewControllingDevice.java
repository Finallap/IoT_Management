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

import com.njupt.bean.Configlog;
import com.njupt.bean.Configtype;
import com.njupt.bean.Controllingdevice;
import com.njupt.client.CloudClient;

/**
 * Servlet implementation class ViewControllingDevice
 */
@WebServlet("/ViewControllingDevice")
public class ViewControllingDevice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewControllingDevice() {
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
				
				String ConfigTypeListString = CloudClient.getInstance().client.getConfigTypeListByDeviceID(deviceid);
				JSONObject ConfigTypeListObject = JSONObject.fromObject(ConfigTypeListString); 
				JSONArray ConfigTypeArray = ConfigTypeListObject.getJSONArray("ConfigTypeList");
				ArrayList<Configtype> ConfigTypeList = new ArrayList<Configtype>();
				if (ConfigTypeArray.size()>0) {
					for (int i = 0; i <ConfigTypeArray.size(); i++) {
						Configtype Configtype = new Configtype();
						Configtype = (Configtype)JSONObject.toBean(ConfigTypeArray.getJSONObject(i), Configtype.class);
						ConfigTypeList.add(Configtype);
					}
				}
				request.setAttribute("ConfigTypeList", ConfigTypeList);
				
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				Calendar cal = Calendar.getInstance();
				cal.add(Calendar.YEAR, +20);
				String end_day =  format.format(cal.getTime());
				cal.add(Calendar.YEAR, -40);
				String start_day = format.format(cal.getTime());
				
				ArrayList<Configlog> ConfigLogList = new ArrayList<Configlog>();
				String ConfigLogListJsonString = CloudClient.getInstance().client.getConfigLogByDeviceID(deviceid, start_day, end_day, 20, 0);
				if (ConfigLogListJsonString.contains("success")) {
					JSONObject ConfigLogListJsonObject = JSONObject.fromObject(ConfigLogListJsonString);
					if(ConfigLogListJsonObject.get("ConfigLogList")!=null){
						JSONArray ConfigLogListArray = ConfigLogListJsonObject.getJSONArray("ConfigLogList");
						if (ConfigLogListArray.size()>0) {
							for (int i = 0; i <ConfigLogListArray.size(); i++) {
								Configlog ConfigLog = new Configlog();
								ConfigLog = (Configlog)JSONObject.toBean(ConfigLogListArray.getJSONObject(i), Configlog.class);
							
								ConfigLogList.add(ConfigLog);
							}
						}
					}
					request.setAttribute("ConfigLogList", ConfigLogList);
				}
				
				request.getRequestDispatcher("ViewControllingDevice.jsp").forward(request, response);
			}
			else {
				out.println("<script>alert('³öÏÖ´íÎó!');location.href='ControllingDeviceProfile';</script>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			out.close();
		}
	}

}
