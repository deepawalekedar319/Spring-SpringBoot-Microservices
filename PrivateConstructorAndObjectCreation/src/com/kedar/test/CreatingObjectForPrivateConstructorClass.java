package com.kedar.test;

import java.lang.reflect.Constructor;

import com.kedar.beans.PrivateConstructorClass;

public class CreatingObjectForPrivateConstructorClass {
	
	public static void main(String[] args) {
		
		try {
			
			// get the class from String args
			Class c1 = Class.forName(args[0]);
						
			// get the declared constructors
			Constructor[] constructor = c1.getDeclaredConstructors();
			
			// set visibility
			constructor[0].setAccessible(true);
			
			// create the object 
			Object object = constructor[0].newInstance();
						
			// type caste
			PrivateConstructorClass privateClass = (PrivateConstructorClass)object;
			
			// set the values
			privateClass.setSno(10);
			privateClass.setSname("D. Kedar Singh");
			privateClass.setCourse("Java Full Stack");
			privateClass.setAddress("Hyderabad");
			privateClass.setAvg(95.5);
			
			System.out.println(privateClass.toString());
			
		} // try
		catch (Exception e) {
			// handle exception
		} // catch		
	} // main
} // class