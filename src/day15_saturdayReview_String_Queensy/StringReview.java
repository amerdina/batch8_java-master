package day15_saturdayReview_String_Queensy;

import java.util.Scanner;

public class StringReview {

	public static void main(String[] args) {

		//String str = " Hello";

		// int charCount= str.length();

		// System.out.println(charCount);

		// char firstChar = str.charAt(0);

//		System.out.println(str.indexOf('l'));
//		
//		System.out.println(str.indexOf('l', 3));

		int num1 = 4;
		int num2 = 10;
		if (num1 == num2) {
			System.out.println("They're equal");
		}
//		System.out.println(str);
//		System.out.println(str.trim());
//		System.out.println();
//		System.out.println("code is updated here");
//		str = str.trim();
//		System.out.println(str);

		// Compare 2 strings. Store the result in a boolean variable.
		// If the boolean variable is true, print a statement stating
		// the strings are the same. If false, print a statement stating
		// they're not the same

//		System.out.println("Please enter first string: ");
//		Scanner scan = new Scanner(System.in);
//		String word1 = scan.next();
//		System.out.println("Please enter second string: ");
//		String word2 = scan.next();
//		
//		boolean result = word1.equals(word2);
//		if (result) {
//			System.out.println("Your strings are the SAME!!");
//		} else {
//			System.out.println("Your strings are NOT the same :(");
//		}
//		scan.close();

//		String str="aBc     ";
//		String str1="abc";
//		
//		str = str.toUpperCase();
//		str = str.trim();
//		
//		str1 = str1.toUpperCase().trim();
//		
//		if(str.equals(str1)) {
//			System.out.println("They are the same string. ");
//			
//		}
//		else if(!str.toUpperCase().trim().equals(str1.toUpperCase().trim())) {
//			System.out.println("They are not the same.");
//		}

		
		
		
		
		//Count how many vowels are in a string
		//vowels: a, e, i, o, u
		//String: elephant; number of vowels = 3
		
		
		
		
//		String a="aeiou";
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Plz enter a word, Let's see how many vowels are in this word.");
//		
//		String b=scan.nextLine();
//		int count=0;
//		
//		for(int i= 0;i<a.length();i++) {
//			//i = 4; comparing u
//		
//			for(int k=0;k<b.length();k++) {
//				
//								
//				
//				
//				if(b.charAt(k)==a.charAt(i)){
//					System.out.println(a.charAt(i));
//					count++;
//				
//				
//				}
//				
//			}System.out.println(count);
//			System.out.println();
//			
//		}
//		System.out.println(count);
		
		
		
//		System.out.println("Please enter a string: ");
//		Scanner scan = new Scanner(System.in);
//		String input = scan.next();
//		String referenceData = "aeiou";
//		int count = 0;
//		for (int i = 0; i <= input.length() - 1; i++) {
//			String currentChar = Character.toString(input.charAt(i));
//			if (referenceData.contains(currentChar)) {
//				count += 1;
//			}
//		}
//		System.out.println(input + "; number of vowels = " + count);
//		scan.close();		
		
		
		
//Given a string, replace only the first occurrence of a specified letter
//to another specified letter of your choice
		//initialize: String, String/char letter, String/char replacingLetter
		//parallel; a, b
		//pbrallel
		
		
		
	//do NOT use this method:	.replaceFirst
		
		
		String word = "parallel";
		char char1 = 'a';
		String char2 = "b";
		
		String result = "";
		boolean s = true;
		
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)==char1 && s) {
				result+=char2;
				s=false;
			}
			else {
				result+=word.charAt(i);
				
			}	
		}
		System.out.println(result);
		
			
		

	}

}
