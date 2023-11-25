package lec18_java_conditional_statements;

import java.util.Scanner;

public class UseOfScannerClass {

	public static void main(String[] args) {
		System.out.println("---: Please put your age below :---");
		Scanner scanner = new Scanner(System.in);
		int age1 = scanner.nextInt();
		int age2 = scanner.nextInt(); // is used to write an int
				
		System.out.println("---: Please put your name below :---");
		Scanner scanner1 = new Scanner(System.in);
		String name1 = scanner1.nextLine();
		String name2 = scanner1.nextLine(); // is used to write a String
		
		System.out.println("Welcome, " + name1 + ", Your Age is " + age1);
		System.out.println("Welcome, " + name2 + ", Your Age is " + age2);
		
		scanner.close();
		
		
	}

}
