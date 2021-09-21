package day21_WrapperClassAndLocalDate;

public class CharacterClassTest {

	public static void main(String[] args) {
//		  char a='A';
//		  char b='9';

//		  Character c=a;
//		  System.out.println(c);
//		 System.out.println(Character.isDigit(b)); 
//		  
//		 System.out.println(Character.isDigit(a)); 
//		  
//		 System.out.println(Character.isLetter(b)); 
//		  
//		 System.out.println(Character.isLetter(a)); 
//		  
	//extract letter from a string
		 String str="abc123def456";
	 int count=0;
 
		 for(int i=0;i<str.length();i++) {
 			 char eachChar=str.charAt(i);
		//System.out.println(eachChar);
		if(Character.isDigit (eachChar)){ 
			count++;
System.out.println(eachChar );
 
		}
		 
		 }
		 System.out.println("conter="+ count);
	}}
//				 for(int i=0;i<str.length();i++) {
//					 char eachChar=str.charAt(i);
//		
//				 
//				 
//				 }
// 		if(Character.isLetter(eachChar)){ 
// 			 System.out.println(eachChar );
//		}
////		if(Character.isDigit(eachChar))
////		{ 
////			 System.out.println(eachChar);
//		}  }}
//			 
//			 
			 
			 
		 