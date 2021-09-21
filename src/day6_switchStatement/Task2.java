package day6_switchStatement;

public class Task2 {
	public static void main(String[] args) {

		/*
		 * Task 2: Nested if statement
		 * 
		 * Write a Java Program using nested if statement. Find the largest value
		 * between the 3 numbers below. n1 = -1.0 n2 = 4.5 n3 = -5.3
		 */

		double n1 = 11.0;
		double n2 = 4.5;
		double n3 = 5.3;

		if (n1 > n2 && n1 > n3) {
			System.out.println("Max number is "+ n1);
		}
		
		if (n2 > n1 && n2 > n3) {
			System.out.println("Max number is "+ n2);
		}
		
		if (n3 > n2 && n3 > n1) {
			System.out.println("Max number is "+ n3);
		}

//		double n1 = -1;
//		double n2 = 4.5;
//		double n3 = 5.3;
//		
//		double max = 0;
//		
//		if (n1 > n2) {
//			if (n1 > n3) {
//				System.out.println(n1 + " is the largest number.");
//			}
//		} else if (n2 > n1) {
//			if (n2 > n3) {
//				System.out.println(n2 + " is the largest number.");
//			}
//		} else if (n3 > n1) {
//			if (n3 > n2) {
//				System.out.println(n3 + " is the largest number.");
//			}
//
//		}

	}
}
