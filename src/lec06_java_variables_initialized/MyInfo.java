package lec06_java_variables_initialized;

public class MyInfo {
	// Inside a class, first variable, then Constructor, then method
	public String myName = "Mohammad Tofael Kabir Sharkar";
	public byte myAge = 127;
	public short myApartmentRent = 32767;
	public int myYearlySalary = 2147483647;
	public long myBankBalance = 9223372036854775807l; 
	public float myHeight = 1.65327f;
	public double myGrade = 3.48657463837;
	public char mySex = 'M';
	public boolean usCitizen = false;
	
	// How to create a Constructor?
	// Constructor name same as Class name, so starts with Upper Case 
	// and follow camel case or snake case feature
	// This Constructor is declared here
	public MyInfo () {
		// Constructor Body
		System.out.println("Hi! This is All about Myself");
	}
	
	// How to create a method?
	// This is a void type method
	// method name generally starts with lower Case 
	// and follow camel case or snake case feature
	// method can't be declared inside class
	// method implemented here
	public void new_york () {
		System.out.println("I am the new_york method");
	}
	
	// there can be more than one methods inside a class with different name
	public void virginia () {
		System.out.println("I am the virginia method");
	}
	
	// method name can be same as class name, but in lower case
	// this is not mandatory to make a method name as class name
	public void myInfo () {
		// method body
		System.out.println("I am myInfo method");
		// Can I call variable inside method body? Yes
		System.out.println(myName);
		System.out.println("My Name: " + myName);
		System.out.println("My Name: " + myName + "\nMyAge: " + myAge);
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy Apartment Rent: " + myApartmentRent
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Balance" + myBankBalance + "\nSex: " + mySex
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);
		
	}
	
	
	
	
	

}
