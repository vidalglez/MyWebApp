package com.example.taghandler;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.*;

public class Question19 extends TagSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int doStartTag() throws JspException {
		Tag enclosing = this.getParent();
		JspWriter out = pageContext.getOut();
		if(enclosing == null){
			return Tag.EVAL_BODY_INCLUDE;
		}
		try {
			if (enclosing instanceof TagAdapter) {
				TagAdapter enclosingSimple = (TagAdapter) enclosing;
				JspTag simpleTag = enclosingSimple.getAdaptee();
				out.println("Simple parent: " + simpleTag.getClass().getName());
			}
			else{
				out.println("Classic parent: " + enclosing.getClass().getName());
				
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return Tag.EVAL_BODY_INCLUDE;
	}
}
