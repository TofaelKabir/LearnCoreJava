package lec10_java_methods;

public class Calculator1 {
	// Class Variable or Global Variable
	// default type of access modifier is used, no reason, just for practice
	int a = 56;
	int b = 32;
	
	// void type method
	public void addition () {
		int total1 = a+b; // here total1 is called local variable
		// why? because this variable 'total1' belongs to the addition method
		System.out.println("Addition of a and b is: " + total1);
	}

	
}
