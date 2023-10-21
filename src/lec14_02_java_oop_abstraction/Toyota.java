package lec14_02_java_oop_abstraction;

// A regular class
// A regular class can inherit only one (regular class or one abstract class) by extends keyword
// A regular class can't inherit an Interface by extends keyword

// implements keyword is used to inherit Interface in regular class
// a regular class can inherit more than one Interface
// a regular class cannot inherit a regular class or abstract class by implements keyword

// if you use extends and implements at the same time, extends will be used before implements
// But implements or extends can be used only [separately], see Mercedez class

public class Toyota extends ElectricCar implements Car, Drone {	
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
	
	// Default methods are allowed only in interfaces, not in regular class
	/*
	public default void toyotaColor () {
		
	}
	*/
	
	// static method can be used inside Regular class
	public static void countryOfOrigin() {
		System.out.println("Made in Japan");
	}

	@Override
	public void rent() {
		System.out.println("rent method from Taxi Interface");
	}

	@Override
	public void carryingPassenger() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void carryingGoods() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lightWeight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void expensive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void canFloat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void autoPilot() {
		// TODO Auto-generated method stub
		
	}
	

}
