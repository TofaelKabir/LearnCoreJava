package lec11_java_oop_inheritance;

public class FamilyHierarchy {

	public static void main(String[] args) {
		GrandFather grandFather = new GrandFather();
		grandFather.grandFatherInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		Aunt aunt = new Aunt();
		aunt.auntInfo();
		aunt.grandFatherInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		Cousin cousin = new Cousin();
		cousin.cousinInfo();	
		cousin.auntInfo();
		cousin.grandFatherInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		Uncle uncle = new Uncle();
		uncle.uncleInfo();
		uncle.grandFatherInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		Father father = new Father();
		father.fatherInfo();
		father.grandFatherInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		Me me = new Me();
		me.myInfo();
		me.fatherInfo();
		me.grandFatherInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		Sister sister = new Sister();
		sister.sisterInfo();
		sister.fatherInfo();
		sister.grandFatherInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		Niece niece = new Niece();
		niece.nieceInfo();
		niece.sisterInfo();
		niece.fatherInfo();
		niece.grandFatherInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		GrandChildren grandChildren = new GrandChildren();
		grandChildren.grandChildrenInfo();
		grandChildren.nieceInfo();
		grandChildren.sisterInfo();
		grandChildren.fatherInfo();
		grandChildren.grandFatherInfo();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
