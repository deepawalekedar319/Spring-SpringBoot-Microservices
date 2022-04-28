package com.kedar.beans;

public class SetterInjectionTest {
	
	// HAS-A property
	SetterInjectionDependentClass dependent;
	
	public void setDependent(SetterInjectionDependentClass dependent) {
		this.dependent = dependent;
	} // setter method
	
	// calling methods by passing inputs
	public int selectedMethod(String mName) {
		int result = 0;
		if(mName.equalsIgnoreCase("addition"))
			result = dependent.addNumbers();
		else if(mName.equalsIgnoreCase("substraction"))
			result = dependent.subNumbers();
		else if(mName.equalsIgnoreCase("multiplication"))
			result = dependent.multiplyNumbers();
		return result;
	} // method

} // class