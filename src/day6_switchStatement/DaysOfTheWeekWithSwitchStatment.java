package day6_switchStatement;

public class DaysOfTheWeekWithSwitchStatment {
	public static void main(String[] args) {

		int input = 97;

		String day = "";

		switch (input) {
		case 1:
//			System.out.println("Monday");
			day = "Monday";
			break;
		case 2:
//			System.out.println("Tuesday");
			day = "Tuesday";
			break;

		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		case 7:
			day = "Sunday";
			break;
		default:
			System.out.println("This is an invalid day of the week.");
		}
		
		System.out.println(day);

	}
}
