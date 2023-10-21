package lec14_01_java_oop_use_of_super_in_child_class;

// Child class
public class Employee extends MountSinai {
	// Global variable declared
	public String empName;
	public int empId;
	public char sex;
	public boolean fullTimeEmp;
	
	// default Constructor
	public Employee () {
		// we use super method to call the constructor of super (parent/base) class 
		// try to put the super method (after sysout of default constructor) and find the below outcome
		// Constructor call must be the first statement in a constructor of child class 
		// We can call only one super() method inside constructor
		// Either default (line 19)  or parameterized constructor (line 20) can be called/initialized by super method from the super class,
		// That's why we use java comments in the below line 19
		// super(); // represents the default constructor of super/parent class
		super ("Bronx", 6); // represents the parameterized constructor of super/parent class
		
		// super keyword is used to call (initialize) any types of method from super (Parent) class
		super.msInfo();
		super.mountSinaiInfo("Staten Island", 8);
		
		// super keyword is used to call (initialize) the variables of super (Parent) class
		super.inNewYorkCity = true;
		super.rating = 8.99f;
		System.out.println("Is this hospital in NY City? Ans: " + inNewYorkCity + " and The rating is: " + rating);
		
		System.out.println("This is a default constructor from the Child class Employee");		
	}

	// parameterized Constructor
	// Inside Parameterized Constructor, super() and super keyword do same function like they did inside default constructor
	public Employee(String empName, int empId, char sex, boolean fullTimeEmp) {
		// super();
		super("Brooklyn", 9);
		
		super.msInfo();
		super.mountSinaiInfo("Nassau County", 10);
		
		super.inNewYorkCity = false;
		super.rating = 8.67f;
		System.out.println("Is this hospital in NY City? Ans: " + inNewYorkCity + " and The rating is: " + rating);
		
		this.empName = empName;
		this.empId = empId;
		this.sex = sex;
		this.fullTimeEmp = fullTimeEmp;
		System.out.println("Name: " + empName + ", Id: " + empId + ", Sex: " + sex + " and Full time employee? : " + fullTimeEmp);
	}
	
	// void type or no return method or non parameterized method
	public void empInfo() {
		// we can't call constructor of super class inside a method of child class.
		// super();
		
		super.msInfo();
		super.mountSinaiInfo("Orange County", 15);
		
		super.inNewYorkCity = false;
		super.rating = 9.2f;
		System.out.println("Is this hospital in NY? Ans: " + inNewYorkCity + " and The rating is: " + rating);	
			
		System.out.println("This is a void type method from Employee Class");
	}
	
	// parameterized Constructor
	public void employeeInfo(String empName, int empId, char sex, boolean fullTimeEmp) {
		// we can't call constructor of super class inside a method of child class.
		// super();
		
		super.msInfo();
		super.mountSinaiInfo("Staten Island", 19);
		
		super.inNewYorkCity = true;
		super.rating = 9.8f;
		System.out.println("Is this hospital in NY? Ans: " + inNewYorkCity + " and The rating is: " + rating);
		System.out.println("Name: " + empName + ", Id: " + empId + ", Sex: " + sex + " and Full time employee? : " + fullTimeEmp);
	}

	
	
	
	
	
	
	
	
	

}
