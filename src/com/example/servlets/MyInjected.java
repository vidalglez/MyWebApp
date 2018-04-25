package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.sql.DataSource;
import javax.annotation.Resource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.*;

import com.example.dto.*;


@PersistenceUnit(name="myPU", unitName="EmployeePersistenceUnit")
public class MyInjected extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4872491372323340264L;

	//@PersistenceUnit(unitName = "EmployeePersistenceUnit")
	private EntityManagerFactory emf;

	@Resource(name = "jdbc/postgres")
	private DataSource myConn;

	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		HttpServletResponse resp = (HttpServletResponse) response;
		resp.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h3>Testing PostgreSQL connection</h3>");
		try {
			Connection conn = myConn.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");
			while (rs.next()) {
				out.println("ID: " + rs.getInt("id") + ", First Name: "
						+ rs.getString("firstName") + ", Last Name: "
						+ rs.getString("lastName"));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		try {
			EntityManager em = emf.createEntityManager();
			Query query = em.createQuery("SELECT e FROM Employee");
			List<Employee> list = (List<Employee>) query.getResultList();
			Employee emp = list.get(0);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void init(){
		try {
			Context ctx = new InitialContext();
			//emf = (EntityManagerFactory)ctx.lookup("myPU");
			emf = (EntityManagerFactory)((Context)ctx.lookup("java:comp/env")).lookup("jdbc/postgres");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
