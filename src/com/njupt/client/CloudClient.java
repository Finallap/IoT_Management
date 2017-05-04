package com.njupt.client;

import com.njupt.service.ServiceDelegate;
import com.njupt.service.ServiceService;

public class CloudClient {
	public ServiceDelegate client;
	
	 private CloudClient() {
		ServiceService service = new ServiceService();	
		client = service.getServicePort();
	 }
	 
	 private static CloudClient single = null;  
	 //静态工厂方法   
	 public static CloudClient getInstance() {
	      if (single == null) {
	          single = new CloudClient();  
	      }
	      return single;
	 }
}
