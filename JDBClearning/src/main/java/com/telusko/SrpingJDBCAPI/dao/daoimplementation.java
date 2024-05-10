package com.telusko.SrpingJDBCAPI.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("dao")
public class daoimplementation implements Iemployeepersistantlogic

{	@Autowired
	List<employee>employees=new ArrayList<employee>();;
	private DataSource datasource;
	String sql="SELECT * FROM jdbclearning";
	
	public daoimplementation() {
		super();
		System.out.println("Employee dao bean is created");
	}


	
	@Override
	public List<employee> getEmployeesData() 
	{
		
		try {
			Connection connection=datasource.getConnection(); //Connection is from Hikari CP
						
			PreparedStatement pstmnt=connection.prepareStatement(sql);
			ResultSet rs=pstmnt.executeQuery();
			
			
			while (rs.next())
			{
				employee emp=new employee();
				emp.setId(rs.getInt(1));
				emp.setSname(rs.getString(1));
				emp.setSage(rs.getInt(1));
				emp.setScity(rs.getString(1));
				
				employees.add(emp);
			}
			
			
		} 
		
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		
		return employees;
	}

}
