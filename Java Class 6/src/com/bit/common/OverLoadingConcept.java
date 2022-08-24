package com.bit.common;

public class OverLoadingConcept extends InheritancePractice {

	//when we need multiple methods with same name in the same class, we can use method overloading concept
	// we have to each method unique by changing the parameter size or type or sequence
	
	// method access modifier can be same or different
	// return can be same or different
	// compile time polymorphism
	
	
	public void sample() {
		//calling properties through object creation 
		//InheritancePractice i = new InheritancePractice();
		//i.myClick();
		//i.myType();
		//String h = i.d;
		//System.out.println(i.s);
		
		//calling properties through inheritance 
		myClick();
		myType();
		String h1 = d;
		System.out.println(s);
		
		
	}
	
	/*	
	//when we need multiple methods with same name in the same class, we can use method Overloading concept
	//we have to make each method unique by changing the parameter size OR type OR sequence 
	
	method access modifier can be same or different 
	return type can be same or different 
	compile time polymorphism 
*/
	
	
	public void getData(int zip) {
		
	}

	public void getData(String adress) {
		
	}
	
	public void getData(boolean zip) {
		
	}
	
	public void getData(String adress, int phone) {
		
	}
	
	public void getData(int phone, String adress) {
		
	}
	
	public void getData(int a, String n,int b) {

		System.out.println("This are int and String");
	}

	public void getData(double d) {

		System.out.println("This is a double");
	}

	public void getData(String n, byte b) {

		System.out.println("This are String and byte");
	}

	public void getData(boolean b, short s) {

		System.out.println("This are Boolean and Short");
	}

	public void getData(float f, long l) {
		
		System.out.println("This are Float and Long");
	}


	public void getData() {
		System.out.println("This is not papameterized");
	}
}
