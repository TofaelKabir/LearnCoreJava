package lec17_java_conditional_statements;

public class CompareNumber01 {

	public static void main(String[] args) {
		int val1 = 43;
		int val2 = 43;
		
		// Here val1 > val2 is condition
		// if condition is true, the program will move to condition body
		if(val1 > val2) {
			// if body
			System.out.println(val1 + " is greater than " + val2);
		} else {
			System.out.println(val1 + " is smaller than " + val2); // not correct
		}
		// else accept everything, so no condition there
		// so using else, might not be meaningful  when val1 and val2 is equal
		// so we need more conditions
		

	}

}
