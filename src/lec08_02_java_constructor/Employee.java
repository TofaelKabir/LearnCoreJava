package lec08_02_java_constructor;

public class Employee {
	// variables initialized
	public String empName;
	public int empId;
	public char empGender;
	public boolean fullTimeEmployee;
	
	// default Constructor declared
	public Employee () {
		System.out.println("-------- This is all employee Info -------\n");
	}

	public Employee(String empName, int empId, char empGender, boolean fullTimeEmployee) {
		super(); // you can keep it or delete it super(), we will learn later
		this.empName = empName;
		this.empId = empId;
		this.empGender = empGender;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("Employee Name: " + empName + ", Id: " + empId + ", Gender: " + empGender + " and Full time Employee? Ans: " + fullTimeEmployee);
	}
	
	
}
