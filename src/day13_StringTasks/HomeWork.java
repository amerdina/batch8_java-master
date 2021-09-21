package day13_StringTasks;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {

		/*
		 * 1, write a program that can calculate the sum of 5 user entered inputs 2,
		 * Write a program that can return the factorial number of any given number Ex:
		 * input: 5 output: 120 ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 ) 3, Write a
		 * program that calculates the sum of numbers entered by the user until user
		 * enters a negative number. hint: you need an infinite loop 
		 * 
		 * 4, Write a program
		 * that asks the user to input an integer and then outputs the number with the
		 * digits reversed. For example, if the input is 34567, the output should be
		 * 76543.
		 * 
		 * 5, Find the middle character of a string Write a Java program to find the
		 * middle character of a string. If the length of the string is odd there will
		 * be one middle character. If the length of the string is even there will be 2
		 * middle characters. Input: abcde output:c intput car11car output 11
		 * 
		 * 6, Make it total of 5 characters Write a program that checks the length of
		 * the string. If the string length is less than 5 characters then add any
		 * character and make it total of five character. if the length is equal to 5
		 * then keep the original string. if string length greater than 5 characters
		 * then keep the last 5 characters. Examples: String str1 = "computer"; String
		 * str2 = "Java"; String str3 = "Pizza"; //expected "puter" , "JavaA" "Pizza"
		 * 
		 * 7, Extract letters from a String Write a program to extract all the letter
		 * from a given alphanumeric string "a1b2c34d098098efg" output: abbdefg
		 */

//		3, Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
//		hint: you need an infinite loop

//		Scanner scan = new Scanner(System.in);
//
//		int sum = 0;
//
//		int num = 0;
//		do {
//
//			System.out.println("Please type a number");
//			num = scan.nextInt();
//			
//			
//			
//			if (num > 0) {
//				sum += num; // sum = sum + num
//			}
//			
//			
//
//		} while (num > -1);
//
//		System.out.println(sum);
//
//		scan.close();
		
//		 5, Find the middle character of a string 
//		Write a Java program to find the middle character of a string.
//		If the length of the string is odd there will be one middle character. 
//		If the length of the string is even there will be 2 middle characters.
//		Input: abcde 
//		output:c 
//		intput car11car 
//		output 11
		
//		                012345
//		String input = "1234567891";
//		
//		String middleChar = "";
//		
//		
//		if (input.length()%2 == 1) {
//			System.out.println("1 middle character");
//			
//			int index= input.length() / 2;
//			
//			System.out.println(input.charAt(index));
//			
//			
//		}else {
//			System.out.println("2 middle character");
//			
//			System.out.println(input.length() / 2 -1);
//			System.out.println(input.length() / 2);
//			
//			System.out.println(input.charAt(input.length() / 2 -1));
//			System.out.println(input.charAt(input.length() / 2 ));
//			
//		}
		
//		6, Make it total of 5 characters 
//		Write a program that checks the length of the string. 
//		If the string length is less than 5 characters then add any
//		 * character and make it total of five character.
//		if the length is equal to 5 then keep the original string. 
//		if string length greater than 5 characters
//		 * then keep the last 5 characters. 
//		 
//		 Examples: 
//			 String str1 = "computer"; 
//		String str2 = "Java"; 
//		String str3 = "Pizza"; 
		//expected "puter" , "JavaA" "Pizza"
		
		
//		
//		String str = "computer12345";
//		
//		if (str.length() == 5) {
//			System.out.println(str);
//		}
//		
//		
//		if (str.length() < 5) {
//			
//			String str2 = str+"123456789";
//			
//			System.out.println(str2.substring(0, 5));
//			
//			
//		}
//		
//		if (str.length() > 5) {
//			System.out.println(str.substring(str.length()-5));
//		}
//		
		
		
		
		
		
//		 * 7, Extract letters from a String Write a program to extract all the letter
//		 * from a given alphanumeric string "a1b2c34d098098efg" output: abbdefg
//		                       0123456
//		String alphanumeric = "a1b2c34d098098efg";
//		
//		String referanceData = "abcdefghijklmnopqrstuvwxyz";
//		
//		for(int i = 0; i <alphanumeric.length(); i++ ) {
////			System.out.println(i);
//			
////			char currentChar = alphanumeric.charAt(i);
//			String currentChar = Character.toString(alphanumeric.charAt(i));
//					
//			if (referanceData.contains(currentChar)) {
//				System.out.println(currentChar);
//			}	
//			
//		}
		
		
//		alphanumeric.replaceAll(alphanumeric, referanceData)
		
//		String str = "ABC";
//		
//		char firstChar = str.charAt(0);//A
//		
////		firstChar
//				
////		str.contains(firstChar);
//		
//		Character.toString(firstChar);
//		
////		System.out.println(Character.toString(firstChar));
//		
//		System.out.println(str.contains(Character.toString(firstChar)));
		
		
		
		
//		
//		System.out.println(str.contains("A"));
//		System.out.println(str.contains("C"));
//		System.out.println(str.contains("B"));
//		System.out.println(str.contains("a"));
//		System.out.println(str.contains("2"));
		
		
		
		
		
		
		
		String alphanumeric = "a1b2c34d098098efg";
		
		
		char a = 'a';
		
		int numA = a;
		
		char z = 'z';
		
		int numZ = z;
		
		System.out.println(numA);
		System.out.println(numZ);
		
		
//		
//		for(int i = 0 ; i < alphanumeric.length(); i++ ) {
//			
//			
//			char currentChar = alphanumeric.charAt(i);
//			
////			System.out.println(currentChar);
//			
//			int num = currentChar;
//			
////			System.out.println(num);
//			
//			
//			if (num >= numA && num <= numZ) {
//				System.out.print(currentChar);
//			}
//		}
		
		
		
		
		for(int i = 0 ; i < alphanumeric.length(); i++ ) {
			
			
			char currentChar = alphanumeric.charAt(i);
			
//			System.out.println(currentChar);
			
//			int num = currentChar;
			
//			System.out.println(num);
			
			
			if (currentChar >= 97 && currentChar <= 122) {
				System.out.print(currentChar);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
