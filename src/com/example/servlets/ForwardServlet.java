package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

import com.example.beans.*;


public class ForwardServlet extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5741588482349714625L;

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException{
		HttpServletRequest htrq = (HttpServletRequest) request;
		HttpServletResponse htrs = ((HttpServletResponse) response);
		HttpSession session = htrq.getSession();
		PrintWriter out = htrs.getWriter();
		System.out.println("Setting filter");
		MyBean bean = new MyBean();
		bean.setMsge("A bean object configured in Registered Servlet");		
		session.setAttribute("mybean", bean);
		RequestDispatcher view = request.getRequestDispatcher("index.jsp");
		out.println("Printed?");
		//htrs.flushBuffer();
		view.forward(request, response);
		out.println("Is it valid?");
	}
}
