package lec14_01_java_oop_use_of_super_in_child_class;

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println("---------- default constructor initialized from The Child Class Employee -----------");
		Employee employee1 = new Employee();
		
		System.out.println("\n---------- parameterized constructor initialized from The Child Class Employee ----------");
		Employee employee2 = new Employee("Tofael", 2188458, 'M', false);
		
		System.out.println("\n---------- void type method initialized from The Child Class Employee ----------");
		employee2.empInfo();
		
		System.out.println("\n---------- parameterized method initialized from The Child Class Employee ----------");
		employee2.employeeInfo("Alexandria", 342034, 'F', true);
		
		System.out.println("\n---------- default constructor initialized from The Parent Class MountSinai ----------");
		MountSinai mountSinai1 = new MountSinai();
		
		System.out.println("\n---------- parameterized constructor initialized from The Parent Class MountSinai ----------");
		MountSinai mountSinai2 = new MountSinai("Manhattan", 4);
		
		System.out.println("\n---------- void type method initialized from The Parent Class MountSinai ----------");
		mountSinai2.msInfo();
		
		System.out.println("\n---------- parameterized method initialized from The Parent Class MountSinai ----------");
		mountSinai2.mountSinaiInfo("Queens", 4);
		
		
		
		
		
		
		
		
		
	}

}
