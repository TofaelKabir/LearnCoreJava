package lec07_02_java_variables_declared;

public class AboutUsTest {

	public static void main(String[] args) {
		AboutUs tofael = new AboutUs(); // Constructor Initialized here
		tofael.myName = "Mohammad Sharkar";
		tofael.myAge = 70;
		tofael.myApartmentRent = 30000;
		tofael.myYearlySalary = 734628736;
		tofael.myBankBalance = 765423725745l;
		tofael.myHeight = 1.678f;
		tofael.myGrade = 3.4687832;
		tofael.myGender = 'M';
		tofael.usCitizen = false;
		tofael.myName = "Moti Mia";
		tofael.myInfo();
		// Please see line 16, the last initialized variable will be printed
		// line 7 and 16, initializing same variable 'myName'
		// line 16 will be the outcome
		// But line 16 should be before the method called by line 17
		
		System.out.println("\n------------------------------------\n");
		AboutUs nabeeha = new AboutUs();
		nabeeha.myName = "Nabeeha T";
		nabeeha.myAge = 55;
		nabeeha.myApartmentRent = 20000;
		nabeeha.myYearlySalary = 486536434;
		nabeeha.myBankBalance = 6356623876642l;
		nabeeha.myHeight = 1.4567f;
		nabeeha.myGrade = 3.999328;
		nabeeha.myGender = 'F';
		nabeeha.usCitizen = true;
		tofael.myInfo(); // common mistake, values will come from tofael object
		
		System.out.println("\n------------------------------------\n");
		AboutUs raiyan = new AboutUs();
		raiyan.myName = "Raiyan Sayem";
		raiyan.myAge = 75;
		raiyan.myApartmentRent = 25000;
		raiyan.myYearlySalary = 786536434;
		raiyan.myBankBalance = 9956623876642l;
		raiyan.myHeight = 1.7067f;
		raiyan.myGrade = 4.00000;
		raiyan.myGender = 'M';
		raiyan.usCitizen = true;
		raiyan.myInfo();
		nabeeha.myInfo(); // same here, nabeeha object will get myInfo() which nabeeha's variable initialized by the object
		
		
	
		
		// The advantage of declaring variables are --- 
		// we can initialize the variables as many times as we want by creating new object
	}

}
