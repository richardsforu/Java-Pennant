package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class BatchUpdates {

	public static void main(String[] args) {

		try {

			// DriverManager.registerDriver(new Driver());
			// System.out.println("--- Driver class loaded");
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			//Class.forName("com.mysql.jdbc.Driver");
			// System.out.println("--- Driver class loaded ");

			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			con.setAutoCommit(false);
			
			
			
			
			Statement stmt=con.createStatement();
			
			String qry1="insert into BOOK values(5,'Java','Mac')";
			String qry2="update book set book_title='Hibernate' where book_id=1";
			String qry3="delete from BOOK where book_id=3";
			
			stmt.addBatch(qry1);
			stmt.addBatch(qry2);
			stmt.addBatch(qry3);
			
			int res[]=stmt.executeBatch();
			
			int count=0;
			for(int i=0;i<res.length;i++) {
				if(res[i]==1) {
					count++;
				}
			}
			
			boolean flag=true;
			for(int i=0;i<res.length;i++) {
				if(res[i]==0) {
					flag=false;
				}
			}
			
			if(flag) {
				con.commit();
			}else {
				con.rollback();
			}
			
			System.out.println(count+" statements executed");
			//int res=stmt.executeUpdate(qry);
			//System.out.println(res+" Record(s) updated");
			
			
			System.out.println("-- Done --");
			
			

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

	}

}
