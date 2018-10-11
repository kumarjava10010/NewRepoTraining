package com.java.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomerServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String firstNmae = request.getParameter("firstName");
		String lastNmae = request.getParameter("lastname");
		
		String name = firstNmae + "  "+lastNmae;

		// DB code Calling hibernate or JDBC program Save into DB 
		System.out.println(firstNmae);
		
		request.setAttribute("registeredUser", name);
		request.setAttribute("day", 2);
		
		//db TO GET ALL ACCT INFO
    	
        RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");  
        
        rd.forward(request,response);  
	}

}
