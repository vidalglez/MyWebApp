package com.example.listeners;

import javax.servlet.AsyncListener;
import javax.servlet.AsyncEvent;

public class MyAsyncListener implements AsyncListener{

	@Override
	public void onStartAsync(AsyncEvent evt){
		System.out.println("onStartAsync()....");
	}
	
	@Override
	public void onTimeout(AsyncEvent evt){
		System.out.println("onTimeout()....");
	}
	
	@Override
	public void onError(AsyncEvent evt){
		System.out.println("onError()....");
	}
	
	@Override
	public void onComplete(AsyncEvent evt){
		System.out.println("onComplete()....");
	}
	
}
