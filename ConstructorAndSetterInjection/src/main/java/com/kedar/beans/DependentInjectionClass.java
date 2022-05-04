package com.kedar.beans;

public class DependentInjectionClass {
	
	// Properties
	public int sno;
	public String name, course, address;
	public double average;
	
	// Constructor	
	public DependentInjectionClass(int sno, String name, String course, String address, double average) {
		System.out.println("DependentInjectionClass.DependentInjectionClass()");
		this.sno = sno;
		this.name = name;
		this.course = course;
		this.address = address;
		this.average = average;
	}
	// Setter methods
	public void setSno(int sno) {
		this.sno = sno;
	} // Setter methods
	public void setName(String name) {
		this.name = name;
	} // Setter methods
	public void setCourse(String course) {
		this.course = course;
	} // Setter methods
	public void setAddress(String address) {
		this.address = address;
	} // Setter methods
	public void setAverage(double average) {
		this.average = average;
	} // Setter methods
	
} // class