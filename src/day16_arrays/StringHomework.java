package day16_arrays;

import java.util.Scanner;

public class StringHomework {
	public static void main(String[] args) {
		
		/**
		 * 1- Write an efficient Java program to return the maximum occurring character
		 *  in the input string, e.g., if the input string is "Java" then the function should return 'a'

2- write a program that can return the longest string from two user inputs
3- write a program that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
4- ask the user to enter a word.
        if the word ends with "ly", print "really???" ,  otherwise, print "never mind"

5- Write a method which prints out the numbers from 1 to 100 but
for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number,
for numbers which are a multiple of 3, print "FIN" instead of the number and
for numbers which are a multiple of 5, print "RA" instead of the number.
    ex:
        output:
            1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN ....
            */
		
		
		
//        1- Write an efficient Java program to return the maximum occurring character
//		in the input string, e.g., if the input string is "Java" then the function should return 'a'

		
		
		String str = "Javaaaaaaaaaaaaaaaaaaa";

		String uniqueChars = "";

		for (int i = 0; i < str.length(); i++) {

			String currentChar = Character.toString(str.charAt(i));

			if (!uniqueChars.contains(currentChar)) {

				uniqueChars += currentChar;

			}

		}

		System.out.println(uniqueChars);
		
		
		int max = 0;
		char maxOccuringChar = ' ';
		
		
		for (int i = 0; i < uniqueChars.length(); i++) {
			
			System.out.println(uniqueChars.charAt(i));
			
			char lookingFor = uniqueChars.charAt(i);
			
			int num = 0;
			
			for (int j = 0; j < str.length(); j++) {

				char found = str.charAt(j);

				System.out.println("Looking for <"+lookingFor+">  found  <"+found+">");
				
				
				if (lookingFor == found) {
					num++;
				}

			}

			if (num > max) {
				max = num;
				
				maxOccuringChar = lookingFor;
			}

		}
		

		System.out.println(maxOccuringChar+" occured "+ max +" times");
		
		
		
		
		String str2 = "";
		
		System.out.println(str2.length() == 0);
		
		System.out.println(str2.isEmpty());
		
		
		
		System.out.println("type a string");
		
		String input = new String();
		
		System.out.println(input.isEmpty());
		

		
//		4- ask the user to enter a word.
//        if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
		
		String str4 = "lovely";
		
		
		String subString = str4.substring(str4.length()-2);
		
		System.out.println(subString);
		
		if(subString.equals("ly")) {
			System.out.println("really???");
		}else {
			System.out.println("never mind");
		}
		
		
		if(str4.endsWith("ly")) {
			System.out.println("really???");
		}else {
			System.out.println("never mind");
		}
		
		
		
		/*  for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number,
			for numbers which are a multiple of 3, print "FIN" instead of the number and
			for numbers which are a multiple of 5, print "RA" instead of the number.
			    ex:
        output:
            1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN ....*/
		
		
		
		for(int i = 1; i < 101; i++) {
			
			String message = "";
			
			if (i % 3 == 0) {
				message = "FIN";
			}
			
			if (i % 5 == 0) {
				message = "RA";
			}
			
			if (i % 3 == 0 &&i % 5 == 0) {
				message = "FINRA";
			}
			
			
			if(!message.isEmpty()) {
				System.out.println(message);
			}else {
				System.out.println(i);
			}
			
		
			
		}
		
		
		
		
		
		
		
		
	}
}
