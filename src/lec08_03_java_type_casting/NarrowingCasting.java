package lec08_03_java_type_casting;

public class NarrowingCasting {
// Convert float and double type to other complete number
	public static void main(String[] args) {
		double myGrade = 3.55643;
		System.out.println("My Grade: " + myGrade);
		
		// Convert a double to an int type
		// narrowing casting
		int myNewGradeInInt = (int) myGrade;
		System.out.println("My New Grade: " + myNewGradeInInt);
		
		// Convert a double to an byte type
		byte myNewGradeInByte = (byte) myGrade;
		System.out.println("My New Grade in Byte: " + myNewGradeInByte);
	}

}
