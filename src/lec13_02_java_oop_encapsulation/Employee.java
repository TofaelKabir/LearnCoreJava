package lec13_02_java_oop_encapsulation;

public class Employee {
	private String name;
	private int age;
	private char gender;
	private boolean usCitizen;
	
	// parameterized constructor
	public Employee(String name, int age, char gender, boolean usCitizen) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.usCitizen = usCitizen;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public boolean isUsCitizen() {
		return usCitizen;
	}
}
