package com.example.beans;

public class MyBean implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6491169639586696265L;
	private String msge;

	public String getMsge() {
		return msge;
	}

	public void setMsge(String msge) {
		this.msge = msge;
	}
	
	public MyBean(){
		
	}
	
	/*
	public MyBean(String m){
		msge = m;
	}
	*/
}
