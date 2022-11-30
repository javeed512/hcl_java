package com.hcl.springmvc.controller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {

	
		@RequestMapping(value="/hello" , method = RequestMethod.GET)
		@ResponseBody
		public String   get() {
			
			return "Hello friends";  // text, view name/page name , data
			
		}
		
		@RequestMapping(value="/add" , method=RequestMethod.POST)
		
		public String  add() {
			
			return  "display";
			
		}
		
		
		
	
	
	
}
