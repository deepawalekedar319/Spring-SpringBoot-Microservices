package com.kedar.beans;

public class OtherClassPropertiesGenerator {
	
	// properties
	public int sno;
	public String sname;
	public String saddress;
	public double avg;
	public String course;
	
	// Setter methods
	public void setSno(int sno) {
		this.sno = sno;
	} // setter
	public void setSname(String sname) {
		this.sname = sname;
	} // setter
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	} // setter
	public void setAvg(double avg) {
		this.avg = avg;
	} // setter
	public void setCourse(String course) {
		this.course = course;
	} // setter
	
	// toString() method
	@Override
	public String toString() {
		return "OtherClassPropertiesGenerator [sno=" + sno + ", sname=" + sname + ", saddress=" + saddress + ", avg="
				+ avg + ", course=" + course + "]";
	} // method	
	
} // class
