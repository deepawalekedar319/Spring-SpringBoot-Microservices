package com.kedar.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.kedar.beans.SampleTestingInjectionClass;

public class ClientTestingClass {

	public static void main(String[] args) {
		
		// hold the location and cfg file name
		FileSystemResource resource = new FileSystemResource("src/main/java/com/kedar/configuration/applicationContext.xml");
		
		// create the XmlBeanFactory class object
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		
		// get the bean class object
		Object object = factory.getBean("testclass");
		
		// Calling the business method
		System.out.println(object);
	} // main
} // class
