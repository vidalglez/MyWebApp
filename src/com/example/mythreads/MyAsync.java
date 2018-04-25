package com.example.mythreads;

import java.io.IOException;

import javax.servlet.*;

public class MyAsync implements Runnable{
	
	private AsyncContext actx;
	
	public MyAsync(AsyncContext c){
		actx = c;
	}
	

	public void run(){
		
		try{
			Thread.sleep(5000);
			ServletResponse response = actx.getResponse();
			response.getWriter().println("Message printed through AsynContext.");
			response.flushBuffer();
			actx.complete();
			
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}catch(IOException ex){
			ex.printStackTrace();
		}
		
	}
}
