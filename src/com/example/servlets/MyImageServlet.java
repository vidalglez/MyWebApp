package com.example.servlets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.*;
import javax.servlet.http.*;

public class MyImageServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1318873545331884017L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("image/jpeg");
		ServletContext ctx = this.getServletContext();
		InputStream is = ctx.getResourceAsStream("/WEB-INF/espn.jpg");
		//InputStream is = ctx.getResourceAsStream(ctx.getRealPath("espn.jpg"));
		int read = 0;
		byte[] bytes = new byte[1024];
		OutputStream os = response.getOutputStream();
		while((read = is.read(bytes)) != - 1){
			os.write(bytes, 0, read);
		}
		
	}

}
