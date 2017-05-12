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

import com.njupt.bean.Configtype;
import com.njupt.bean.Controllingdevice;
import com.njupt.bean.Devicedata;
import com.njupt.bean.PageBean;
import com.njupt.bean.Sensingdevice;
import com.njupt.client.CloudClient;

/**
 * Servlet implementation class DataView
 */
@WebServlet("/DataView")
public class DataView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DataView() {
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
			String jsonString = CloudClient.getInstance().client.queryUserSensingDevice(userid, 0, 0);
			if (jsonString.contains("success")) {
				JSONObject jsonObject = JSONObject.fromObject(jsonString); 
				JSONArray DeviceArray = jsonObject.getJSONArray("SensingDeviceList");
				ArrayList<Sensingdevice> SensingDeviceList = new ArrayList<Sensingdevice>();
				if (DeviceArray.size()>0) {
					//如果没有设备id输入，则设置id为第一个
					if(deviceid==0){
						Sensingdevice firstDevice = (Sensingdevice)JSONObject.toBean(DeviceArray.getJSONObject(0), Sensingdevice.class);
						deviceid = firstDevice.getSensingDeviceId();
					}
					
					//设备列表
					for (int i = 0; i <DeviceArray.size(); i++) {
						Sensingdevice sensingDevice = new Sensingdevice();
						sensingDevice = (Sensingdevice)JSONObject.toBean(DeviceArray.getJSONObject(i), Sensingdevice.class);
						
						SensingDeviceList.add(sensingDevice);
					}
				}
				request.setAttribute("SensingDeviceList", SensingDeviceList);
				
				//选中设备
				String DeviceString = CloudClient.getInstance().client.getSensingDeviceByDeviceID(deviceid);
				if (DeviceString.contains("success")) {
					JSONObject DeviceJsonObject = JSONObject.fromObject(DeviceString); 
					JSONObject deviceObject = (JSONObject) DeviceJsonObject.get("SensingDevice");
					Sensingdevice device = (Sensingdevice)JSONObject.toBean(deviceObject, Sensingdevice.class);
					request.setAttribute("device", device);
				}
//				else {
//					out.println("<script>alert('参数错误:未找到该传感器!');location.href='DataView';</script>");
//				}

				ArrayList<Devicedata> DataLogList = new ArrayList<Devicedata>();
				String DataLogListJsonString = CloudClient.getInstance().client.getDataLogByDeviceID(deviceid, start_day, end_day, pageSize, (currentPage-1)*pageSize);
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
					count = DataLogListJsonObject.getInt("count");
				}
				
				PageBean page = new PageBean();
			    page.setContentData(DataLogList);
			    page.setTotalRecords(count);
			    page.setCurrentPage(currentPage);
			    page.setPageSize(pageSize);
			     
			    request.setAttribute("pagebean", page);
				
				request.getRequestDispatcher("DataView.jsp").forward(request, response);
			}
			else {
				out.println("<script>alert('出现错误!');location.href='DataView';</script>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			out.close();
		}
	}

}
