package com.hcl.cms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.cms.beans.Contact;
import com.hcl.cms.service.ContactServiceImp;
import com.hcl.cms.service.IContactService;

/**
 * Servlet implementation class ContactServlet
 */
@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action =	request.getParameter("action");
		IContactService service = new ContactServiceImp();
		
		PrintWriter out = response.getWriter();
		
		switch (action) {
		case "add":
			
			long id = Long.parseLong(request.getParameter("contactNumber"));
			String name = request.getParameter("contactName");
			String email = request.getParameter("email");
			String address = request.getParameter("address");
			
			Contact contact = new Contact(id, name, email, address);	
			
			
		int count =		service.addContact(contact);
			
			if(count > 0) {
				
				
				out.print("Contact Added Successfully...");
				
			}
		
		
			break;

		default:
			break;
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
