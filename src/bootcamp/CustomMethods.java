package bootcamp;


public class CustomMethods {
	
	public CustomMethods(int a) {
		System.out.println("Constructor with int arg");
	}
	
	
	public static void main(String[] args) {
		
		String str = "Wooden Spoon";
		
		String result = reverse(str);
		
		
		System.out.println(result);
		
		
		//Arrays.sort()
		
		
		new  CustomMethods(10);
		
		
		
	}
	
	
	
	
	public static String reverse(String str) {
		
		String reverse = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			
			reverse += str.charAt(i);
			
		}
		
		return reverse;
		
	}
	
	
	

}
