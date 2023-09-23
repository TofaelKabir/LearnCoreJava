package lec11_java_oop;

// Interface names starts with UpperCase 
// They follow Camel case or Snake case pattern.
// CamelCase or Snake_case feature considered from second word, not from first word
// CamelCase example for an Interface --> CarToyota
// Snake_case example for an Interface --> Car_toyota

// What is Interface?
// Interface is a Blueprint of the Class.
// An interface is a collection of methods that are defined (declared) but not implemented. 

public interface Car {
	// Global variable
	// Inside Interface, variable can not be declared, see line 16
	// public int year;
	
	// Interview question: Can we declare variables inside Interface? Line 16
	// No, we must have to initialize
	// what is the feature of variable that can be used inside Interface?
	// the variables inside Interface are initialized, final and static in nature.
	public static final int invented = 1880;
	// final means you can't change it
	// static means -- that property is a personal property of the Interface / class
	// other Class or Interface can't use it
	
	// Interview question: Does Interfaces have constructors?
	// Ans: Interfaces cannot have constructors
	/*
	public Car () {
		
	}
	*/
		
	// method declared
	// when methods are declared, they are called abstract method
	public void start ();
	// using abstract keyword for abstract method inside Interface is not mandatory
	public abstract void stop();
	public String brake();
}
