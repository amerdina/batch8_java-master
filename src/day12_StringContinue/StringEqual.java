package day12_StringContinue;

public class StringEqual {

	public static void main(String[] args) {
		
		
		String word1 = "Hello ";
		String word2 = "Java";
		String word3 = word1+word2;
		String word4 = "Hello Java";
		
		System.out.println(word3);
		System.out.println(word4);
		
		System.out.println(word3 == word4);
		
		System.out.println(word3.equals(word4));
		
		String word5 = "HELLO JAVA";
		
		System.out.println(word4.equals(word5));
		
		System.out.println(word4.equalsIgnoreCase(word5));
		
		
		if (word4.equals(word5)) {
			System.out.println("They are equal");
		}else {
			System.out.println("They are not equal");
		}
		
		
		
		if (word4.equalsIgnoreCase(word5)) {
			System.out.println("They are equal");
		}else {
			System.out.println("They are not equal");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
