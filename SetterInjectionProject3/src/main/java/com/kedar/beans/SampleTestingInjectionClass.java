package com.kedar.beans;

public class SampleTestingInjectionClass {
	
	// Properties 
	public SampleInjectionClass sample;
	
	public void setDetails(SampleInjectionClass sample) {
		this.sample = sample;
	} // method
	
	public void studentDetails() {
		System.out.println("Student Roll Number :: \t" + sample.rollNumber);
		System.out.println("Student Name :: \t" + sample.name);
		System.out.println("Student Course :: \t" + sample.course);
		System.out.println("Student Average :: \t" + sample.average);
	} // method

	@Override
	public String toString() {
		return "SampleTestingInjectionClass [sample=" + sample + "]";
	}
	
	// toString() method
	
	
} // class