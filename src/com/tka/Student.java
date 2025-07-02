package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {

	// Firstly add jar file(mysql connector 8)

	public static void main(String[] args) throws Exception {

		// 1st. Register and load the Driver class

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver class loaded successfully..");

		// 2nd. build the Connection

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043", "root", "Payal@123");
		Statement s = c.createStatement();

//		s.executeUpdate("DELETE from student where sname='Shyam'");
//		System.out.println("Data Inserted Sucessfully...");

		ResultSet rs = s.executeQuery("select * from student where rollNo=103");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}

		s.close();

	}

}
