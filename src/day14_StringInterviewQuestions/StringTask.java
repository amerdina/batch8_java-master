package day14_StringInterviewQuestions;

import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {

		/*
		 * Task: 1. Ask user to enter two words. Print first word without its first
		 * character then print the second word without its first character. Input:
		 * apple banana Output: ppleanana
		 */

		System.out.println("Please enter first word: ");
		
		Scanner scan = new Scanner(System.in);
		
		String word1 = scan.next();
		
		System.out.println("Please enter second word: ");
		
		String word2 = scan.next();
		
		System.out.println(word1.substring(1) + word2.substring(1));
		

		scan.close();
		
		
		
		/*
		 * Write an efficient program in Java to remove all occurrences of a 
		 * given character in Java. For example, 
		 * 
		 * if the given String is "Programming" 
		 * and the given character to remove is "m" then your 
		 * function should return "Prograing".
		 * 
		 * */
		
		String str = "Programming";
		String targetChar = "m";
//		Expected String should be "Prograing"
		
		
		String expectedStr = str.replace(targetChar, "");		
		System.out.println(expectedStr);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
