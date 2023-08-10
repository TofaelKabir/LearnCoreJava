package lec04_java_basic;

// use of " " inside String---> \"  \" 
// use of ' ' inside String ---> \'  \'
// below one not important
// use of \ \  inside String---> \\   \\
// what will happen if you use only a slash? Ans: Compilation error


public class G_use_of_single_or_double_quotation_inside_a_String {
	public static void main(String[] args) {
		System.out.println("Jason Momoa, \\Born today at 1979\\, American actor (Game of Thrones, Aquaman), born in Honolulu, Hawaii");
		System.out.println("\n-----------------------------------------------------------------------------------------");
		System.out.println("\t\"Jason Momoa\", \n\tBorn today at 1979, " + "\n\n\tAmerican actor (\'Game of Thrones\', \'Aquaman\'), " +  "\t\tborn in \"Honolulu, Hawaii\"");
		
	}

}
