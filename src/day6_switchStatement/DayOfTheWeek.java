package day6_switchStatement;

public class DayOfTheWeek {
	public static void main(String[] args) {
		
		int input = 23242348;
		
		
		String week = "";
		
		if (input == 1) {
			week = "Monday";
		}else if (input == 5) {
			week = "Friday";
		}else if (input == 2) {
			week = "Tuesday";
		}else if (input == 3) {
			week = "Wednesday";
		}else if (input == 4) {
			week = "Thursday";
		}else if (input == 6) {
			week = "Saturday";
		}else if (input == 7) {
			week = "Sunday";
		}else {
			System.out.println(input + " is invalid day of the week");
		}
		
		
		System.out.println(week);
		
		
	}
}
