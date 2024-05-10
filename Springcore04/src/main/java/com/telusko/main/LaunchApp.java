package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp {

	public static void main(String[] args)
	{
		
		//To activate Spring framework(XML file)--- container is ref variable
		 ApplicationContext container = new ClassPathXmlApplicationContext("Applicationconfig.xml"); //Mention file name in brackets
		 
		 //To create Amazon object by bean
		 Amazon amz=container.getBean(Amazon.class);
		 
		 boolean status=amz.delivertheproduct(30);	
			if(status)
				System.out.println("Delivered");
			else 
				System.out.println("failed");
				 
	}
	
}
