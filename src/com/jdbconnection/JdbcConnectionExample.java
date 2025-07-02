package com.jdbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnectionExample {

	// Firstly add mysql.connector.jar file (8 version)

	public static void main(String[] args) throws Exception {

		// 1.Register and load Driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver class loaded Successfully..!!");

		// 2.Establish a connection

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043", "root", "Payal@123");
		// ( Replace with your DB name,username,password)

		System.out.println("Connection build Successfully..!!");

		// 3. jdbc Statement (Statement / PrepareStatment)

		Statement s = c.createStatement();

		// 4. Execute the Query (execute/executeUpdate/executeQuery)

		ResultSet rs = s.executeQuery("select * from Student"); //"select * from your_table_name"

		while (rs.next()) {
			System.out.println(" " + rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}
		
		//5.Close all Connection
		c.close();
	}

}
