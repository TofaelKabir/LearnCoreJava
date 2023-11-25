package lec19_java_conditional_statements;

public class CompareNumber05 {

	public static void main(String[] args) {
		int val1 = 13;
		int val2 = 15;
		
		// We have to use logical or operator with care to make sure the meaning of the outcome doesn't change
		if (val1 % 2 == 0 || val1 < val2) {
			System.out.println(val1+" is an Even Number or " + val1 + " is less than " + val2);
		} else if (val1 % 2 == 0 || val1 > val2) {
			System.out.println(val1+" is an Even Number or " + val1 + " is greater than " + val2);
		} else if (val1 % 2 == 1 || val1 < val2) {
			System.out.println(val1+" is an Odd Number or " + val1 + " is less than " + val2);
		} else if (val1 % 2 == 1 || val1 > val2) {
			System.out.println(val1+" is an Odd Number or " + val1 + " is greater than " + val2);
		} else if (val1 % 2 == 0 || val1 == val2) {
			System.out.println(val1+" is an Even Number or " + val1 + " is equal to " + val2);
		} else if (val1 % 2 == 1 || val1 == val2) {
			System.out.println(val1+" is an Odd Number or  " + val1 + " is equal to " + val2);
		} else {
			System.out.println("The system failed to execute your order");
		}

	}

}
