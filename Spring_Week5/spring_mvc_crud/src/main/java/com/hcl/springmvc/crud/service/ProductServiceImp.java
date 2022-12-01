package com.hcl.springmvc.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.springmvc.crud.beans.Product;
import com.hcl.springmvc.crud.dao.IProductDao;
@Service
public class ProductServiceImp implements IProductService {

	@Autowired
	IProductDao dao;

	public ProductServiceImp() {

		

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
