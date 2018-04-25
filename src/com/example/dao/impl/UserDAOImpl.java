package com.example.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.example.dao.UserDAO;
import com.example.valueobject.User;


public class UserDAOImpl implements UserDAO{
	
	DAOSingleton dao = DAOSingleton.getInstance();//get through ServletContext	

	@Override
	public List<User> getAllUsers(){
		List<User> users = new ArrayList<User>();
		Session session = dao.getFactory().openSession();
		Query query = session.createQuery("from User");
		users = (List<User>) query.list();
		return users;
	}
	
	@Override
	public User getUser(int id){
		User user = new User();
		Session session = dao.getFactory().openSession();
		Query query = session.createQuery("from User as u where u.id = :id");
		query.setParameter("id", id);
		user = (User) query.uniqueResult();
		return user;
	}
	
	@Override
	public void updateUser(User user){
		
	}
	
	@Override
	public void deleteUser(User user){
		
	}
}
