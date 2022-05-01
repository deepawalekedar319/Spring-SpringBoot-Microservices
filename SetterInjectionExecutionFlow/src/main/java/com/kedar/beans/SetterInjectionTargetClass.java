package com.kedar.beans;

public class SetterInjectionTargetClass {
	
	// HAS-A relation
	SetterInjectionDependentClass dependent;
	
	// Constructor
	public SetterInjectionTargetClass() {
		// Constructor
		System.out.println("Target Class Constructor :: ");
	} // Constructor

	// setter method for Injection
	public void setDependent(SetterInjectionDependentClass dependent) {
		System.out.println("SetterInjectionTargetClass.setDependent() :: Executed");
		this.dependent = dependent;
	} // setter method
	
	// Getting this Dependent class properties and using it
	public void getDetails() {
		// method stub
		System.out.println("Getting the Properties from the Dependent class :: ");
		System.out.println("The Registered Number is :: " + dependent.getSno());
		System.out.println("The Registered Number is :: " + dependent.getName());
	} // method
	
} // class