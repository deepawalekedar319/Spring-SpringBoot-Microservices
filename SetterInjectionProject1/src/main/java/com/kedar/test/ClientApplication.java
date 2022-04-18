package com.kedar.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.kedar.beans.WishMessageGenerator;

public class ClientApplication {

	public static void main(String[] args) {
		
		// CLient user
		
		//  create FileSystemResource object i.e hold the name and location
		FileSystemResource file = new FileSystemResource("src/main/java/com/kedar/configurations/applicationContext.xml");
		
		//  create BeanClass object
		XmlBeanFactory factory = new XmlBeanFactory(file);
		
		// get the object
		Object object = factory.getBean("getWishMessage");
		
		// Type caste object to WishMessageGenerator class
		WishMessageGenerator generator = (WishMessageGenerator)object;
		
		// call the method
		String message = generator.getWishMessage("Kedar");
		
		// print the message
		System.out.println(message);

	} // main
} // class
