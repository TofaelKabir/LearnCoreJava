package lec09_java_methods;

public class Calculator2 {
	// Class Variable or Global Variable
	// default type of access modifier is used, no reason, just for practice
	int a = 56;
	int b = 32;
	
	String fName = "Mohammad";
	String lName = "Sharkar";
		
	// void type method (kept here for comparison)
	public void addition () {
		int total1 = a+b; 
		System.out.println("Addition of a and b is: " + total1);
	}
	
	// return type method (int type)
	public int subtraction () {
		int total2 = a-b;
		System.out.println("Subtraction of a and b is: " + total2);
		return total2;
	}
	
	// return type method (String type)
	public String myName () {
		String fullName = fName + " " + lName;
		System.out.println("My Full Name: " + fullName);
		return fullName;
	}
	
	// return type method (int type)
	public int multiplication () {
		System.out.println("Multiplication of a and b is: " + (a*b));
		return a*b; // sometimes people write like this
	}
	
	
	
	
	
	
	

	
}
