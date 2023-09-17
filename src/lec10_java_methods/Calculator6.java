package lec10_java_methods;

public class Calculator6 {
	
	// Parameterized method can be void type too
	public void employee (String empName, int empId, char empZender, boolean fullTimeEmployee) {
		System.out.println("The Employee Name is: " + empName + ", Employee Id: " + empId+", Employee Sex: " + empZender +" and Full time Employee? Ans: " + fullTimeEmployee); 
	}
	
	// Please see below for the methods inside allMethods()
	// In the industry the created methods are not written sequentially rather what method you need finally
	public void allMethods (int a, int b) {
		addition(a, b);
		subtraction(a, b);
		multiplication(a, b);
		division(a, b);		
	}

	// return type parameterized method
	public int addition(int a, int b) { // Parameter
		int total1 = a + b; // local variable
		System.out.println("Addition of a and b is: " + total1);
		return total1;
	}

	// return type parameterized method
	public int subtraction(int a, int b) { // Parameter
		int total2 = a - b; // local variable
		System.out.println("Subtraction of a and b is: " + total2);
		return total2;
	}

	// return type parameterized method
	public int multiplication(int a, int b) {
		int total3 = a * b;
		System.out.println("Multiplication of a & b: " + total3);
		return total3;
	}

	// return type parameterized method
	public int division(int a, int b) {
		int total4 = a / b;
		System.out.println("Division of a & b: " + total4);
		return total4;
	}
	
	
	
	
	
	
	

}
