package com.kedar.beans;

public class SetterInjectionDependentClass {
	
	// Properties
	private int sno;
	private String name;
	
	// Constructor
	public SetterInjectionDependentClass() {
		// Constructor
		System.out.println("Dependent Class Constructor :: ");
	} // Constructor

	// Setter methods 
	public void setSno(int sno) {
		this.sno = sno;
	} // Setter method
	public void setName(String name) {
		this.name = name;
	} // Setter method
	
	// Getter methods for private properties
	public int getSno() {
		System.out.println("Setting of Dependent class private properties :: sno");
		return this.sno;
	} // getter method
	
	public String getName() {
		System.out.println("Setting of Dependent class private properties :: name");
		return this.name;
	} // getter method
	
} // class