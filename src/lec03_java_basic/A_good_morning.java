package lec03_java_basic;

// we will learn print() vs println()
// println() is mostly used

public class A_good_morning {
	public static void main(String[] args) {
		System.out.println("Good Morning");
		System.out.print("How are you all? ");
		System.out.print("Do you Understand the function of print?");
		System.out.println(" If Yes, Great!");
		// although first line is println(), but the next 3 is print() and it will continue printing together
		System.out.println("If No, Please ask me question");
		System.out.println("Thank you");
		
		// what println() method do? -- Terminates the current line by writing the line separator string.
		// println() -- print line by line
		// print() -- print continuously, not line by line, connect the next outcome
		// you can make it readable by putting a space at the end or at the beginning of next line
		
		// to print any error -- syserr
		// for you guys, no need
		System.err.println("This is Used for Error, Color in console? Ans: Red");
		
	}

}
