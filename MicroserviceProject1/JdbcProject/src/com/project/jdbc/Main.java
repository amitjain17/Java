package com.project.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		System.out.println("Working...");
		
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/microservice","root","admin");
		
		String sql = "select * from user_data where name= ?";
		 
		/*
		 * Statement stmt=con.createStatement(); 
		 * ResultSet rs=stmt.executeQuery("select * from user_data"); //Move the cursor then Print
		 * rs.next(); System.out.println(rs.getString(2));
		 */
		
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, "firstUser");
		ResultSet rs = pst.executeQuery();
		rs.next(); 
		System.out.println(rs.getString(1));
		con.close();

	}

}
