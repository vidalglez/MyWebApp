package com.example.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.example.dao.UserDAO;
import com.example.dao.impl.UserDAOImpl;
import com.example.forms.EmployeeForm;
import com.example.valueobject.User;

public class EmployeeAction extends Action{

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response){
		EmployeeForm eForm = (EmployeeForm) form;
		ActionErrors errors = new ActionErrors();
		if(eForm.getFirstName().equals("Gustavo")){
			errors.add("id", new ActionMessage("employee.duplicated"));
			this.saveErrors(request, errors);
			return mapping.getInputForward();
			//return mapping.;
		}
		
		/*
		UserDAO userDao = new UserDAOImpl();
		User user = userDao.getUser(Integer.parseInt(eForm.getId()));
		request.setAttribute("user", user);
		*/
		
		return mapping.findForward("success");
	}
}
