package lec11_java_oop;

public class Toyota {	
	// Global variable
	// Inside class, variable can be declared or initialized
	public int priceOfToyota;
	public int yearOfManufacture = 1885;
	
	// Constructor is declared inside Class
	public Toyota () {
		System.out.println("This constructor is from Toyota class");
	}
	
	// method implemented, method is not declared inside a class
	// This method is not abstract method, called non-abstract method
	public void toyotaInfo() {
		System.out.println("Toyota is from Japan");
	}

}
