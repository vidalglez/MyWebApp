package com.example.dao;

import java.util.List;

import com.example.valueobject.Employee;

public interface EmployeeDAO {

	List<Employee> getEmployees();
	Employee getEmployee(int id);
	void updateEmployee(Employee e);
	void deleteEmployee(Employee e);
	void addEmployee(Employee e);
}
