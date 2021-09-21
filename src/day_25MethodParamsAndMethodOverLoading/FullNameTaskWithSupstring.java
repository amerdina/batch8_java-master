package day_25MethodParamsAndMethodOverLoading;

public class FullNameTaskWithSupstring {
/**	5.  write a method that can print out the full name of a person in regular format
	            ex:
	               fullName("teChCirCle", "SCHOOL");
	               	output:
	               		"Techcircle School"
 * */
	

	
	
	
	public static void main(String[] args) {
//		String firstname = "dina";
//		String Lastname = "Amer";
//		   System.out.println( FullName(firstname,Lastname ));
//	
		System.out.println( FullName("Dina","AMER"));
	}
	
		
  public static String FullName(String firstname,String Lastname ) {
 
// String firstname= "Techcircle";
//  String LastName="School"; 
		 
 firstname= firstname.toUpperCase().substring(0,1)+	firstname.toLowerCase().substring(1);
 Lastname= Lastname.toUpperCase().substring(0,1)+Lastname.toLowerCase().substring(1);	
	
//	System.out.println(firstname + "  "+ LastName);
//	System.out.println(firstname.concat(LastName)) ;
 String fullName=firstname+ " "+Lastname; 
	//System.out.println(fullName);
	 return fullName ;
	
}	
	
}	
	
	
	
	
	
	
	
	
	
	
 
