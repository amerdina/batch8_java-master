package day_25MethodParamsAndMethodOverLoading;

import java.util.Scanner;

public class tst {
 	public static void main(String[] args) {	
 	
 		System.out.println (  check("aassddf"));

 	}
 		public static String check(String str)  {
 			  //String  str="aaaaaaaadddsss";
 		 	 String unique="";
 		 for (int i=0;i<str.length();i++) {
 			  //char ch= str.charAt(i);
 			// System.out.println(ch);
 			 String currentchar=Character.toString(str.charAt(i));
 			 if(!unique.contains(currentchar)) {
 				 unique+=currentchar;
 			 }}
 		// System.out.println(unique);
 			 return unique ;
 		 }
 		 	 
 		}
 		  
			

 		 
			
////	5.  write a method that can print out the full name of a person in regular format
//    ex:
//        fullName("teChCirCle", "SCHOOL");
//        	output:
//        		"Techcircle School"
//        			}
////}
 
// public static   subtraction(int a,int b) {
 

	