package day14_StringInterviewQuestions;

public class ExtractNumberFromAString {

	public static void main(String[] args) {

//		String str = "ab123456cde78d";

		// Write a program to extract number from a string.

//		expected output : 12345678

		// 0123456789101112
//				String str="ab123456Cde7aaaaa8";
//				String Str2="";
//				//for(int i=0; i<str.length();i++) {
//				 String str3=str.substring(2,8);
//				 String str4=str.substring(11,13);
//				System.out.println(str3+str4 );

//				String str = "ab123456cde78d";
//				String reference = "0123456789";
//				for (int i = 0; i < str.length(); i++) {
//					String currentChars = Character.toString(str.charAt(i));
//					if (reference.contains(currentChars)) {
//						System.out.print(str.charAt(i));
//					}
//				}

//		String alphanumeric = "ab123456cde78d";
//		
//		String referanceData = "0123456789";
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

		String str = "ab123456cdeasdfasdfasdf123132132134sdfasd6f54as78d";

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) > 48 && str.charAt(i) < 57) {
				System.out.print(str.charAt(i));
			}

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
