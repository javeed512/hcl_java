package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class JdbcDemo {

	public static void main(String[] args) {

		// 1. Register Driver , Type4 Driver or Thin Driver

		Connection conn = null;

		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			// 2. Get Connection

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "admin");

			// String insertQuery = "insert into PRODUCT(pid,pname,price,dop)
			// values(?,?,?,current_date)"; // ? positional

			/*
			 * pstmt.setInt(1, 102); pstmt.setString(2, "Laptop"); pstmt.setDouble(3,
			 * 65000.0);
			 */
			// pstmt.setDate(4, new Date(2022,11,21));
			// 4. Write and Execute SQL Query
			// parameter

			// 3. Create any one JDBC Statement

	String update = "update product  set  pname = ? , price = ? , dop =current_date where pid = ?";

			PreparedStatement pstmt = conn.prepareStatement(update);

			pstmt.setString(1, "Smart Mobile Phone");	
			pstmt.setDouble(2, 75000.0);
			
			pstmt.setInt(3,101);
			
			int count = pstmt.executeUpdate();// executing query

			System.out.println(count + " records effected...");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			// 5. close connection

			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
