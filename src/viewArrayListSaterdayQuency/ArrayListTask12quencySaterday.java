package viewArrayListSaterdayQuency;

public class ArrayListTask12quencySaterday {

	public static void main(String[] args) {
/*String sentence = "The utility package contains all the classes and interfaces";				
//count the number of vowels in this string.
		 * */ 
		
//		 String sent  = "The utility package contains all the classes and interfaces";  
//		int vowelcount=0;
//		char A='a';
//		Character AA=A;
//		char letters[]=sent.toCharArray() ;
//			 for (int i=0;i< sent.length();i++) {
//				 System.out.println(letters[i]);
//				 if((letters[i]=='a')||(letters[i]=='o')||(letters[i]=='e')||(letters[i]=='i')||(letters[i]=='u')) 
//				 {
//					 vowelcount++; 
// 				 }}	 
// 	System.out.println("vowelcount = " + vowelcount);
// 		 }}
//

//pedro solving//
		String sentence = "The utility package contains all the classes and interfaces";
		List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		int count = 0;
		for (int i = 0; i < sentence.length(); i++) {
			for (int j = 0; j < vowels.size(); j++) {
				if (sentence.charAt(i) == vowels.get(j)) {
					count++;
				}
			}
		}
		System.out.println("The number of vowels is: " + count);
 
	//	margen solving
		String sentence = "The utility package contains all the classes and interfaces";
		  
		
		  char[] chars = sentence.toCharArray();
		  int count = 0;
		  for (int i = 0; i <sentence.length(); i++)
		  {
		  	if (sentence.charAt(i) == 'a'
		   		  || sentence.charAt(i) == 'e'
		         || sentence.charAt(i) == 'i'
		         || sentence.charAt(i) == 'o'
		         || sentence.charAt(i) == 'u')
		       {   
		      count++;
		    }
		  }
		  System.out.println("Total no of vowels in string are: " + count);
