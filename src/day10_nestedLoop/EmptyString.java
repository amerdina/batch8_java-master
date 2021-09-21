package day10_nestedLoop;

public class EmptyString {
	
	public static void main(String[] args) {
		
		String word1 = "Java";

		String emptyString = "";
		
		String str = "TechCircle";
		
		System.out.println(word1.length());
		
		
		System.out.println(str.length());
		
		
		System.out.println(emptyString.length());
		
		
		String emptyStr2 = new String();
		
		System.out.println(emptyStr2.length());
		
		
		
		String word2 = new String("Java");
		
		System.out.println(word2);
		
		String word3 = new String(word2);
		
		System.out.println(word3);
		
		
		boolean result = word2 == word3;
		
		
		System.out.println(result);
		
		
		
		
		String word4 = "Java";
		
		String word5 = word4;
		
		
		boolean result2 = word4 == word5;
		
		
		System.out.println(result2);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
