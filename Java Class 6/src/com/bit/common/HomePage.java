package com.bit.common;

public class HomePage extends OverLoadingConcept{

	public void abc() {
		OverLoadingConcept o = new OverLoadingConcept();
		//o.myClick();
		//o.myType();
		
		myClick();
		myType();
	}
}
