package com.softura.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

// Write a JDBC code : Using prepared statement
public class InsertDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","Skmania@1234");
			PreparedStatement p = con.prepareStatement("insert into employee(userName,password)values(?,?)");
			p.setString(1, "QAZX");
			p.setString(2, "@1234");
			//p.execute();
			int i = p.executeUpdate();//
			System.out.println("Done..."+ i);
			//con.close();
			//p.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
