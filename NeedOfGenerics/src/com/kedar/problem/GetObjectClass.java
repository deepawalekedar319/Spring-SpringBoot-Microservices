package com.kedar.problem;

public class GetObjectClass {
	
	// method for creating object
	public static  PersonClass getClassObject(String className) {
		
		// create the reference
		PersonClass person;
		
		// logics for creating the object
		if(className.equalsIgnoreCase("student"))
			person = new StudentClass();
		else if(className.equalsIgnoreCase("emp"))
			person = new EmployeeClass();
		else if(className.equalsIgnoreCase("customer"))
			person = new CustomerClass();
		else 
			throw new IllegalArgumentException(" X ===== :: Invalid argument :: ===== X");
		return person;
		
	} // method

} // class 