package com.hcl.cms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hcl.cms.beans.User;
import com.hcl.cms.service.IUserService;
import com.hcl.cms.service.UserServiceImp;

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
		
			
	
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		
		
		IUserService  service = new UserServiceImp();
		
			List<User> userList =	service.getAllUser();
			

RequestDispatcher  rd = request.getRequestDispatcher("DashboardServlet");	
						
				//rd.forward(request, response);
					
				
RequestDispatcher  rd2 = request.getRequestDispatcher("index.html");// failure go back to login page		
			
			
			for (User user : userList) {
				
			if(user.getUserName().equals(userName)  && user.getPassword().equals(password) ){
					
					out.print("Login Succesful...");
					
					HttpSession session = request.getSession();
					
					System.out.println(userName);
					session.setAttribute("userName", userName);
				
					session.setAttribute("password", password);
					
					System.out.println(session);
					
					rd.include(request, response);
					
					
				}
				
			else {
				
				
				rd2.forward(request, response);
				
			}
				
				
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
