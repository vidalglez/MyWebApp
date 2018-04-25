package com.example.servlets;

import javax.servlet.*;

import java.io.IOException;

import com.example.controller.*;
import com.example.dto.Users;
import javax.servlet.annotation.WebServlet;

@WebServlet(
		name="myCtrl",
		urlPatterns={"/myController"},
		asyncSupported=false
		)
public class MyController extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4645052667615724456L;

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException{
		MyModel model = new MyModel();
		Users user = new Users();
		if(request.getParameter("id") != null){
			Integer id = new Integer(request.getParameter("id"));
			user =model.getUser(id.intValue());
		}else{
			user = model.getUser(1);
		}
		request.setAttribute("user", user);
		RequestDispatcher view = request.getRequestDispatcher("jsp/testEx.jsp");
		view.forward(request, response);
	}
}
