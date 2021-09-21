package day26_SaturdayReviewMethodWeek;

public class CheckIfVoweLisPresentInString {
/*Java program to check if a vowel is present in the String
 * */
	

//  
 public static void main(String[] args) {
	
 
	String str1="aaeee";
 
	if (checkVowel(str1)) {
		System.out.println("A vowel IS present in the String.");
	}else {
		System.out.println("A vowel is NOT present in the String.");
	}
}
	
 
	
 
//	public static boolean checkVowel(String str) {
//		char a = 'a';
//		char e = 'e';
//		char i = 'i';
//		char o = 'o';
//		char u = 'u';
//	
//		boolean isVowel = false;
// 		//String str = "";
//		for (int j = 0; j < str.length(); j++) {
//			char ch = str.charAt(j);
//			System.out.println(ch);
//			if(ch == a || ch == e || ch == i || ch == o || ch == u) {
//				isVowel = true;
// 
//			}else {  
//				isVowel = false; }
//			 
//		
//		}
// 			System.out.println(isVowel);
//			
//			return isVowel;
//		
//	}
//	}
// public static boolean checkVowel(String str) {
//		String vowels = "aeiou";
//		boolean flag = false;
//		for (int i = 0; i < str.length(); i++) {
//			char eachChar=str.charAt(i);
//			if (vowels.contains(Character.toString(str.charAt(i)))) {
//				
//				flag = true;
//			// System.out.println(eachChar);
//			} else { 
//
//			 
//			flag=false; }}
//
//		 return flag ;
//		}}
 

 
