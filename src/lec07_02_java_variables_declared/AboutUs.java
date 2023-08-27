package lec07_02_java_variables_declared;

public class AboutUs {
	// variables declared
	public String myName;
	public byte myAge;
	public short myApartmentRent;
	public int myYearlySalary;
	public long myBankBalance; 
	public float myHeight;
	public double myGrade;
	public char myGender;
	public boolean usCitizen;
	
	// Constructor declared
	public AboutUs () {
		System.out.println("Hi! This is All about Myself");
	}
	
	// method implemented
	public void myInfo () {
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy Apartment Rent: " + myApartmentRent
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Balance: " + myBankBalance + "\nGender: " + myGender
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);
		
	}
	
	// When no values assigned for variables, after execution, they show default value
	// The default value for String is null
	// The default value for byte is 0
	// The default value for short is 0
	// The default value for int is 0
	// The default value for long is 0
	// The default value for float is 0.0
	// The default value for double is 0.0
	// The default value for char is some unicode, which come from ASCII table
	// eclipse can't express default value of char, IntelliJ idea can do
	// The default value for boolean is false

	
	
	
	

}
