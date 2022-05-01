package com.kedar.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.kedar.beans.TargetInjectionClass;

public class ClientTestClass {

	public static void main(String[] args) {
		
		// Using DefaultListableBeanFactory
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		
		// creating the reader object and linking with bean container
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		
		// Loading the cfg file
		reader.loadBeanDefinitions("com/kedar/configurations/applicationContext.xml");
		
		// get the object
		Object object = factory.getBean("target",TargetInjectionClass.class);
		
		// type casting
		TargetInjectionClass target = (TargetInjectionClass)object;
		
		// Calling the b-logic
		target.getClassDetails();
		
	} // main
} // class
