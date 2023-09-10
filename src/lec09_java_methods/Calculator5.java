package lec09_java_methods;

public class Calculator5 {
	
	float apple = 1.34f;
	float berry = 3.22f;
	
	// return type method
	public float multiplication() {
		float total1 = apple * berry; // local variable
		System.out.println("Multiplication of a and b is: " + total1);
		return total1;
	}
	
	// return type parameterized method
	public float addition (float apple, float berry) {
		// In parameterized method, you don't need 'this' keyword like parameterized constructor
		float total2 = apple + berry;
		System.out.println("Price of Apple and Berry is: " + total2);
		return total2;
	}
	
	// return type parameterized method
	// you don't need to use parameter name, same as variable
	// Also data type can be different, here int is used
	public float subtraction (int orange, int olive) {
		// In parameterized method, you don't need 'this' keyword like parameterized constructor
		int total3 = orange + olive;
		System.out.println("Price of Orange and Olive is: " + total3);
		return total3;
	}
	
	// Parameterized method can be used for void type

}
