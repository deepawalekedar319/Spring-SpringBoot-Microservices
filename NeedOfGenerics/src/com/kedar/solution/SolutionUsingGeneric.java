package com.kedar.solution;

import com.kedar.problem.PersonClass;

public class SolutionUsingGeneric {
	
	// method
	@SuppressWarnings("deprecation")
	public static <T extends PersonClass> T getObjectReference(Class<T> className) throws InstantiationException, IllegalAccessException {
		// return the object
		return className.newInstance();
		
	} // method

} // class