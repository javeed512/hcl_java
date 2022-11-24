package com.hcl.cms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DashboardServlet
 */
@WebServlet("/DashboardServlet")
public class DashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DashboardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out =  response.getWriter();
	
		out.print("<h1>Welcome to Dashboard</h1>");
		
		HttpSession session = request.getSession();
		
	String uname = (String)	session.getAttribute("userName");
		
		out.print("<a href='view/addContact.html'>Add Contacts</a> <br>");
		out.print("<a href='view/updateContact.html'>Update Contacts</a> <br>");
		out.print("<a href='view/deleteContact.html'>Delete Contacts</a> <br>");
		out.print("<a href='view/getAllContact.html'>Show All Contacts</a> <br>");
		
		
		out.print("<a href='view/logout.jsp'>LOGOUT</a>");
		
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
