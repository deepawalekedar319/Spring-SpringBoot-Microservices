package com.kedar.spring;

public class ReflectionAPITestingClass {

	public static void main(String[] args) {
		
		try {
			// load the class			
			Class c1 = Class.forName(args[0]);
			
			// create the object dynamically
			Object object = c1.newInstance();
			
			// type casting
			DynamicObjectCreationClass dynamic = (DynamicObjectCreationClass)object;
			
			// calling the methods
			dynamic.getSampleData();
		} // try
		catch (ClassNotFoundException e) {
			//  catch block
			e.printStackTrace();
		} // catch
		catch (Exception e) {
			// handle exception
			e.printStackTrace();
		} // catch
	} // main
} // class