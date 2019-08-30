package com.sj.jdbcproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con=DriverManager.getConnection(  
					"jdbc:mariadb://localhost:3306/deepna1","root","root"); 
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from student");  
			while(rs.next())  
			System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getString(3)+" " +rs.getString(4));  
			con.close();  
			
			System.out.println("connection obtained");
		} 
		 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
