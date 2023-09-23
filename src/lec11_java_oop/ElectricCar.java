package lec11_java_oop;


// Abstract Class names starts with UpperCase like a regular class
// They follow Camel case or Snake case pattern.
// CamelCase or Snake_case feature considered from second word, not from first word
// CamelCase example for an Abstract Class --> ElectricCar
// Snake_case example for an Abstract Class --> Electric_car

// Abstract Class contains both abstract and non abstract methods

public abstract class ElectricCar {
	// Global variable
	// Inside Abstract class, variable can be declared or initialized
	public int costOfTesla;
	public String manufacturer = "Tesla";
	
	// Can you Declare a Constructor inside Abstract class? Ans: Yes
	public ElectricCar () {
		System.out.println("This constructor is from Abstract class-- Electric Car");
	}
	// Important Interview question: Can a Constructor of an Abstract class be initialized?
	// When we will instantiate the Abstract class, we will get that answer that time
	
	// non abstract method is implemented here
	public void battery() {
		System.out.println("The battery is very efficient and is from ElectricCar Abstract class");
	}
	
	// method declared below
	// when method is declared, that method is also called abstract method
	// This is mandatory to put abstract keyword with the abstract method inside Abstract Class
	// This is the norm/rules to write at least one abstract method inside abstract class
	public abstract void price();

}
