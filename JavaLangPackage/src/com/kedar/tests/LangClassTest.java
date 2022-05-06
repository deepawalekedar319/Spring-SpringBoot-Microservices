package com.kedar.tests;

import java.sql.Date;

public class LangClassTest {

	public static void main(String[] args) {
		
		// get the Class object using .class property
		Class c1 = Test.class;
		System.out.println("Test class properties :: " + c1);
		
		Class c2 = Date.class;
		System.out.println("Date class properties :: " + c2);

	} // main
} // class