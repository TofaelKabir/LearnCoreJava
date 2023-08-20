package lec05_java_variables;

public class MyInfoTest {

	public static void main(String[] args) {
		// You have to create object inside main method

		// MyInfo (blue color) is a class, myInfo (yellow color) is an object, also
		// called reference type variable
		// object name always start with lower case, follow camel case or snake case
		// feature
		// = equal operator, new is a keyword of Java

		// What happened below?
		// an object is created (myInfo) (by you) from MyInfo class (following
		// blueprint) which (object) is new and MyInfo type
		// This action (line 40) --> (when an object is created from a class) is called
		// instantiation, (vvImp info)
		// Then we say the class (MyInfo) is instantiated
		// Class Instantiated

		// here myInfo is the object
		MyInfo myInfo = new MyInfo();
		// variable is called or executed by object, and we can see the outcome inside
		// syso
		System.out.println(myInfo.myName);
		System.out.println(myInfo.myAge);
		System.out.println(myInfo.myApartmentRent);
		System.out.println(myInfo.myYearlySalary);
		System.out.println(myInfo.myBankBalance);
		System.out.println(myInfo.myHeight);
		System.out.println(myInfo.myGrade);
		System.out.println(myInfo.mySex);
		System.out.println(myInfo.usCitizen);
		// We can use String to make our outcome meaningful
		System.out.println("My Name: " + myInfo.myName);
		// you can use more than one String
		System.out.println("My Name: " + myInfo.myName + "\nMy Age: " + myInfo.myAge);

		System.out.println("-----------------------------------------------------------------------");
		// Next line, we printed all the outcome with String Concatenation
		System.out.println("My Name: " + myInfo.myName + "\nMy Age: " + myInfo.myAge + "\nMy Apartment Rent: "
				+ myInfo.myApartmentRent + "\nYearly Salary: " + myInfo.myYearlySalary + "\nMy Bank Balance"
				+ myInfo.myBankBalance + "\nSex: " + myInfo.mySex + "\nMy Height: " + myInfo.myHeight + "\nMy Grade: "
				+ myInfo.myGrade + "\nAm I US Citizen? Ans: " + myInfo.usCitizen);

		// we can create more than one object from the class
		MyInfo myInfo2 = new MyInfo();
		System.out.println(myInfo2.myAge);
		
		// yellow highlight means warning! it means this is not used yet
		MyInfo myInfo3 = new MyInfo();
		MyInfo tofael = new MyInfo();
		MyInfo nabeeha = new MyInfo();
		System.out.println(myInfo2.myName);
		
	}

}
