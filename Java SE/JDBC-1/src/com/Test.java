package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Test {

	public static void main(String[] args) {

		try {

			// DriverManager.registerDriver(new Driver());
			// System.out.println("--- Driver class loaded");
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("com.mysql.jdbc.Driver");
			// System.out.println("--- Driver class loaded ");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			// Connection
			// con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			// System.out.println("--- Connection success with
			// "+con.getMetaData().getDatabaseProductName());
			
			Statement stmt=con.createStatement();
			String qry="insert into book values(22,'Mac Book',250000)";
			int res=stmt.executeUpdate(qry);
			System.out.println(res+" Record(s) updated");
			
			
			

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

	}

}
