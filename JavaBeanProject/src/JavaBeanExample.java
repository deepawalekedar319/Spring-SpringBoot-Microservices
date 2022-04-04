@SuppressWarnings("serial")
public class JavaBeanExample implements java.io.Serializable{
	
	// The properties must be private and non-static
	private int rollNumber;
	private String name;
	private String course;
	private String collegeName;
	private int marks1, marks2, marks3;
	
	// Setter and Getter methods for each property
	
	public int getRollNumbe() {
		return this.rollNumber;
	} // get method for roll number
	public void setRollNumbe(int rollNumber) {
		 this.rollNumber = rollNumber;
	} // set method for roll number
	
	public String getName() {
		return this.name;
	} // get method for name
	public void setName(String name) {
		this.name = name;
	} // set method for name
	

	public String getcourse() {
		return this.course;
	} // get method for course
	public void setCourse(String course) {
		this.course = course ;
	} // get method for course
	
	
	public String getCollegeName() {
		return this.collegeName;
	} // get method for college name
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName ;
	} // get method for college name
	

	public int getMarks1() {
		return this.marks1;
	} // get method for marks1
	public void setMarks1(int marks1) {
		this.marks1 = marks1 ;
	} // get method for marks1
	
	public int getMarks3() {
		return this.marks3;
	} // get method for marks1
	public void setMarks3(int marks3) {
		this.marks3 = marks3 ;
	} // get method for marks1
	
	public int getMarks2() {
		return this.marks2;
	} // get method for marks1
	public void setMarks2(int marks2) {
		this.marks2 = marks2 ;
	} // get method for marks1
	
} // class