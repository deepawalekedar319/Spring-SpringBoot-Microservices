package com.kedar.beans;

import java.util.Date;

public class WishMessageGenerator {
	
	// Bean class should have one HAS-A property
	private Date date;
	
	// to provide setter injection we should have one setter method
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	} // setDate(-)
	
	// Business logic method
	public String getWishMessage(String user) {
		
		System.out.println("WishMessageGenerator.getWishMessage()");
		
		// get the current system hour
		int hour = date.getHours();
		
		if(hour<12)
			return "Good Morning :: " + user;
		
		else if(hour<16)
			return "Good Afternoon :: " + user;
		
		else if(hour<20)
			return "Good Evening :: " + user;
		
		else
			return "Good Night :: " + user;
	} // getWishMessage(-)
	
} // class
