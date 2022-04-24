package com.kedar.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.kedar.injection.ConstructorInjectionClass;

public class ConstructorInjectionTestingClass {

	public static void main(String[] args) {
		
		// hold the location and file name of Configuration file
		FileSystemResource resource = new FileSystemResource("src/main/java/com/kedar/configuration/applicationContext.xml");
		
		// create the XmlBeanFactory class objet
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		
		// get the spring bean class object
		Object object = factory.getBean("targetClass");
		
		// type casting
		ConstructorInjectionClass injection = (ConstructorInjectionClass)object;
		
		// Calling the methods
		injection.getTodaysDate();
		
	} // main
} // class
