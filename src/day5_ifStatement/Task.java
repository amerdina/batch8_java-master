package day5_ifStatement;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {

		/**
		 * Write a Java Program using if statement. Note: Create a variable time as a
		 * integer and print below messages: time is between 1 to 24; Good Morning 5< 12
		 * Good Afternoon 12 — 17 Good Evening 17—24
		 */

//		int time = 18;
////               5< 12
//		if (time >= 5 && time < 12) {
//			System.out.println("Good morning");
//		}
//		
////		            12 — 17
//		if (time >= 12 && time < 17) {
//			System.out.println("Good afternoon");
//		}
//		
////		17—24           
//		if (time >= 17 && time < 24) {
//			System.out.println("Good Evening");
//		}

//		int time = 19;
//		if (time >= 5 && time < 12) {
//			System.out.println("Good morning");
//		}
//		if (time >= 12 && time <= 17) {
//			System.out.println("Good afternoon");
//		}
//		if (time > 17 && time <= 24) {
//			System.out.println("Good evening");
//		}
//		

		Scanner elira = new Scanner(System.in);
		System.out.println("Please type a time ?");

		int Time = elira.nextInt();
		
		if (Time >= 5 && Time < 12) {
			System.out.println("Good Morning!");
		}
		
		if (Time >= 12 && Time < 17) {
			System.out.println("Good afternoon!");
		

		}
		
		if (Time >= 17 && Time < 24) {
			System.out.println("Good evening!");

		}
		
		elira.close();

	}
}
