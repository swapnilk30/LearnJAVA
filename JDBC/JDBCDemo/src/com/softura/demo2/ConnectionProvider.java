package com.softura.demo2;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	Connection con=null;
	public Connection getConnectionDetails() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","Skmania@1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
