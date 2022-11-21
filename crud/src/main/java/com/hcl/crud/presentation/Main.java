package com.hcl.crud.presentation;

import java.util.List;
import java.util.Scanner;

import com.hcl.crud.pojo.Product;
import com.hcl.crud.service.IProductService;
import com.hcl.crud.service.ProductServiceImp;

public class Main {

	public static void main(String[] args) {

		System.out.println("*******WELCOME TO PRODUCT APP******");
		boolean flag = true;

		Scanner scanner = new Scanner(System.in);

		 IProductService    service  =	new ProductServiceImp();
		
		while (flag) {

			System.out.println("1. ADD PRODUCT");
			System.out.println("2. UPDATE PRODUCT");
			System.out.println("3. DELETE BY PRODUCT ID");
			System.out.println("4. SELECT BY  PRODUCT ID");
			System.out.println("5. GET ALL PRODUCT");
			System.out.println("0. EXIT / LOGOUT");

			int key = scanner.nextInt();

			switch (key) {
			case 1:
				
				System.out.println("Enter Pid");
				int pid = scanner.nextInt();
				System.out.println("Enter PName");
				String pname = scanner.next();
				System.out.println("Enter Price");
				double  price = scanner.nextDouble();
				
				Product product = new Product();
						product.setPid(pid);
						product.setPname(pname);
						product.setPrice(price);
						
				
				
				int count =	service.addProduct(product);
				
					if(count > 0) {
						
						System.out.println(count+" Product Added Successfully");
						
					}
					else {
						
						System.err.println("Add Failed...");
					}
				
				break;
			case 2:

				break;
			case 3:

					System.out.println("Enter Id to Delete Product");
				
						int  deleteId = scanner.nextInt();
						
						int n1 =	service.deleteProductById(deleteId);
				
						if(n1 > 0) {
							
							System.out.println(n1+" Product Deleted Successfully");
							
						}
						else {
							
							System.err.println("Delete Failed...");
						}
						
				break;
			case 4:
				
				
				
				System.out.println("Enter Id to Search/Select Product");
				
				int  searchId = scanner.nextInt();
				
					Product  searchedProduct =		service.selectProductById(searchId);
					
		
				if(searchedProduct != null) {
					
					System.out.println(searchedProduct);
					
				}
				else {
					// here we can throw user defined exception like ProductNotFoundExp and write try-catch to handle it
					
					System.err.println("Product Not Found");
				}

				break;
			case 5:
				
					List<Product>  productList =	service.selectAll();

					for (Product prod : productList) {
						
						System.out.println(prod);
						
					}
					
					
				break;
			case 0:

					flag = false;
						
				break;

			default:
				break;
			}

		}

	}

}
