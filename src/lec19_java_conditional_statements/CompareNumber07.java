package lec19_java_conditional_statements;

import java.util.Scanner;

public class CompareNumber07 {
	// Why static? Non static method or variable can't be called inside static main method
	// static means, other class can't access any static variables, methods etc.
	// Why static? Non static method or variable can't be called inside main method
	static Scanner scanner = new Scanner(System.in);
	static int val1 = scanner.nextInt();
	static int val2 = scanner.nextInt();
	
	// Condition by team: If val1 < val2, multiply val1 with val2
	public static void multiplication() {
		int mult = val1*val2;
		System.out.println("Multiplication Result is: " + mult);
	}
	
	// Condition by team: If val1>val2, divide val1 by val2
	public static void division () {
		int div = val1/val2;
		System.out.println("Division Result is: " + div);
	}
	
	// Condition by team: If val1 == val2, do an addition of val1 and val2
	public static void addition () {
		int add = val1 + val2;
		System.out.println("Addition Result is: " + add);
	}
	
	// New here
	public static void outCome() {
		if (val1<val2) {
			multiplication(); // What we learn? Inside if else condition, we can call method
		} else if (val1>val2) {
			division();
		} else if (val1==val2) {
			addition();
		} else {
			System.out.println("Please provide a correct Value");
		}
	}
	
	public static void main(String[] args) {
		// Without Creating an object you can call a method or variable inside main method, if thye are static
		// Interview Question
		System.out.println("---: After putting the numbers above :---");
		outCome(); 
		scanner.close();
	}

}
