package com.example.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.example.dao.EmployeeDAO;
import com.example.dao.impl.EmployeeDAOImpl;
import com.example.valueobject.Employee;


public class ListEmployeesAction extends Action{

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response){
		System.out.println("inside EXECUTE!");
		EmployeeDAO dao = new EmployeeDAOImpl();
		List<Employee> employeesList = dao.getEmployees();
		request.setAttribute("employeesList", employeesList);
		return mapping.findForward("ok");
	}
}
