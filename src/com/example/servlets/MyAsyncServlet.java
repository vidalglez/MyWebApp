package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import com.example.listeners.MyAsyncListener;

import com.example.mythreads.*;

@WebServlet(
	name = "myasyincservlet",
	urlPatterns = {"/asyncTest"},
	asyncSupported = true 
	)
public class MyAsyncServlet extends HttpServlet{

	private static final long serialVersionUID = 7204968568675905435L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		doPost(request, response);
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		request.setAttribute("org.apache.catalina.ASYNC_SUPPORTED", true);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h3>AsynContext Example</h3>");
		response.flushBuffer();
		
		AsyncContext ctx = request.startAsync();
		
		MyAsyncListener lstr = ctx.createListener(MyAsyncListener.class);
		ctx.addListener(lstr);
		
		MyAsync async = new MyAsync( ctx);
		ctx.start(async);
		
		
		
	}
}
