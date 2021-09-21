package day_25MethodParamsAndMethodOverLoading;

public class tst2method {
 
	public static void main(String[] args) {
   	
	String result=check("aaaaaddddd");	 
 	System.out.println(result);	
		
	}	
 			
  public static String check(String str)  {
	  String  str="aaaaaaaadddsss";
 	 String unique="";
 for (int i=0;i<str.length();i++) {
	  //char ch= str.charAt(i);
	// System.out.println(ch);
	 String currentchar=Character.toString(str.charAt(i));
	 if(!unique.contains(currentchar)) {
		 unique+=currentchar;
	 }}
 System.out.println(unique);
	 //return unique ;
 }
 	 
}
  
  
  
		 
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 	  
 	 