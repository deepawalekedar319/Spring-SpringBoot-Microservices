package com.kedar.beans;

import java.lang.reflect.InvocationTargetException;

public class TargetInjectionClass {
	
	// HAS-A relationship
	DependentInjectionClass injection;
	
	// Constructors
	public TargetInjectionClass(DependentInjectionClass injection)  {
		// constructor stub
		this.injection = injection;
	} // one param constructor

	// b-logic method
	public void getClassDetails()  {
		try {
			injection.createObjectAtRunTime();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // method

} // class