package com.kedar.spring;
// Bean class is recommended to implement the Serializable

@SuppressWarnings("serial")
public class JavaBeanExample  implements java.io.Serializable{
	
	// Properties should be private and non-static
	int rollNo ;
	String name;
	String collegeName;
	String course;
	int marks1;
	int marks2;
	int marks3;
	
	//  Setter and Getter method for each Properties
	public void setRollNumber(int rollNo) {
		this.rollNo = rollNo;
	} // setter method
	public int getRollNumber() {
		return this.rollNo;
	} // getter method
	public void setName(String name) {
		this.name = name;
	} // setter method
	public String getName() {
		return this.name ;
	} // setter method
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	} // setter method
	public String getCollegeName() {
		return this.collegeName;
	} // setter method
	public void setCourse(String course) {
		this.course = course;
	} // setter method
	public String getCourse() {
		return this.course;
	} // setter method
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	} // setter method
	public int getMarks1() {
		return this.marks1;
	} // setter method
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	} // setter method
	public int getMarks2() {
		return this.marks2;
	} // setter method
	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	} // setter method
	public int getMarks3() {
		return this.marks3;
	} // setter method
	
} // class
