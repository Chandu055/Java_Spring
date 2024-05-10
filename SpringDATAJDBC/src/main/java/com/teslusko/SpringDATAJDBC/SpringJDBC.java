package com.teslusko.SpringDATAJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SpringJDBC 
{
	@Autowired
	private JdbcTemplate jdbc;      // To avoid boiler plate code
	
	public void insert() 
	{
		String sql= "INSERT INTO employeedetails (id, ename, officename, salary)" + "VALUES (1, 'chandu','Streebo', 96000)";
		jdbc.update(sql); 
		System.out.println("insertion option is done");
	}
	



}
