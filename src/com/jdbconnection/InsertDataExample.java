package com.jdbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDataExample {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043", "root", "Payal@123");
		PreparedStatement ps = c.prepareStatement("INSERT INTO STUDENT(rollNo, sName , city) VALUES(? , ? , ? )");
		ps.setInt(1, 106);
		ps.setString(2, "Om");
		ps.setString(3, "mumbai");
		ps.executeUpdate();

		System.out.println("Data Inserted Successfully..!!");

	}

}
