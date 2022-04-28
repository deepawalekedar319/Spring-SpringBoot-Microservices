package com.kedar.beans;

public class SetterInjectionDependentClass {
	
	// Properties
	public int a;
	public int b;
	
	// setter methods for a and b
	public void setA(int a) {
		this.a = a;
	} // setA(-)
	public void setB(int b) {
		this.b = b;
	} // setB(-)
	
	// logics for performing mathematical operations
	public int addNumbers() {
		return this.a+this.b;
	} // addition
	public int subNumbers() {
		return this.a-this.b;
	} // subtract
	public int multiplyNumbers() {
		return this.a*this.b;
	} // multiplication
	
} // class