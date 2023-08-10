package lec04_java_variables;

public class B_all_about_variables {
	// This is called class body
	// A class body contain what?
	// First variable
	// Second Constructor
	// Third Method
	// Finally main method at the end
	// Different types of variable: String, int, char, boolean, float, double, byte, short, long --- 8 types
	// We will learn today 4 type: String, int, char, boolean -- mostly used	
	
	// variable is also called field [memorize it]
	// Syntax of the variable ended with ;
	
	// here, public is access modifier, String is the type of the variable, myName is the name of the variable
	// variables name start with lower case and follow camel case or snake case feature.
	
	public String myName;
	public String my_school_name;
	
	// First: Class body contain variables
	// Those variables can be either declared (no value assigned) or initialized (value assigned) 
	
	// variable name can't be duplicated
	public String stateName; // variable declared
	// String type values are always inside double quotation
	public String cityName = "Chantilly"; // variable initialized
	
	// public, private, protected, default --> They are access modifier (they represent accessibility), 
	// variable initialized below, just to show in writing of different type of access modifier, there is no difference
	public String firstName = "Mohammad"; // public type access modifier
	private String middleName = "Tofael"; // private type access modifier
	protected String middle_name = "Kabir"; // protected type access modifier
	String lastName = "Sharkar"; // default type access modifier, when public, private or protected are absent
	
	// we write int (but we say it --> integer) is the type of the variable, myAge is the name of the int type variable
	// int type variable is initialized without any quotation
	public int myAge = 100;
	public int my_yearly_income; // declared
	
	// we write char (but we say it --> Char, but it represents Character) = type of the variable, mySex is the name of the char type variable
	// char type variable is initialized inside single quotation, 
	// and represented by upper case single letter, No number
	public char mySex = 'M';
	
	// boolean = type of the variable, fullTimeStudent is the name of the boolean type variable
	// boolean type variable is initialized without any quotation, only represented by true or false (always in lower case)
	public boolean fullTimeStudent = true;
	public boolean usCitizen = false;
	public boolean usResident = true;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// This is called main method body
	}
}
