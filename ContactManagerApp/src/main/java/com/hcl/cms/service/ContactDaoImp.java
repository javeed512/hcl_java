package com.hcl.cms.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hcl.cms.beans.Contact;
import com.hcl.cms.beans.User;
import com.hcl.cms.dao.DBFactory;

public class ContactDaoImp implements IContactDao {

	Connection conn = DBFactory.getDBConnection();

	PreparedStatement pstmt;

	@Override
	public int addContact(Contact contact) {

		String insertQuery = "insert into contact_table(contactNumber,contactName,email,address) values(?,?,?,?)";

		int count = 0;

		try {

			pstmt = conn.prepareStatement(insertQuery);

			pstmt.setLong(1, contact.getContactNumber() );
			pstmt.setString(2,contact.getContactName() );
			pstmt.setString(3,contact.getEmail() );
			pstmt.setString(4, contact.getAddress());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
	}


}
