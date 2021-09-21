package TaskArrayAndArrayList;

import java.util.Scanner;

public class ValidationPaswardArrayList {

	public static void main(String[] args) {
		/*Password validation
	    1. 8 character at least
	    2. there must be a digit            (isUpper   isLowercase)
	    3. there must be a letter (at least one upper case & one lower case)
	    4. there must be special character
	 * */	 
	 //SDha3556!@#$	
		System.out.println("Enter your Passward !");
		Scanner input =new Scanner(System.in);
		String pasw=input.nextLine();
		//String pasw="Asd12!@";
		
		Boolean Digit = false;
 		Boolean UpperCase = false;
 		Boolean LowerCase = false;
		   Boolean symbol = true;
		   int count = 0;
		if (pasw.length() >= 7) {
	for (int i = 0; i < pasw.length(); i++)  
{   			char a = pasw.charAt(i);
				Character ch = a;

	if (Character.isDigit(ch)) { 
		Digit = true;	
		count++;
			                  	}
	if (Character.isUpperCase(ch)) {
		UpperCase=true;
	                               }
	if (Character.isLowerCase(ch)){
	      LowerCase=true;
	                              }
	if (!Character.isDigit (ch) && !Character.isLetter(ch)) {
						  symbol= true;
	                                  } 
}
	
	if (Digit && UpperCase &&LowerCase && symbol) 
	{
 				System.out.println("Welcome!");
 			} else {
 				System.out.println("Password invalid");
 			}
 	} else {
 			System.out.println("Password must be at least 8 characters long");
 	}
		input.close();
	}

}
