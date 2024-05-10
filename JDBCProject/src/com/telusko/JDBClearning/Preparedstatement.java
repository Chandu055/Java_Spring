package com.telusko.JDBClearning;

import java.sql.*;
import java.util.Scanner;

public class Preparedstatement 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Statement statement=null;
		//Load and Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the Connection		
		String url="jdbc:mysql://localhost:3306/jdbclearning";
		String user="root";
		String password="chandu@055";
		
		Connection connect=DriverManager.getConnection(url,user,password); //connection object
		
		//creating statement
		String sql="INSERT INTO studentinfo(id, sname, sage, scity) VALUES(?,?,?,?)"; //To get values from console during Run time
		PreparedStatement pstmnt=connect.prepareStatement(sql);
		

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter student ID");
		int id=scan.nextInt();
		
		System.out.println("Enter student name");
		String name=scan.next();	
		
		System.out.println("Enter student age");
		int age=scan.nextInt();		

		System.out.println("Enter Student city");
		String city=scan.next();
	
		pstmnt.setInt(1, id);  //Passing values from user to placeholder(?)
		pstmnt.setString(2, name);
		pstmnt.setInt(3, age);
		pstmnt.setString(4, city);
		
		
		int rowsaffected=pstmnt.executeUpdate();
		if (rowsaffected==0) 
		{
		System.out.println("Data not updated");	
		}
		else
			System.out.println("Data updated");	
		
		connect.close();
		
		
		
			
		
	}
}
