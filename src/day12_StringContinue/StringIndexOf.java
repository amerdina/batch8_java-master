package day12_StringContinue;

public class StringIndexOf {

	public static void main(String[] args) {
		
//	                  012345678910   15 	 
		String name ="President George Washington";
 
//				name.indexOf ('P');		     // 0
				
				System.out.println(name.indexOf ('P')); //0
				System.out.println(name.indexOf('e')); // 2
				System.out.println(name.indexOf("George"));
				System.out.println(name.indexOf("Washington"));
				
				System.out.println(name.indexOf('e',13));
				
//				name.indexOf ('e');		     // 2
//				name.indexOf ("George");	  //  10
//				name.indexOf ('e', 3);		  //    6   
//
//				name.indexOf ("Bob");	   // -1
				
				System.out.println(name.indexOf("Bob"));
				System.out.println(name.indexOf('z'));
				
				System.out.println(name.lastIndexOf('o'));
				
//				name.lastIndexOf ('e');	   // 15
				
				System.out.println(name.length()-1);

				System.out.println(name.charAt(name.length()-1));
				
				System.out.println(name.lastIndexOf('e'));
				
//                            01234567			
				String str = "javajavajava";//4 //8
				
				
				System.out.println(str.length()-1);
				
				System.out.println(name.length());
				
				
				System.out.println(name.charAt(26));
				
				
				System.out.println(name.charAt(name.length()-1));
				
				

	}

}
