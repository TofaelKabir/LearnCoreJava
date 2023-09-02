package lec08_01_java_constructor;

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
	
	// parameterized Constructor 01 declared
	public Employee (String empName) { // here empName is called parameter, in line 5, it is variable
		this.empName = empName;
		System.out.println("My Name: " + empName);
	}
	
	// parameterized Constructor 02 declared
	public Employee (String empName, int empId) { // here empName is called parameter, in line 5, it is variable
		this.empName = empName;
		this.empId = empId;
		System.out.println("Employee Name: " + empName + ", Id: " + empId);
	}
	
	// parameterized Constructor 03 declared
	public Employee (int empId, String empName) { // here empName is called parameter, in line 5, it is variable
		this.empId = empId;
		this.empName = empName;
		// The sequence of sysout doesn't matter
		// what is the sequence of parameter and argument
		System.out.println("Employee Name: " + empName + ", Id: " + empId);
	}
	
	// parameterized Constructor 04 declared
	public Employee (String empName, int empId, char gender) { // here gender parameter, not same as variable
		this.empName = empName;
		this.empId = empId;
		this.empGender = gender;
		System.out.println("Employee Name: " + empName + ", Id: " + empId + ", Gender: " + gender);
	}
	
	// parameterized Constructor 04 declared
	public Employee (String empName, int empId, char gender, boolean fullTimeEmployee) { 
		this.empName = empName;
		this.empId = empId;
		this.empGender = gender;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("Employee Name: " + empName + ", Id: " + empId + ", Gender: " + gender + " and Full time Employee? Ans: " + fullTimeEmployee);
	}

	

}
