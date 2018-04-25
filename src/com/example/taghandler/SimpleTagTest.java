package com.example.taghandler;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.*;

public class SimpleTagTest extends SimpleTagSupport {
	
	JspFragment msge;
	
	public void setMsge(JspFragment m){
		msge = m;
	}

	public void doTag() throws JspException {		
		try {
			StringWriter sw = new StringWriter();
			JspFragment fragment = this.getJspBody();
			fragment.invoke(sw); // Capture content of the body
			this.getJspContext().setAttribute("myScpAttr","Value from attribute set in Page Scope",PageContext.SESSION_SCOPE);
			JspWriter out = this.getJspContext().getOut();
			out.println("This is a modified String geeting Body from  tag and adding this string. "
					+ sw.toString());
			out.println("<br />");
			sw = new StringWriter();
			msge.invoke(sw);
			out.println(sw.toString());
			String temp = (String)this.getJspContext().getAttribute("item");
			this.getJspContext().setAttribute("item", temp + " something else added");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
