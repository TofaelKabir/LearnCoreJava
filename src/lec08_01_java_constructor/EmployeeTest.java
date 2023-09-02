package lec08_01_java_constructor;

public class EmployeeTest {

	public static void main(String[] args) {
		// default Constructor Initialized
		// in line 8, there is no argument inside parentheses
		Employee employee = new Employee(); 
		
		// parameterized Constructor 01 Initialized
		// How? we pass the value of parameter inside parentheses body
		// Here 'Zahra Tazmeen' is called Argument and this is String type
		// Why String type? Why inside double quotation?
		// because parameter is String type
		Employee zahraa = new Employee("Zahraa Tazmeen");
		Employee rubayyi = new Employee("Rubayyi Saaim");
		Employee nabeeha = new Employee("Nabeeha Tahsin");
		Employee raiyan = new Employee("Raiyan Saaim");
		// although parameterized constructor is declared once, you can initialize it as many times as you want

		// parameterized Constructor 02 Initialized
		System.out.println("-----------------------------------------\n");
		Employee emp1 = new Employee ("Alex", 67823);		
		Employee emp2 = new Employee ("Albert", 37823);		
		
		
		// parameterized Constructor 03 Initialized
		System.out.println("-----------------------------------------\n");
		Employee emp3 = new Employee (37823, "Ben");	
		
		// parameterized Constructor 04 Initialized
		System.out.println("-----------------------------------------\n");
		Employee emp4 = new Employee ("Elena", 56733, 'F');	
		
		// parameterized Constructor 05 Initialized
		System.out.println("-----------------------------------------\n");
		Employee emp5 = new Employee ("Medeline", 66733, 'F', true);	

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
