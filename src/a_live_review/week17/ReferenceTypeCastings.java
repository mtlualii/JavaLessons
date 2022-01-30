package a_live_review.week17;

import a_live_review.week16.Cube;
import a_live_review.week16.Shape;
import a_live_review.week16.Volume;

public class ReferenceTypeCastings {
	
	public static void main(String[] args) {
		int a = 10;
		double b = a; // implicit casting
		double b2 = (double) a;
		
		
		short s = (short)b; // explicit casting
		
		System.out.println("----------------------------------------------------------");
		
		Shape shape1 = new Cube(10); // upcasting
		
		
		//shape1.volume(); //in polymorphism, reference type decides what we can call
		
		//  ( (Cylinder)shape1 ).volume(); // Cube IS NOT A cylinder
		
		 ( (Volume)shape1 ).volume(); // Cube Is A Volume
		( (Cube)shape1 ).volume(); // Cube IS A Cube
		
		
		
	}
	

}
