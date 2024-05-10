package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.controller.Weblayer;
import com.telusko.service.Businesslogic;

public class LaunchApplication {
	
	public static void main(String [] args) {

	 ApplicationContext container = new ClassPathXmlApplicationContext("Applicationconfig.xml");
	 
	 Weblayer WBL=container.getBean(Weblayer.class);
	 WBL.disp();
	 
	 Businesslogic blg= (Businesslogic) container.getBean("BLG"); //Downcasting needed as "reference variable of class -BLG" is used to get bean
	 blg.disp();
	 
	}
}
