package com.hcl.springmvc.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hcl.springmvc.crud.beans.Product;

@Repository
public class ProductDaoImp implements IProductDao {

	Connection conn = DBFactory.getDBConnection();

	PreparedStatement pstmt;

	@Override
	public int addProduct(Product product) {

		String insertQuery = "insert into product(pid,pname,price,dop)  values(?,?,?,current_date)";

		int count = 0;

		try {

			pstmt = conn.prepareStatement(insertQuery);

			pstmt.setInt(1, product.getPid());
			pstmt.setString(2, product.getPname());
			pstmt.setDouble(3, product.getPrice());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public int updateProduct(Product product) {
		String updateQuery = "update product set pname = ? , price = ? , dop = current_date where pid =?";

		int count = 0;

		try {

			pstmt = conn.prepareStatement(updateQuery);

		
			pstmt.setString(1, product.getPname());
			pstmt.setDouble(2, product.getPrice());
			pstmt.setInt(3, product.getPid());
			
			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public int deleteProductById(int pid) {
		String deleteQuery = "delete from product where pid = ?";

		int count = 0;

		try {

			pstmt = conn.prepareStatement(deleteQuery);

			pstmt.setInt(1, pid);
			

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count; 
	}

	@Override
	public Product selectProductById(int pid) {
		String selectOne = "select * from product where pid = ?";

		
		Product product = new Product();

		try {

			pstmt = conn.prepareStatement(selectOne);

			pstmt.setInt(1, pid);
			

			ResultSet rs =	pstmt.executeQuery();
			
			
				while(rs.next()) {
					int pid1 =	rs.getInt("pid");
					String pname =	rs.getString("pname");
					double price =	rs.getDouble("price");
					
					
						
						product.setPid(pid1);
						product.setPname(pname);
						product.setPrice(price);
						
						
					
				}
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return product; 
	}
	

	@Override
	public List<Product> selectAll() {

		List<Product>  productList  = null;
		
		try {
			
			String selectAllQuery = "select * from product";

			pstmt = conn.prepareStatement(selectAllQuery);

				ResultSet rs =	pstmt.executeQuery();
				
				productList = new ArrayList<Product>();
				
				while(rs.next()) {
					
				int pid =	rs.getInt("pid");
				String pname =	rs.getString("pname");
				double price =	rs.getDouble("price");
				
				Product product = new Product();
					
					product.setPid(pid);
					product.setPname(pname);
					product.setPrice(price);
					
					
					productList.add(product);
					
					
				}
				

			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
		
		return productList;
	}

}
