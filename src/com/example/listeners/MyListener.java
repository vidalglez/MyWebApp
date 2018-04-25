package com.example.listeners;

//import javax.servlet.http.*;
import java.util.EnumSet;

import javax.servlet.*;

import com.example.servlets.*;

import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener{
	
	public void contextInitialized(ServletContextEvent evt){
		ServletContext ctx = evt.getServletContext();
		try {
			//Registering Servlet 
			ServletRegistration.Dynamic serv = ctx.addServlet("dynServlet", ctx.createServlet(RegisteredServlet.class));
			serv.addMapping("/dynServlet");
			serv.setAsyncSupported(false);
			serv.setInitParameter("myInitParam", "Init param declared!");
			System.out.println("dynServlet configured");
			
			
			//Registering Filter
			FilterRegistration.Dynamic filter = ctx.addFilter("dynFilter", "com.example.filters.MyFilter");
			EnumSet<DispatcherType> dispatchers = EnumSet.of(DispatcherType.REQUEST);
			filter.addMappingForUrlPatterns(dispatchers, true, "/index.jsp");
			filter.setInitParameter("myFiltInit", "Init parameter configured for MyFilter");
			System.out.println("dynFilter configured");
			
			ServletRegistration.Dynamic fwserv = ctx.addServlet("fwServ", ForwardServlet.class);
			fwserv.addMapping("/fwServlet");
			System.out.println("fwServ configured");
			
			ServletRegistration.Dynamic imgServlet = ctx.addServlet("imgServ","com.example.servlets.MyImageServlet");
			imgServlet.addMapping("/imgServ");
			
			ServletRegistration.Dynamic sessServlet = ctx.addServlet("mySessServ", ctx.createServlet(MySession.class));
			sessServlet.addMapping("/sessionServlet");
			
			ServletRegistration.Dynamic myCnn = ctx.addServlet("myConn", MyInjected.class);
			myCnn.addMapping("/myConn");
			
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void contextDestroyed(ServletContextEvent evt){
		
	}

}
