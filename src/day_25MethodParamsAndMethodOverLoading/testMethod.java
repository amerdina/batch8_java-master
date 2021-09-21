package day_25MethodParamsAndMethodOverLoading;

public class testMethod {

	public static void main(String[] args) {
		//4. create a function that can print a string without the duplicated characters
		//"aaabbbccc"
		//abc
 
		System.out.println (nonDuplicateDCharacter("aassddf"));

	}
			public static String nonDuplicateDCharacter(String str) {

				//String str = "aabbbbbccccccccccccddddddeeeeffffgggg";
				//String expectedStr = "abc";
				
				String uniqueChars = "";
				
				
				for (int i = 0 ; i < str.length(); i++) {
					
					
					String currentChar = Character.toString(str.charAt(i));
					
					
					if (!uniqueChars.contains(currentChar)) {
						
						uniqueChars += currentChar;
						
					}
					
					
				}
				

			//System.out.println(uniqueChars);
				 return uniqueChars;

	}

}
