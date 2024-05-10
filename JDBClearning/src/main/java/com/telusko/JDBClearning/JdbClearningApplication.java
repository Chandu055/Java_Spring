package com.telusko.JDBClearning;

import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.telusko.SrpingJDBCAPI.dao.daoimplementation;
import com.telusko.SrpingJDBCAPI.dao.employee;

@SpringBootApplication
public class JdbClearningApplication {

	public static void main(String[] args) {
		
		
		ApplicationContext container=SpringApplication.run(JdbClearningApplication.class, args);
		daoimplementation dao=container.getBean(daoimplementation.class);
		
//		List<employee>employeesdata=dao.getEmployeesData();		
//		Iterator<employee> itr=employeesdata.iterator();		
//		while(itr.hasNext()) 
//		{
//			System.out.println(itr.next());
//		}
		
		dao.getEmployeesData().forEach(e->System.out.println(e));  //Combination of Stream API (for each-- to iterate) and Lambda expression(e->Sysout)
		
	}

}
