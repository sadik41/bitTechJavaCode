package com.bit.common;

public class ConstructorPractice {
	
	/*
	 * what is constructor?
	 * why do we need constructor?
	 * how can we use constructor ?
	 * benefit of using constructor ?
	 * 
	 * 
	 * constructor is a special type of method 
	 * we use constructor to change an object 
	 * constructor gets executed when we create the object of that class
	 * we can create more then one constructor using method overloading concept
	 * whenever we change any object using a constructor, that change value is saved against that reference
	 * 
	 * 
	 * constructor name must be the class name 
	 * constructor doesn't have any return type 
	 * access modifier can be same or different 
	 */
	
	public int zip =10213;
	public String city = "Queens";
	
	public void getData(int zip, String city) {
		
		this.zip = zip;
		this.city = city;
		
	}
	
	public ConstructorPractice(int zip, String city){
		
		this.zip = zip;
		this.city = city;
		
	}

	public ConstructorPractice() {
		// TODO Auto-generated constructor stub
	}
	
	

}
