package lec10_java_methods;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator1 cal1 = new Calculator1();
		cal1.addition();
		
		System.out.println("--------------------------------");
		Calculator2 cal2 = new Calculator2();
		cal2.subtraction();
		cal2.myName();
		cal2.multiplication();
		cal2.division();
		
		System.out.println("--------------------------------");
		Calculator3 cal3 = new Calculator3();
		// Object cal3 is not calling/initializing any method
		// How we are getting all the methods from line 16?
		// Because methods are called inside Constructor
		// and in line 16, Constructor is initialized
		
		System.out.println("--------------------------------");
		Calculator4 cal4 = new Calculator4();
		cal4.addition();
		
		System.out.println("--------------------------------");
		Calculator5 cal5 = new Calculator5();
		cal5.addition(3.44f, 2.334f); // argument is used to initialize
		cal5.addition(1.443f, 5.666f);
		// when a method is parameterized, you can call it again and again, by different argument
		cal5.addition(.990f, 3.0f);
		cal5.addition(1.990f, 13.0f);
		cal5.addition(1.990f, 33.0f);
		cal5.addition(4.55f, 23.45f);
		System.out.println("--------------------------------");
		cal5.subtraction(34, 20);
		cal5.subtraction(24, 28);
		cal5.subtraction(30, 10);
		cal5.subtraction(21, 25);
		cal5.subtraction(88, 90);
		
		System.out.println("--------------------------------");
		Calculator6 cal6 = new Calculator6();
		cal6.employee("Raiyan", 31241, 'M', false);
		cal6.employee("Zahraa", 91241, 'F', true);
		System.out.println("--------------------------------");
		cal6.allMethods(33, 11);
		System.out.println("--------------------------------");
		cal6.allMethods(554, 123);
		
		System.out.println("--------------------------------");
		Calculator7 cal7 = new Calculator7();
		cal7.addition(334, "43");
		cal7.addition(54, "88");
		System.out.println("--------------------------------");
		cal7.subtraction(5378, 345.98785);
		cal7.division01(425, 25.4356f);
		cal7.division02(24, 4.0f);
		
		System.out.println("--------------------------------");
		Calculator8 cal8 = new Calculator8();
		cal8.division();
		cal8.multiplication();
		
		
		
		
		
		
	}

}
