package com.webclient.test;

import client.DaoDelegate;
import client.DaoService;



public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaoService ds = new DaoService();	
		DaoDelegate dd= ds.getDaoPort();
		dd.insertstudent("sss");
		String s = dd.sayHello();
		System.out.println(s);
		System.out.println(dd.getStudentnamebyID(2));
	}

}
