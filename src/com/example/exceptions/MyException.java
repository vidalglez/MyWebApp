package com.example.exceptions;

//import javax.servlet.ServletException;

public class MyException extends RuntimeException{//ServletException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 965379896767562070L;

	@Override
	public String getMessage(){
		return "This is MyException: " + super.getMessage();
	}
}
