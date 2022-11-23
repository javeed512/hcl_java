package com.hcl.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FetchCookies
 */
@WebServlet("/FetchCookies")
public class FetchCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchCookies() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
			out.print("<h2>Reading cookies from current browser </h2>");
			
		Cookie[]  cookies =	request.getCookies();
		
					for (Cookie cookie : cookies) {
						
						
					System.out.println(cookie.getName() +"  "+cookie.getValue());
					System.out.println("Cookie expiring time "+cookie.getMaxAge());
						
				out.print(cookie.getName() +"  "+cookie.getValue() +"<br>");
					out.print("Cookie expiring time "+cookie.getMaxAge());
					
					
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
