package com.example.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.example.dao.EmployeeDAO;
import com.example.valueobject.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	private DAOSingleton dao = DAOSingleton.getInstance();

	@Override
	public List<Employee> getEmployees(){
		List<Employee> employees = null;
		Session session = dao.getFactory().openSession();
		Query query = session.createQuery("from Employee");
		employees = (List<Employee>) query.list();
		return employees;
	}
	
	@Override
	public Employee getEmployee(int id){
		Employee e = null;
		Session session = dao.getFactory().openSession();
		Query query = session.createQuery("from Employee as e where e.id = :id");
		query.setParameter("id", id);
		e = (Employee) query.uniqueResult();
		return e;
	}
	
	@Override
	public void updateEmployee(Employee e){
		
	}
	
	@Override
	public void deleteEmployee(Employee e){
		
	}
	
	@Override
	public void addEmployee(Employee e){
		
	}
}
