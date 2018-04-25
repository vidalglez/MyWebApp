package com.example.dao.impl;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DAOSingleton {

	SessionFactory factory;
	private static DAOSingleton instance = new DAOSingleton();
	
	private DAOSingleton(){		
		factory = new Configuration().configure().buildSessionFactory();
	}
	
	public static DAOSingleton getInstance(){
		return instance;		
	}
	
	public SessionFactory getFactory(){
		return factory;
	}
}
