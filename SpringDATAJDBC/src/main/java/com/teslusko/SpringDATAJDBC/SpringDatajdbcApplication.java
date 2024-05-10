package com.teslusko.SpringDATAJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDatajdbcApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext container = SpringApplication.run(SpringDatajdbcApplication.class, args);
		 
		  SpringJDBC jdbc = container.getBean(SpringJDBC.class);
		  jdbc.insert();
		 
	}

}
