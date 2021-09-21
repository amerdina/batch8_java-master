package day4_relationalOperator;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		
		int a = 5;
		
		int b = a;
		
		System.out.println(a);
		
		System.out.println("Value of a is "+a);
		
		System.out.println(b);
		
		System.out.println("Value of b is "+b);
		
		System.out.println(a);
//		            a = 5 + 3;
		a += 3;  // a = a + 3
		
		System.out.println("Value of a is "+a);
//		             a
		a += 10; /// a = a + 10
		
		System.out.println("Value of a is "+a); // 18
		
		
		// -=
//		               18 - 5
		a -= 5; // a = a - 5
		
//		a = 10000;
//		
////		System.out.println(a);
//		a = 0;
////		System.out.println("Value of a is "+a);
//		
//		a = 90;
		
		System.out.println(a);
		
		System.out.println(b);
		
		
		b *= 5; // b = b * 5
		
		System.out.println(b);
		
//		                25 / 5
		b /= 5;  // b = b / 5
		
		System.out.println(b);
		
		b %= 2; // b % 2 
		
		System.out.println("Line number 59 + <"+b+">");
		
		
		
		System.out.println(a);
		
		b = a;
		
		System.out.println("Line number 67 + <"+b+">");
		
		
		
		
		
		

	}

}
