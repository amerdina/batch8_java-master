package day14_StringInterviewQuestions;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		// Write a program to reverse a string
//		input = ABCD
//		output = DCBA
//                      0123
//		String input = "ABCD";
		
//		System.out.print(input.charAt(3));
//		System.out.print(input.charAt(2));
//		System.out.print(input.charAt(1));
//		System.out.print(input.charAt(0));
//		
		Scanner scan = new Scanner(System.in);
		System.out.println("Type a word");
		String input = scan.nextLine();
		
		for(int i = input.length() -1 ; i >=0 ; i --) {
//			System.out.println(i);
			System.out.print(input.charAt(i));
		}
		
		
		scan.close();
		
		
		
		
		
		
		


	}

}
