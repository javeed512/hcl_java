package com.hcl.crud.service;

import java.util.List;

import com.hcl.crud.dao.IProductDao;
import com.hcl.crud.dao.ProductDaoImp;
import com.hcl.crud.pojo.Product;

public class ProductServiceImp implements IProductService {

	IProductDao dao;

	public ProductServiceImp() {

		dao = new ProductDaoImp();

	}

	@Override
	public int addProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.addProduct(product);
	}

	@Override
	public int updateProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.updateProduct(product);
	}

	@Override
	public int deleteProductById(int pid) {
		// TODO Auto-generated method stub
		return dao.deleteProductById(pid);
	}

	@Override
	public Product selectProductById(int pid) {
		// TODO Auto-generated method stub
		return dao.selectProductById(pid);
	}

	@Override
	public List<Product> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

}
