package lec07_01_java_variables_initialized_final;

public class MyInfo {
	// variable initialized
	public String myName = "Mohammad Tofael Kabir Sharkar";
	public byte myAge = 127;
	public short myApartmentRent = 32767;
	public int myYearlySalary = 2147483647;
	public long myBankBalance = 9223372036854775807l; 
	public float myHeight = 1.65327f;
	public double myGrade = 3.48657463837;
	public char mySex = 'M';
	public boolean usCitizen = false;
	
	// Constructor declared
	public MyInfo () {
		System.out.println("------ Hi! This is All about Myself ------");
	}
	
	// method implemented
	public void myInfo () {
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy Apartment Rent: " + myApartmentRent
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Balance" + myBankBalance + "\nSex: " + mySex
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);
		
	}
	
	
	
	
	

}
