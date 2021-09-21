package viewArrayListSaterdayQuency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task14ArrayListQuency {

	public static void main(String[] args) {
/*String sentence = "The utility package contains all the classes and interfaces";
//Find the third vowel, and count how many times it occurs in the string
// i : 4
 * */
		char[] charSentence = sentence.toCharArray();
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		char thirdVowel = ' ';
		int numOfVowels = 0;
		boolean ifFound = true;
		for (int i = 0; i < charSentence.length; i++) {
			while (numOfVowels < 3) {
				for (char x : vowels) {
					if (x == charSentence[i]) {
						numOfVowels++;
						break;
					}
					if (numOfVowels == 3) {
						thirdVowel = charSentence[i];
					}
				}		
			}
		}
		
		int count =0;
		
		for(char x: charSentence) {
			if(thirdVowel == x) {
				count++;
			}
		}
		
		System.out.println("Third vowel is "+thirdVowel);
		System.out.println("occurs "+count+" times");
 	
		
  
	}

}
