package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class RegisteredServlet extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1162064695151906254L;

	public void service(ServletRequest request, ServletResponse response) 
			throws ServletException, IOException{
		//HttpServletRequest hreq = (HttpServletRequest) request;
		HttpServletResponse hresp = (HttpServletResponse) response;
		hresp.setContentType("text/html");
		PrintWriter out = hresp.getWriter();
		out.println("<h3 style='font-family: Verdana;'>Servlet Generated Dynamically: " + 
				this.getServletName() +" </h3>");
		out.println("<div style='font-family: Verdana;'>Init Param \"myInitParam\": " +  
				this.getInitParameter("myInitParam") + "</div>");
		//hresp.flushBuffer();
		//hresp.sendRedirect(this.getServletContext().getContextPath() + "/imgServ");
		
	}
}
