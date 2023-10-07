package lec13_02_java_oop_encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		// Parameterized Constructor initialized, which provide the set value
		Employee emp = new Employee("Tofael", 100, 'M', false); 
		System.out.println("The Employee Name is: " + emp.getName() + "\nEmployee Age: " + emp.getAge()+"\nEmployee Sex: " + emp.getGender()+"\nand Is US Citizen? Ans: " +emp.isUsCitizen());

	}

}
