package com.kedar.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.kedar.beans.TargetInjectionClass;

public class ClientInjectionClass {
	
	public static void main(String[] args) {
		
		// create the DefaultListableBeanFactory object
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		
		// create the Xml reader and link with container
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		
		// read the configuration file
		reader.loadBeanDefinitions("com/kedar/configurations/applicationContext.xml");
		
		// get the object and type caste it
		TargetInjectionClass target = (TargetInjectionClass)factory.getBean("target");
		
		// Call the b-logic methods
		target.getTheStudentDetails();
		
	}	// main	
} // class