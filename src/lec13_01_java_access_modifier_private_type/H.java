package lec13_01_java_access_modifier_private_type;

// Child class H, Parent class I, so child will inherit parent
public class H extends I {
	private String name3 = "This variable is coming from H which is private";

	private void h() {
		System.out.println("This method is coming from H which is private");
	}

	public static void main(String[] args) {
		System.out.println("\n---------- Inside same package, private type modifier content of Parent class [I] can't be accessed by sub/child class (Here H) ----------");
		H h = new H();
		h.h();
		// h.iMethod();
	}

}
