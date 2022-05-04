package com.kedar.beans;

public class TargetInjectionClass {
	
	// HAS-A relationship
	DependentInjectionClass dependent;

	// Setter method 
//	public void setDependent(DependentInjectionClass dependent) {
//		this.dependent = dependent;
//	} // setter method
	
	// Constructor injection
	public TargetInjectionClass(DependentInjectionClass dependent) {
		this.dependent = dependent;
	}
	
	
	// Calling b-logic method
	// b-logic method
	public void getTheStudentDetails() {
		System.out.println("Student Sno :: " + dependent.sno);
		System.out.println("Student Name :: " + dependent.name);
		System.out.println("Student Course :: " + dependent.course);
		System.out.println("Student Address :: " + dependent.address);
		System.out.println("Student Average :: " + dependent.average);
	} // method	
	
} // class