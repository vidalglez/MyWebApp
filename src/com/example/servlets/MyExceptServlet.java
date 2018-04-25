package com.example.servlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import com.example.exceptions.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(
	urlPatterns="/myservex"
		)
public class MyExceptServlet extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1629862607852493855L;

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
		//throw new ServletException();
		throw new MyException();
		/*
		try {
			throw new MyException();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
}
