package day11_Review;

import java.util.Scanner;

public class Sat_rev {

	public static void main(String[] args) {

		// Write a program that ask the user to input a positive integer.
		// It should then print the multiplication table of that number

		// "Input a positive integer"
		// 9

		// 9*0 = 0
		// 9*1 = 9
		// 9*2 = 18

		// ...9*9 = 81

//		int numA=0;
//		Scanner input = new Scanner(System.in);
//		System.out.println("Plz enter any positive number");
//		int num = input.nextInt();
//		
//		for(int i=0;i<=10;i++) {
//			numA=num*i;
//			System.out.println(i + "X"+num+ "="+ numA);
//			
//		}

//		System.out.println("Please input a positive integer");
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		if (num >= 0) {
//			for (int multiple = 0; multiple <= 9; multiple++) {
//				System.out.println(num + " * " + multiple + " = " + num * multiple);
//			}
//		} else
//			System.out.println("Invalid input");
//		scan.close();

		// Write a program that asks the user to input an integer and then outputs the
		// number with the digits reversed.
		// For example, if the input is 34567, the output should be 76543.

		// System.out.println();
		// System.out.print();

		// .charAt(i) gets the single character of the String at position i; it returns
		// a char
		// .length() gets the number of characters of the String; it returns an int

//		System.out.println("Please input an integer.");
//		Scanner in = new Scanner(System.in);
//		String num = in.next();
//		int loopNumber = 1;
//		
//		for(int i = num.length()-1; i>=0; i--) {
//			System.out.println("Iteration: "+loopNumber++);
//			System.out.println(num.charAt(i));
//		}
//		
//		in.close();

		// 34567
		// num.length() = 5
		// num.length()-1 = 4
		// num.charAt(5) = error

		// ****
		// ***
		// **
		// *

		// 4 3 2 1

//		for (int i = 5; i >= 1; i--) {
//			
//			//System.out.println("Number of astericks: "+i);
//			
//			
//			for (int k = 1; k <= i; k++) {
//				System.out.print("*");
//			}
//			
//			
//			
//			//System.out.println();
//			System.out.println();
//		}

		// Reverse a string
		// elephant --> tnahpele
		
		

		System.out.println(" enter a word: ");

		Scanner scan = new Scanner(System.in);

		String word = scan.next();

		for (int i = word.length() - 1; i >= 0; i--) {

			System.out.print(word.charAt(i));
		}
		scan.close();

	}

}
