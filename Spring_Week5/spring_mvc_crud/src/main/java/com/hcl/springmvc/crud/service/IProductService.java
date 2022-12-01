package com.hcl.springmvc.crud.service;

import java.util.List;

import com.hcl.springmvc.crud.beans.Product;

public interface IProductService {
	
			
		public  int    addProduct(Product product);
		
		public  int    updateProduct(Product product);
		
		public   int    deleteProductById(int pid);
		
		public   Product    selectProductById(int pid);
		
		public  List<Product>          selectAll();
	

}
