package com.softura.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","Skmania@1234");
			PreparedStatement p = con.prepareStatement("update employee set userName=? ,password=? where id=? ");
			p.setString(1, "swapnil");
			p.setString(2, "abc@123");
			p.setInt(3, 2);
			int i = p.executeUpdate();
			System.out.println("record updated...."+i);
			p.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
