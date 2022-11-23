package com.hcl.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
				PrintWriter out = response.getWriter();
		
		
				
				
			String  username =		request.getParameter("username");
			String password  =       request.getParameter("password");
			
			double  amount = 12000.0;
			
			
				if(username.equals("javeed")  && password.equals("tiger")) {
					
					
						out.print("<h1>Welcome "+username +" </h1>");
						
						System.out.println("login success....");
						
					HttpSession session = request.getSession();
						
						session.setAttribute("uname", username);
						session.setAttribute("pwd", password);
						session.setAttribute("amount", amount);
						
		System.out.println("login servlet  Is New session object? "+session.isNew());
						
						
			RequestDispatcher  rd = request.getRequestDispatcher("PaymentServlet");	
						
				//rd.forward(request, response);
					
				rd.include(request, response);
			
			
				}
			
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
