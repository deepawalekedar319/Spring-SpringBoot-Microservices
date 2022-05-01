package com.kedar.beans;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DependentInjectionClass {
	
	// Properties
	private String className;
	
	// Set the class name
	public void setClassName(String className) {
		this.className = className;
	} // Setter method

	public String getClassName() {
		return className;
	} // Getter method	
	
	// Create the object at run time for the given class
	// Object creation method
	public void createObjectAtRunTime() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
		// Load the given class
		Class c = Class.forName(this.className);
		
		// get declared constructors
		Constructor[] cons = c.getDeclaredConstructors();
		
		// Create the object
		Object object1 = cons[0].newInstance(10,20);
		
		// Print the result i.e hashCode
		System.out.println("Object created and it's hash code is :: "+object1.hashCode());
		
	} // method

} // class