package com.kedar.beans;

public class SampleInjectionClass {
	
	// properties
	public int rollNumber ;
	public String name;
	public String course;
	public double average;
	
	// setter
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	@Override
	public String toString() {
		return "SampleInjectionClass [rollNumber=" + rollNumber + ", name=" + name + ", course=" + course + ", average="
				+ average + "]";
	}
	
	// toString() method
	

} // class