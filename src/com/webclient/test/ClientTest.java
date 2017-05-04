package com.webclient.test;

import com.njupt.service.ServiceDelegate;
import com.njupt.service.ServiceService;




public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiceService ds = new ServiceService();	
		ServiceDelegate dd= ds.getServicePort();
//		dd.insertstudent("sss");
//		String s = dd.sayHello();
//		System.out.println(s);
//		System.out.println(dd.getStudentnamebyID(1));
	}

}
