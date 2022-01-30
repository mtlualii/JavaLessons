package bootcamp;

public class Primitives {

	public static void main(String[] args) {
		
		byte a = 100;
		int b = a;  // implicit casting
		
		
		long l = 200;
		short s = (short)l; // explicit casting
		
		System.out.println("-----------------------------");
		
		int n1 =  100;
		
		Integer n2 =n1;  //auto boxing
		
		
		Double d1 = 2.5;
		double d2 = d1;  //unboxing
		
		
		String str = "123";
		int num = Integer.parseInt(str);
		Integer num2 = Integer.valueOf(str);
		
		
		
	}
	
	
}
