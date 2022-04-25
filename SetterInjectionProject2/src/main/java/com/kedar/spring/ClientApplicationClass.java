package com.kedar.spring;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.kedar.beans.OtherClassPropertiesGenerator;

public class ClientApplicationClass {

	public static void main(String[] args) {
		
		// hold the location and name of the bean configuration file
		FileSystemResource resource = new FileSystemResource("src/main/java/com/kedar/configurations/applicationContext.xml");
		
		// create the Bean factory class object
		XmlBeanFactory factoy = new XmlBeanFactory(resource);
		
		// get the bean class object
		Object object = factoy.getBean("target");
		
		// Type casting
		OtherClassPropertiesGenerator other = (OtherClassPropertiesGenerator)object;
		
		System.out.println(other);
		
	} // main
} // class
