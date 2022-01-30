package bootcamp;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int[] array = new int[5]; // index: 0 ~ 4
		array[0] = 100;
		array[1] = 200;
		array[2] = 300;
		array[3] = 400;
		array[4] = 500;
	//	array[5] = 600;
		
		
		System.out.println(Arrays.toString(array));
		
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		System.out.println("---------------------------------");
		
		int[] numbers = {10, 20, 30, 40, 50};
		
		int[] reversed = new int[numbers.length];
		
		
		for(int i = numbers.length-1, j = 0 ;  i >= 0; i--, j++) {
			reversed[j] = numbers[i];
		}
		
		System.out.println(Arrays.toString(reversed));
		
		System.out.println("---------------------------------");
		
		for(int each : numbers ) {
			System.out.println(each);
		}
		
		
		
		
	}
	
}
