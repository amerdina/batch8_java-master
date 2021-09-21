package TaskArrayAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveTheDigitsAndLettersFromAnArrayListOfCharacters {

	public static void main(String[] args) {
// write a program that can remove the digits and letters from an array list of characters	
				List<Character> str1 = new ArrayList<>(Arrays.asList('a','$','^','1','@','A','D','&'));
				List<Character> str2 = new ArrayList<>();
				
		 		for (Character ddr:str1 ) {
		 			if (!Character.isDigit(ddr) && !Character.isLetter(ddr)) {
		 				str2.add(ddr );
		 			}}
		 		System.out.println(str2);	
			}}}
//another solution				
			String word = "Today is 9/28/2021.";
			List<Character> word1 = new ArrayList<>();
			List<Character> word3 = new ArrayList<>();
			for (int i = 0; i < word.length(); i++) {
				word1.add(word.charAt(i));
			}
			System.out.println(word1);
			for (Character word2 : word1) {
				if (!Character.isDigit(word2) && !Character.isLetter(word2)) {
					word3.add(word2);
				}
			}
			System.out.println(word3);
		}} 

	}

}
