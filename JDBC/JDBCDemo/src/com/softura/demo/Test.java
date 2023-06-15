package com.softura.demo;
// Write a JDBC code : Using statement
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) {
		try {
			String sql="insert into user(lastName,firstName,address,city,salary)values('mane','anurath','ulwe','mumbai',100000);";
			// load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			// establish connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","Skmania@1234");
			//create the statemnt
			Statement statement = con.createStatement();
			//submit the query
			statement.execute(sql);
			System.out.println("Insertion succesfully..");
			// close the resources
			con.close();
			statement.close();
			System.out.println("Static Query vs Dynamic Query.the sql query without positional parametr(?) called as static query. ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
