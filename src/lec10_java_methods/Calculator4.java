package lec10_java_methods;

public class Calculator4 {
	int a = 73;
	int b = 13;
			
	// return type method
	public int addition () {
		int total1 = a+b; 
		System.out.println("Addition of a and b is: " + total1);
		subtraction(); // New: we can call a method inside another method
		return total1;
	}
	
	// return type method
	public int subtraction () {
		int total2 = a-b;
		System.out.println("Subtraction of a and b is: " + total2);
		return total2;
	}
	
	

	
}
