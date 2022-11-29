package com.hcl.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hcl.cms.beans.User;


public class UserDaoImp implements IUserDao {

	Connection conn = DBFactory.getDBConnection();

	PreparedStatement pstmt;

	@Override
	public int addUser(User user) {

		String insertQuery = "insert into user_table(userid,username,password) values(?,?,?)";

		int count = 0;

		try {

			pstmt = conn.prepareStatement(insertQuery);

			pstmt.setInt(1, user.getUserId() );
			pstmt.setString(2,user.getUserName() );
			pstmt.setString(3,user.getPassword() );

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public List<User> getAllUser() {
			List<User>  userList  = null;
		
		try {
			
			String selectAllQuery = "select * from user_table";

			pstmt = conn.prepareStatement(selectAllQuery);

				ResultSet rs =	pstmt.executeQuery();
				
				userList = new ArrayList<User>();
				
				while(rs.next()) {
					
				int userId =	rs.getInt("userid");
				String userName =	rs.getString("username");
				String password =	rs.getString("password");
				
				User user = new User();
					
					user.setUserId(userId);
					user.setUserName(userName);
					user.setPassword(password);
					
					
					userList.add(user);
					
					
				}
				

			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
		
		return userList;
	}

}
