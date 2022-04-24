package com.kedar.spring;

import java.lang.reflect.Constructor;

public class ReflectionAPITestingClass2 {

	public static void main(String[] args) {
		
		try {
			// load the class			
			Class c1 = Class.forName(args[0]);
			
			// get the constructors
			Constructor constructor[] = c1.getDeclaredConstructors();
			
			// create the object dynamically
			Object object1 = constructor[0].newInstance();
			Object object2 = constructor[1].newInstance(10,20);
			
			// type casting
			DynamicObjectCreationClass2 dynamic1 = (DynamicObjectCreationClass2)object1;
			//DynamicObjectCreationClass2 dynamic2 = (DynamicObjectCreationClass2)object2;
			
			// calling the methods
			//dynamic1.getSampleData();
			//dynamic2.getSampleData();
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