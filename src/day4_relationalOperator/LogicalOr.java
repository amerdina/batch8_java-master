package day4_relationalOperator;

public class LogicalOr {

	public static void main(String[] args) {
		
//		Logical Or ||  
		
//		condition1 condition2 result
//		
//		true       true       true
//		
//		true       false      true
//		
//		false      true       true
//		
//		false      false      false
		
		
		byte a = 3;
		byte b = 3;
		byte c = 6;
		
		
		boolean condition1 = a + b == c; //true 
		
		boolean condition2 = c < a*b;   // true
		
		System.out.println(condition1 || condition2); // true
		
		boolean condition3 = a * b - c == a; // true
		
		boolean condition4 = c < a; // false
		
		System.out.println(condition3 || condition4); // true
		
		
		System.out.println(b > c || a * b > c );  // true
		
		System.out.println(b > c || a * b < c);   // false
		
		
		
		// Logical not !
		
		
		
		boolean valueA = true;
		
		System.out.println(valueA);
		
		System.out.println(!valueA);
		
		
		boolean valueB = false;
		
		System.out.println(valueB);
		
		System.out.println(!valueB);
		
				
		
		
		
		
		System.out.println(b > c); // false
		
		System.out.println(!(b > c));
		
		
		
		
		
	}
	
	
}
