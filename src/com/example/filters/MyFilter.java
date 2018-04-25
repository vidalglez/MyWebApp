package com.example.filters;

import java.io.IOException;

import javax.servlet.*;
//import javax.servlet.http.*;
//import com.example.beans.*;

public class MyFilter implements Filter{
	
	FilterConfig conf;
	
	public void init(FilterConfig c){
		conf = c;
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException{
		/*
		HttpServletRequest htrq = (HttpServletRequest) request;
		HttpSession session = htrq.getSession();
		System.out.println("Setting filter");
		MyBean bean = new MyBean();
		bean.setMsge("A bean object configured in Registered Filter");		
		session.setAttribute("mybean", bean);
		*/
		System.out.println(conf.getServletContext().getContextPath() );
		chain.doFilter(request, response);
	}
	
	public void destroy(){
		conf = null;
	}

}
