package com.bit.common;

public class Scanario {

	public void targetSearch() {
		
//		ConstructorPractice c = new ConstructorPractice();
//		c.giveData(12345, "Bronx");
//		System.out.println(c.zip);
//		System.out.print(c.city);
//		c.giveData(3453, "Queens");
//		System.out.println(c.zip);
//		System.out.print(c.city);
//		c.giveData(12345, "Bronx");
//		
	}
	
	public void targetCartVerify() {
		ConstructorPractice c2 = new ConstructorPractice(55555, "Brooklyn");
		ConstructorPractice c = new ConstructorPractice();
		ConstructorPractice c1 = new ConstructorPractice(10023, "Manhattan");
		//System.out.println(c.zip);
		//System.out.println(c.city);

		System.out.println(c1.zip);
		System.out.println(c1.city);
		System.out.println(c.zip);
		System.out.println(c.city);
		
		
		System.out.println(c2.zip);
		System.out.println(c2.city);
		
	}
}
