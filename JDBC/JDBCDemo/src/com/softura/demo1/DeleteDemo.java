package com.softura.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","Skmania@1234");
			PreparedStatement p = con.prepareStatement("delete from employee where id =? ");
			p.setInt(1, 2);
			int i = p.executeUpdate();
			System.out.println("deleted success..."+i);
			p.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
