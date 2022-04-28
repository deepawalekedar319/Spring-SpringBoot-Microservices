package com.kedar.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.kedar.beans.SetterInjectionTest;

public class TestingUserDefinedClass {

	public static void main(String[] args) {
		
		// Holding the configuration location and name
		FileSystemResource resource = new FileSystemResource("src/main/java/com/kedar/configurations/applicationContext.xml");
		
		// creating the container 
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		
		// get the bean class object
		Object object = factory.getBean("target");
		
		// type casting
		SetterInjectionTest test = (SetterInjectionTest)object;
		
		// calling the b-logic
		System.out.println(test.selectedMethod("multiplication"));

	} // main
} // class