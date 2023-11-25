package lec18_java_conditional_statements;

public class CompareNumber10 {

	public static void main(String[] args) {
		/*
		 int age1 = 19;
		 
		 if (age1 < 18) { 
		 System.out.println("You can't vote"); 
		 } else {
		 System.out.println("You are a voter, you can vote"); }
		 */
		int age = 18;
		String outcome = (age < 18) ? "You can't vote" : "You are a voter, you can vote";
		System.out.println(outcome);
        // high level, just keep the code
	}

}
