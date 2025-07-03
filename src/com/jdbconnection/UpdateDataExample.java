package com.jdbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdateDataExample {

	public static void main(String[] args) throws Exception {

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043", "root", "Payal@123");

		PreparedStatement ps = c.prepareStatement("update student set sname =? where rollNo =?");

		ps.setString(1, "Smith");
		ps.setInt(2, 106);
		ps.executeUpdate();

		System.out.println("Data Updated Successfully..!");

		PreparedStatement ps1 = c.prepareStatement("select * from student");

		ResultSet rs = ps1.executeQuery();

		while (rs.next()) {

			System.out.println(" " + rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}

		System.out.println("Data Fetched Successfully..!");

	}

}
