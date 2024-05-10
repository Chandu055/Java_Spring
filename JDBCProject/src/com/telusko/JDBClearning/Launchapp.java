package com.telusko.JDBClearning;

import java.sql.*;

public class Launchapp 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Load and Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the Connection		
		String url="jdbc:mysql://localhost:3306/jdbclearning";
		String user="root";
		String password="chandu@055";
		
		Connection connect=DriverManager.getConnection(url,user,password); //connection object
		
		//creating statement
		Statement statement=connect.createStatement();
		
		//execute query
//		String sql="INSERT INTO studentinfo(id, sname, sage, scity) VALUES(1, 'Rohan',  19, 'Kolkata')"; // To Insert the data
		
//		String sql="UPDATE studentinfo set sage=24 where id=1";		// TO UPDATE the data	
		
		String sql= "DELETE FROM studentinfo where id=1";
		int rowsaffected=statement.executeUpdate(sql);  			//Updation Insertion Deleteion-- This gives return of premitive Integer (ie.,how many rows affected)

		
//		ResultSet set=statement.executeQuery(sql);  				//To retrieve the data from SQL
		
		
		//process the result 
//		while(set.next())  
//		{			System.out.println(set.getInt(1) + " " + set.getString(2)); //Either u can give column nu. (1,2) or column name as (is, sname) }
		
		if (rowsaffected==0) 
		{
		System.out.println("Rows not deleted");	
		}
		else
			System.out.println("Rows  deleted");	
				
		
//		set.close();
		statement.close();
		connect.close();
		
		
		
			
		
	}
}
