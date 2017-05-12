package com.njupt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;

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
import com.njupt.bean.Devicedata;
import com.njupt.bean.PageBean;
import com.njupt.bean.Sensingdevice;
import com.njupt.client.CloudClient;

/**
 * Servlet implementation class LogView
 */
@WebServlet("/LogView")
public class LogView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogView() {
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
		Map<String, String[]> params = request.getParameterMap();
		
		int pageSize = 10;
		int currentPage = 1;
		int deviceid = 0;
		int count = 0;
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		String end_day =  format.format(cal.getTime());
		cal.add(Calendar.DAY_OF_MONTH, -21);
		String start_day = format.format(cal.getTime());

		for (String key : params.keySet()) {
			String[] values = params.get(key);
			for (int i = 0; i < values.length; i++) {
				if(key.equals("currentPage"))currentPage = Integer.parseInt(values[i]);
				if(key.equals("deviceid"))deviceid = Integer.parseInt(values[i]);
				if(key.equals("start_day"))start_day = values[i];
				if(key.equals("end_day"))end_day = values[i];
//				System.out.println(key + "=" + values[i] );
			}
		}
		request.setAttribute("currentDeviceID", deviceid);
		request.setAttribute("start_day", start_day);
		request.setAttribute("end_day", end_day);

		int userid =  Integer.parseInt(session.getAttribute("userid").toString());
		
		try {
			String jsonString = CloudClient.getInstance().client.queryUserControllingDevice(userid, -1, 0);
			if (jsonString.contains("success")) {
				JSONObject jsonObject = JSONObject.fromObject(jsonString); 
				JSONArray DeviceArray = jsonObject.getJSONArray("ControllingDeviceList");
				ArrayList<Controllingdevice> ControllingDeviceList = new ArrayList<Controllingdevice>();
				if (DeviceArray.size()>0) {
					//如果没有设备id输入，则设置id为第一个
					if(deviceid==0){
						Controllingdevice firstDevice = (Controllingdevice)JSONObject.toBean(DeviceArray.getJSONObject(0), Controllingdevice.class);
						deviceid = firstDevice.getControllingDeviceId();
					}
					
					//设备列表
					for (int i = 0; i <DeviceArray.size(); i++) {
						Controllingdevice controllingDevice = new Controllingdevice();
						controllingDevice = (Controllingdevice)JSONObject.toBean(DeviceArray.getJSONObject(i), Controllingdevice.class);
						
						ControllingDeviceList.add(controllingDevice);
					}
				}
				request.setAttribute("ControllingDeviceList", ControllingDeviceList);
				
				//选中设备
				String DeviceString = CloudClient.getInstance().client.getControllingDeviceByDeviceID(deviceid);
				if (DeviceString.contains("success")) {
					JSONObject DeviceJsonObject = JSONObject.fromObject(DeviceString); 
					JSONObject deviceObject = (JSONObject) DeviceJsonObject.get("ControllingDevice");
					Controllingdevice device = (Controllingdevice)JSONObject.toBean(deviceObject, Controllingdevice.class);
					request.setAttribute("device", device);
				}
//				else {
//					out.println("<script>alert('参数错误:未找到该传感器!');location.href='DataView';</script>");
//				}
				
				ArrayList<Configlog> ConfigLogList = new ArrayList<Configlog>();
				String ConfigLogListJsonString = CloudClient.getInstance().client.getConfigLogByDeviceID(deviceid, start_day, end_day, pageSize, (currentPage-1)*pageSize);
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
					count = ConfigLogListJsonObject.getInt("count");
				}
				
				PageBean page = new PageBean();
			    page.setContentData(ConfigLogList);
			    page.setTotalRecords(count);
			    page.setCurrentPage(currentPage);
			    page.setPageSize(pageSize);
			     
			    request.setAttribute("pagebean", page);
				
				request.getRequestDispatcher("LogView.jsp").forward(request, response);
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

}
