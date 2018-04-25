package com.example.controller;
import org.hibernate.*;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;

import com.example.dto.Users;

public class MyModel {
	
	private SessionFactory sessionFactory;
	private Session session;
	
	public MyModel(){
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		/*
		Configuration configuration = new Configuration();
	    configuration.configure();
	    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
	    session = configuration.buildSessionFactory(serviceRegistry);
	    */
	}
	
	public Users getUser(int id){
		Users user = null;
		try{
			Query query = session.createQuery("from Users as U where U.id = :id");
			query.setParameter("id", id);
			query.setMaxResults(1);		
			user = (Users) query.uniqueResult();
			
		}catch(HibernateException ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return user;
	}
	
	public String getJson(Users user){
		
		return "";
	}
	

}
