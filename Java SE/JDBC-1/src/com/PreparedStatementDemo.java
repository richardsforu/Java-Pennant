package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
public class PreparedStatementDemo {

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
			
			//Statement stmt=con.createStatement();
			String qry="insert into book values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(qry);
			
			ps.setInt(1, 23);
			ps.setString(2, "Hibernate Book");
			ps.setDouble(3, 3846834);
			
			int res=ps.executeUpdate();
			System.out.println(res+" Record(s) updated");
			
			
			

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

	}

}
