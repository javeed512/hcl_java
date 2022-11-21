package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDemo {

	public static void main(String[] args) {
		Connection conn = null;

		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			// 2. Get Connection

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "admin");

			String selectOne= "select * from product where pid = ?";
			
			String selectAll = "select * from product";
				PreparedStatement pstmt  = conn.prepareStatement(selectAll);
			
					//pstmt.setInt(1, 101);
				
				ResultSet rs =	pstmt.executeQuery();
			
					while(rs.next()) {
						
	System.out.println(rs.getInt(1)+" "+ rs.getString("pname")+"  "+rs.getDouble("price")+"  "+rs.getDate("dop"));
						
						
					}
				
				
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
