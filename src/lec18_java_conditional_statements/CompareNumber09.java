package lec18_java_conditional_statements;

import java.util.Random;

public class CompareNumber09 {

	public static void main(String[] args) {
		System.out.println("---: Please put number belows :---");
		Random random = new Random();
		// you can put limit, limit is always positive
		// if no limit, then it will choose from any int number from the int range, either positive or negative
		int val1 = random.nextInt(1000);
		int val2 = random.nextInt(1000);
		
		if (val1 % 2 == 0) { // outer if block
			if (val1>val2) { // inner if block
				System.out.println(val1+" is an Even Number and " + val1 + " is greater than " + val2);
			} else if (val1<val2) { // inner if else block
				System.out.println(val1+" is an Even Number and " + val1 + " is less than " + val2);
			} else if (val1>=val2) {
				System.out.println(val1+" is an Even Number and " + val1 + " is greater than or equal to " + val2);
			} else if (val1<=val2) {
				System.out.println(val1+" is an Even Number and " + val1 + " is less than or equal to " + val2);
			}
		} else if (val1% 2 ==1) { // outer else if block
			if (val1>val2) {
				System.out.println(val1+" is an Odd Number and " + val1 + " is greater than " + val2);
			} else if (val1<val2) {
				System.out.println(val1+" is an Odd Number and " + val1 + " is less than " + val2);
			} else if (val1>=val2) {
				System.out.println(val1+" is an Odd Number and " + val1 + " is greater than or equal to " + val2);
			} else if (val1<=val2) {
				System.out.println(val1+" is an Odd Number and " + val1 + " is less than or equal to " + val2);
			} else if (!(val1==val2)) {
				System.out.println(val1+" is an Odd Number and " + val1 + " is not equal to " + val2);
			}
		} else { // outer else block
			System.out.println("The system failed to execute your order");
		}
	}

}
