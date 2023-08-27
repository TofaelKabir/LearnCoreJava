package lec07_03_java_constructor;

public class EmployeeTest {

	public static void main(String[] args) {
		// default Constructor Initialized
		// in line 8, there is no argument inside parentheses
		Employee employee = new Employee(); 
		
		// parameterized Constructor Initialized
		// How? we pass the value of parameter inside parentheses body
		// Here 'Zahra Tazmeen' is called Argument and this is String type
		// Why String type? Why inside double quotation?
		// because parameter is String type
		Employee zahraa = new Employee("Zahraa Tazmeen");
		Employee rubayyi = new Employee("Rubayyi Sayem");
		Employee nabeeha = new Employee("Nabeeha Tahsin");
		Employee raiyan = new Employee("Raiyan Sayem");
		// although parameterized constructor is declared once, you can initialize it as many times as you want

		// next class we will use more than one parameter
	}

}
