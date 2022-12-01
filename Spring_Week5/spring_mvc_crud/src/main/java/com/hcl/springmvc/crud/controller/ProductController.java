package com.hcl.springmvc.crud.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hcl.springmvc.crud.beans.Product;
import com.hcl.springmvc.crud.service.IProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

		@Autowired
		IProductService service;
	
		@RequestMapping(value="/hello",method=RequestMethod.GET)
		@ResponseBody
		public String   sayHello() {
			
			return "Welcome Friends!";
			
		}
	
		@RequestMapping("/index")
		public String  indexPage() {
			
			
			return "index";  // index.jsp
			
		}
		
		
		
		/*
		 * @RequestMapping(value="/add",method = RequestMethod.POST) public String
		 * addProduct(HttpServletRequest request , HttpServletResponse
		 * response,HttpSession session) {
		 * 
		 * String pname = request.getParameter("pname");
		 * 
		 * session.setAttribute("pname", pname);
		 * 
		 * return "display"; // display.jsp page
		 * 
		 * 
		 * }
		 */
		
		@RequestMapping(value="/add",method = RequestMethod.POST)
		public String   addProduct(Product product, HttpSession session) {
					
			
		int count =	service.addProduct(product);
			
			
			
			session.setAttribute("status", count);
					
					return "display";  // display.jsp page
					
					
				}
		
		
		
		@RequestMapping(value="/update",method = RequestMethod.POST)
		public String   updateProduct(Product product, HttpSession session) {
					
			
		int count =	service.updateProduct(product);
			
			
			
			session.setAttribute("status", count);
					
					return "display";  // display.jsp page
					
					
				}
		
		
		
		@RequestMapping(value="/delete",method = RequestMethod.POST)
		public String   deleteProduct(@RequestParam int pid, HttpSession session) {
					
			
		int count =	service.deleteProductById(pid);
			
			
			
			session.setAttribute("status", count);
					
					return "display";  // display.jsp page
					
					
				}
		
		
		@RequestMapping("/getall")
		public String  getAllProducts(HttpSession session) {
			
		List<Product> list =	service.selectAll();
			
		session.setAttribute("list", list);
			
			return "showAll";  // showAll.jsp
			
		}
		
		
		
	
}
