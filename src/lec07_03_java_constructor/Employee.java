package lec07_03_java_constructor;

public class Employee {
	// variables initialized
	public String empName;
	public int empId;
	public char empGender;
	public boolean fullTimeEmployee;
	
	// Constructor are 2 types --
	// default constructor (no argument constructor) and parameterized constructor
	// A class can contain one default constructor and one or (more than one) parameterized constructor
	// Default Constructor must be declared before parameterized constructor.
	// you shouldn't write a parameterized constructor without writing a default constructor. It's a norm.
	
	// default Constructor declared
	public Employee () {
		System.out.println("I am a default Constructor");
	}
	
	// parameterized Constructor declared
	public Employee (String empName) { // here empName is called parameter, in line 5, it is variable
		this.empName = empName;
		System.out.println("My Name: " + empName);
	}
	
	

}
