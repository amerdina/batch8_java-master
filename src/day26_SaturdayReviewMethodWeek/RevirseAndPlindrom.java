package day26_SaturdayReviewMethodWeek;

public class RevirseAndPlindrom {

	public static void main(String[] args) {
		 
		 String str="HANAH"	;
		 ////		CIVIC
////			ANNA
//		 if (str.equals(ReverseString(str))) {
//				System.out.println("Palindrome");
//			}else {
//				System.out.println("Not a Palindrome");
//			}}
// 		 
//			
//			
			if (!str.equals(isPalindrome( str))) {
				System.out.println("Palindrome");
			} else {
				System.out.println("Not a Palindrome");
			} }
	 
//			
 		//	System.out.println(isPalindrome("CIVIC"));
//			
//			System.out.println(isPalindrome("DINA"));
//			
//			
//			System.out.println(isPalindrome("ANNA"));
//			
//
//		}
//		
			
//			System.out.println(isPalindrome("CIVIC"));
//			
//			System.out.println(isPalindrome("DINA"));
//			
//			
//			System.out.println(isPalindrome("ANNA"));
//			
//
//		}
//			
		
		
	 
	 public static boolean isPalindrome(String str) {
	//String str="HANNAH"	;
	// boolean flage=false;
	if(str.equals(ReverseString(str))){
	  System.out.println(str+"is plindrome");
	 return true;
	 
	}else {
	 	 System.out.println(str+"is NOTB plindrome");
		 
          return false;
	} }
 	public static String ReverseString(String str) { 
	// String str="wellcome";
		String reversestr ="";
	for (int i=str.length()-1;i>=0;i--) {
		reversestr +=str.charAt(i);
	}
		
	System.out.println(reversestr);	
			return reversestr;
	} }
	
	 	
		
 

 
