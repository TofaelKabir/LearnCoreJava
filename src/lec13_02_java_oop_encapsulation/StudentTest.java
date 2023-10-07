package lec13_02_java_oop_encapsulation;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStName("Tofael");
		student.setStId(2188458);
		student.setStGender('M');
		student.setFullTimeSt(false);
		student.setStGrade(3.554f);
		
		System.out.println("Student Name: " + student.getStName() + "\nStudent Id: " + student.getStId() + "\nGender: "
				+ student.getStGender() + "\nFull Time student? : " + student.isFullTimeSt() + "\nGrade: " + student.getStGrade());

	}

}
