package com.kedar.injection;

import java.util.Date;

public class ConstructorInjectionClass {
	
	// properties
	private Date date;
	
	// creating the constructor
	public ConstructorInjectionClass( Date date) {
		//  constructor stub
		System.out.println("ConstructorInjectionClass.ConstructorInjectionClass()");
		this.date = date;
	} // one param constructor
	
	// b-logic
	public void getTodaysDate() {
		System.out.println("Current date is :: " + date);		
	} // method
	
} // class