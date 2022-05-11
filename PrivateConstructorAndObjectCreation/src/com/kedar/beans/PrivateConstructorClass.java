package com.kedar.beans;

public class PrivateConstructorClass {
	
	// Properties
	int sno;
	String sname;
	String course;
	String address;
	double avg;
	
	// Private Constructor
	private PrivateConstructorClass() {
		// constructor stub
		System.out.println("PrivateConstructorClass.PrivateConstructorClass() :: Executed");
	} // Constructor
	
	// Setter methods
	public void setSno(int sno) {
		this.sno = sno;
	} // Setter method

	public void setSname(String sname) {
		this.sname = sname;
	} // Setter method

	public void setCourse(String course) {
		this.course = course;
	} // Setter method

	public void setAddress(String address) {
		this.address = address;
	} // Setter method

	public void setAvg(double avg) {
		this.avg = avg;
	}

	// toString() method
	@Override
	public String toString() {
		return "PrivateConstructorClass [sno=" + sno + ", sname=" + sname + ", course=" + course + ", address="
				+ address + ", avg=" + avg + "]";
	} 	

} // class