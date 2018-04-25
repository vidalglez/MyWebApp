package com.example.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(
	name="SimpleServlet",
	value="/SimpleServlet"
)
public class SimpleServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8021917060113428990L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		response.getWriter().write("service method");
		response.flushBuffer();
		response.getWriter().write("is commited: " + response.isCommitted());
		request.getRequestDispatcher("jsp/ex1.jsp").include(request, response);;
		//response.sendRedirect("http://www.google.com");
	}

}
