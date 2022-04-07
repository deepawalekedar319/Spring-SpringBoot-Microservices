package com.kedar.client;

import com.kedar.spring.JavaBeanExample;
import com.kedar.spring.ServerMachine;

public class FirstClient {

	public static void main(String[] args) {
		
		// Create the JavaBean Class Object 
		JavaBeanExample bean = new JavaBeanExample();
		
		// Create the ServerMachine class object
		ServerMachine machine = new ServerMachine();
		
		// Set the values to bean class properties
		bean.setName("D. Kedar Singh");
		bean.setCollegeName("MCET");
		bean.setCourse("Computer Science ");
		bean.setMarks1(100);
		bean.setMarks2(100);
		bean.setMarks3(100);
		
		// Pass this bean object to ServerMachine class method
		machine.getAllStudentDetails(bean);
	} // main
} // class
