package com.softura.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetrieveDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","Skmania@1234");
			PreparedStatement p = con.prepareStatement("select * from employee");
			ResultSet rs = p.executeQuery();
			while(rs.next()) {
				System.out.println("ID : "+rs.getInt(1));
				System.out.println("userName : "+rs.getString(2));
				System.out.println("password : "+rs.getString(3));
				
			}
			con.close();
			p.close();
			rs.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
