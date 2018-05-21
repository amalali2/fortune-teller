import java.util.Scanner;

public class firstGradedProject {

	public static void main(String[] args) {

	Scanner input =	 new Scanner(System.in);
	
	

	
	System.out.println("What is your first name?");
	String name = input.nextLine();
	
	System.out.println("What is you last name?");
	String lastName = input.nextLine();
	
	System.out.println("How old are you?");
	String retirementYears;
		int age = input.nextInt();
			if (age%2 == 0) {
			retirementYears = "10 years";
		} else  {
			retirementYears = "15 years";
		}		
	
	System.out.println("What is your birth month? (Answer numerically)");
		int bankBalance;
		int birthMonth = input.nextInt();
	
	System.out.println("What is you favorite color? (Answer using ROYGBIV)");
	
	System.out.println("If you're unsure, please type in Help.");
	String roygbiv = input.next();
	if (roygbiv.matches("help")) {
	System.out.println("ROYGBIV includes red, orange, yellow, green, blue, indigo, or violet. Try again.");
	}
	
	String modOfTransport;
	System.out.println("How many sibilings do you have? (Answer numerically)");
	String vacationHome;
		int numOfSiblings = input.nextInt();
		if (numOfSiblings == 1) {
			vacationHome = "Jeju, South Korea";
		} else if (numOfSiblings == 2 ) {
			vacationHome = "Lagos, Nigeria";
		} else if (numOfSiblings > 3) {
			vacationHome = "Ho Chi Min, Vietnam";
		} else if (numOfSiblings < 0) {
			vacationHome = "Cape Town, South Africa";
		} else {
			vacationHome = "nowhere";
		}

		if (birthMonth >= 4 | birthMonth >= 1) {
			bankBalance = 100000;
		} else if (birthMonth >= 5 | birthMonth >= 8) {
			bankBalance = 200000; 
		} else if (birthMonth >= 9 | birthMonth >=12) {
			bankBalance = 300000;
		} else {
			bankBalance = 0;
		}	
	
	switch (roygbiv) {
		case "violet":
			modOfTransport = "subway";
		break;
		
		case "red":
			modOfTransport = "bus";
		break;
		
		case "blue":
			modOfTransport = "Tesla";
		break;
		
		case "yellow":
			modOfTransport = "private jet";
		default:
			modOfTransport = "legs";
	}
	
	System.out.println(name + " " + lastName + " " + "will retire in" + " " + retirementYears + " " + "with" + " " + bankBalance + " " + "in the bank, "
	+ "a vacation home in" + " " + vacationHome + " " + "and travel by" + " " + modOfTransport);	

	}
	}






	
	


