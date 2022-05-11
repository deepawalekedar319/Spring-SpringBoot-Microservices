package com.kedar.pattern.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class FactoryPatternClass {
	
	// create the static method
	public static <T> T getClassObject(String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Object object = null;
		
		if(className.equalsIgnoreCase("privateClass")) {
			
			// load the given class
			Class c1 = Class.forName(className);
			
			// get the class name
			String completeClassName = c1.getName();
			// get the last . index
			int midIndex = completeClassName.lastIndexOf('.')+1;
			// final class name
			String finalClass = completeClassName.substring(midIndex);
			
			// get the declared constructors
			Constructor[] constructor = c1.getDeclaredConstructors();
						
			// set visibility
			constructor[0].setAccessible(true);
						
			// create the object 
			object = constructor[0].newInstance();
			
			// type caste
			
		} // if
			
		return null;
	}// method

} // class