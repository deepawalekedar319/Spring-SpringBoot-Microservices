package com.kedar.client;

import com.kedar.problem.EmployeeClass;
import com.kedar.solution.SolutionUsingGeneric;

public class GenericClient {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		// get the object 
		EmployeeClass emp = SolutionUsingGeneric.getObjectReference(EmployeeClass.class);
		
		// call direct the methods
		emp.empLogics();
		// call the parent class methods
		emp.firstMethod();
		emp.secondMethod();
		
	} // main
} // class