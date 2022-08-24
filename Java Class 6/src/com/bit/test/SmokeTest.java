package com.bit.test;

import com.bit.common.ConstructorPractice;
import com.bit.common.HomePage;
import com.bit.common.OverLoadingConcept;
import com.bit.common.Shared;

public class SmokeTest {
	
		public static void main(String[] args) {
			
//			OverLoadingConcept o = new OverLoadingConcept();
//			o.myClick();
//			o.myType();
			
			ConstructorPractice ob = new ConstructorPractice();
			
			ConstructorPractice ob1 = new ConstructorPractice(54235,"OzonePark");
			ConstructorPractice ob2 = new ConstructorPractice(30015,"Airport");

			ob.getData(673645, "Bronx");
			System.out.println(ob.zip);
			System.out.println(ob.city+" \n=============");
			
			System.out.println(ob1.zip);
			System.out.println(ob1.city+" \n=============");
			
			System.out.println(ob2.zip);
			System.out.println(ob2.city+" \n=============");
		

		
//		Shared s = new Shared();
//		
//		s.getData();
//		s.getData(12.5);
//		s.getData(true, (short)12);
//		s.getData(10.4f, 726736883l);
//		s.getData(1234, "gafg");
//		s.getData("Faw", (byte)23);
		
		
	}
}
