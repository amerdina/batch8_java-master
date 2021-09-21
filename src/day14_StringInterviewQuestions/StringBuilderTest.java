package day14_StringInterviewQuestions;

public class StringBuilderTest {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();

		sb.append("ABCD");

		sb.append(true);

		sb.append('c');

		sb.append(9.1);

		sb.append(5);

		sb.reverse();

//		sb.charAt(0);

		System.out.println(sb.charAt(0));

		System.out.println(sb);

		/*
		 * Write an efficient Java program to return the maximum occurring character in
		 * the input string, e.g., if the input string is "Java" then the function
		 * should return 'a'.
		 */

//		String c="jabbbbbva";
//		String b ="";
//		for(int i =0; i<c.length();i++) {
//		//	
//		String d=Character.toString(c.charAt(i));
//			if( c.charAt(i)=='a'){
//				if(!b.equals(d)) {
//					
//				b+=d;
//				System.out.print(c.charAt(i));
//				}
//			}
//		}
		String str = "jabbbbbva";

		String uniqueChars = "";

		for (int i = 0; i < str.length(); i++) {

			String currentChar = Character.toString(str.charAt(i));

			if (!uniqueChars.contains(currentChar)) {

				uniqueChars += currentChar;

			}

		}

		System.out.println(uniqueChars);
		
		
		int count = 0;
		int maxOccuringChar = ' ';
		
		
		
		
		
		
		

	}

}
