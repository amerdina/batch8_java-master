package day14_StringInterviewQuestions;

public class RemoveCharacterFromAString {
	public static void main(String[] args) {
		
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
		
		
		for(int i = 0 ; i < str.length(); i++) {
			
			if (str.charAt(i) != 'm') {
				System.out.print(str.charAt(i));
			}
			
		}
		
		//Elira
		
		String a = "programming";
		String b = "";
		for (int i = 0; i < a.length(); i++) {
			String c = Character.toString(a.charAt(7));

			if (i != 7 && i != 6) {

				b += a.charAt(i);

			}

		}
		System.out.print(b);
		
		
		
		
		
		
	}
}
