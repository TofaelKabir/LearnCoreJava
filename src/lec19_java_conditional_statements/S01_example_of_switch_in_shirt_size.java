package lec19_java_conditional_statements;

public class S01_example_of_switch_in_shirt_size {

	public static void main(String[] args) {
		char size = 'P';
		
		switch (size) {
		
		case 'S':
			System.out.println("Yes, we have your small size Shirt");
			break;
		
		case 'M':
			System.out.println("Yes, we have your medium size Shirt");
			break;
			
		case 'L':
			System.out.println("Yes, we have your large size Shirt");
			break;
			
		case 'X':
			System.out.println("Yes, We have your XL size shirt");
			break;
			
		default:
			System.out.println("Sorry! we don't have your shirt");
			break;
		}

	}

}
