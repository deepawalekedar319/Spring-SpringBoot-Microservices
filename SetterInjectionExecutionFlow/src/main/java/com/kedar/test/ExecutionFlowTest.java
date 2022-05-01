package com.kedar.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.kedar.beans.SetterInjectionTargetClass;

public class ExecutionFlowTest {

	public static void main(String[] args) {
		
		//  locate and hold the Configuration file
		//ClassPathResource resource = new ClassPathResource("com/kedar/configurations/applicationContext.xml");
		
		// create the BeanFactoryContainer 
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		
		// Creating the reader object and linking with Container
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		
		// reading the applicationContext file
		reader.loadBeanDefinitions("com/kedar/configurations/applicationContext.xml");
		
		// get the bean class target object
		Object object = factory.getBean("target",SetterInjectionTargetClass.class);
		
		// Type casting
		SetterInjectionTargetClass target = (SetterInjectionTargetClass)object;
		
		// Calling the b-logic
		target.getDetails();
	} // main
} // class
