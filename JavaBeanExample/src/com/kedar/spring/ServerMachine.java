package com.kedar.spring;

public class ServerMachine {
	
	// get all Details method
	public void getAllStudentDetails(JavaBeanExample bean) {
		System.out.println("Student Name :: \t\t\t" + bean.getName());
		System.out.println("Student College Name :: \t\t\t" + bean.getCollegeName());
		System.out.println("Student Course :: \t\t\t" + bean.getCourse());
		System.out.println("Student Subject -1 Marks :: \t\t\t" + bean.getMarks1());
		System.out.println("Student Subject -2 Marks :: \t\t\t" + bean.getMarks2());
		System.out.println("Student Subject -3 Marks :: \t\t\t" + bean.getMarks3());
	} // method
	
} // class
