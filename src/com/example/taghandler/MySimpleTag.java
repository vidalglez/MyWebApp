package com.example.taghandler;

import java.io.IOException;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;

public class MySimpleTag implements SimpleTag {

	private JspContext ctx;
	private JspFragment fragment;
	private JspTag parent;
	
	private String msge;

	public String getMsge() {
		return msge;
	}

	public void setMsge(String msge) {
		this.msge = msge;
	}

	public void setParent(JspTag p) {
		parent = p;
	}

	public JspTag getParent() {
		return parent;
	}

	public void setJspContext(JspContext c) {
		ctx = c;
	}

	public void setJspBody(JspFragment f) {
		fragment = f;
	}

	public void doTag() throws JspException {
		try {
			if (fragment != null) {
				fragment.invoke(null);
			}
			else{
				JspWriter out = ctx.getOut();
				out.println("Printing SimpleTag contents and message: " + msge);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
