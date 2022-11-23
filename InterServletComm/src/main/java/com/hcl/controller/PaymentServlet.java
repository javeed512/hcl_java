package com.hcl.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PaymentServlet
 */
@WebServlet("/PaymentServlet")
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
			out.print("<h1>Welcome to Payment Gateway</h1>");
		
			
	
			
				HttpSession session =	request.getSession();
				System.out.println("payment servlet  Is New session object? "+session.isNew());
				
			//	session.invalidate(); // it will destroy or delete session
				
				
				
		String uname = (String)	session.getAttribute("uname");
		
		String pwd = (String) session.getAttribute("pwd");
		
		Double  amount = (Double) session.getAttribute("amount");
				
		
				out.print("Username "+uname +"<br>");
				out.print("pwd "+pwd +"<br>");
				out.print("Amount "+amount +"<br>");
				
	
					session.removeAttribute("pwd");
					
			out.print("Password after remove "+session.getAttribute("pwd"));
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
