package lec08_03_java_type_casting;

public class WideningCasting {

	public static void main(String[] args) {
		// default type access modifier
		byte myHeight = 5;
		System.out.println("My Height in ft: " + myHeight);
		
		// How can you convert it to double?
		// Widening casting
		double myHeightInDouble = myHeight;
		System.out.println("My New Height in ft: " + myHeightInDouble);

	}

}
