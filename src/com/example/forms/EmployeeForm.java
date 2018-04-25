package com.example.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class EmployeeForm extends ActionForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3280380935506704933L;

	private String id;
	private String firstName;
	private String lastName;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request){
		System.out.println("In validate method");
		ActionErrors errors = new ActionErrors();

		if(this.id == null || this.id.equals("")){
			errors.add("id", new ActionMessage("missing.id"));
		}
		if(this.firstName == null || this.firstName.equals(""))
			errors.add("firstName", new ActionMessage("missing.firstName"));
		if(this.lastName == null || this.lastName.equals("")){
			errors.add("lastName", new ActionMessage("missing.lastName"));
		}
		
		try{
			int num = Integer.parseInt(this.id);
			if(num < 1){
				errors.add("id", new ActionMessage("id.lowerthanzero"));
			}
		}catch(NumberFormatException ex){
		//}catch(ClassCastException ex){
			errors.add("id", new ActionMessage("id.notinteger"));
		}
		return errors;
	}
	
}
