package lec05_java_variables;

public class MyInfo {
	//String itself is a class, represents for String type variable here
	// String is not a pure primitive data type, important interview question
	public String myName = "Mohammad Tofael Kabir Sharkar";
	
	// primitive data type - 8 type
	// byte, short, int, long are used for complete number
	public byte myAge = 127;
	public short myApartmentRent = 32767;
	public int myYearlySalary = 2147483647;
	public long myBankBalance = 9223372036854775807l; 
	// we must have to use lower case L (l), at the end of long value
	
	// float and double are used for not a complete number [a number with decimal]
	public float myHeight = 1.65327f;
	// we must have to use lower case f, at the end of float value
	public double myGrade = 3.48657463837;
	// Above 6 types are used for number
	// Mostly int is used for complete number and float for decimal number
	
	public char mySex = 'M';
	public boolean usCitizen = false;
		
	// main method is in MyInfoTest class

}
