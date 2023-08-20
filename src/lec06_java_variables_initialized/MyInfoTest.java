package lec06_java_variables_initialized;

public class MyInfoTest {

	public static void main(String[] args) {
		// When an object is created from a class [myInfo], Constructor is initialized
		// When an object is created from a class, the class is instantiated
		MyInfo myInfo = new MyInfo(); // Constructor Initialized here
		// object can access all the properties of a class from where it is created
		// here new_york is the property of MyInfo class
		// object can access me
		// method initialized here by object
		myInfo.new_york();
		myInfo.virginia();
		myInfo.myInfo();
	}

}
