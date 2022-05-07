package com.kedar.client;

import com.kedar.problem.EmployeeClass;
import com.kedar.problem.GetObjectClass;
import com.kedar.problem.PersonClass;
import com.kedar.problem.StudentClass;

public class ClientClass {

	public static void main(String[] args) {
		// method stub
		
		// create the class object and invoke the methods
		PersonClass person = GetObjectClass.getClassObject("emp");
		
		// call the methods
		person.firstMethod();
		((EmployeeClass) person).empLogics();
		
		System.out.println("***********************************");
		
		// create the StudentClass object
		StudentClass student = (StudentClass) GetObjectClass.getClassObject("student");
		
		// call the methods
		student.secondMethod();
		student.studentLogic();
		
	} // main
} // class