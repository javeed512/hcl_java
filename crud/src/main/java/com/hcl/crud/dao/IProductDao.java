package com.hcl.crud.dao;

import java.util.List;

import com.hcl.crud.pojo.Product;

public interface IProductDao {
	
	public  int    addProduct(Product product);
	
	public  int    updateProduct(Product product);
	
	public   int    deleteProductById(int pid);
	
	public   Product    selectProductById(int pid);
	
	public  List<Product>          selectAll();
	
	

}
