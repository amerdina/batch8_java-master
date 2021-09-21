package day4_relationalOperator;

public class ExecutionOrder {
	public static void main(String[] args) {
		
		
		int a = 3; 
		int b = 5; 
		int c = 2;
		
		int result = a + b * c; // 13
		
		System.out.println(result);
		
		System.out.println(b+a+c);
		
		System.out.println(b * c / a);// 3
		
		System.out.println(b * c - a);// 7
//		                  (3x(3 + 5) - 2- 3* 3 )
//		                    24    
		System.out.println(a*(a+b) - c-a*a);
		
		
		
		
		
		
		
		
		
	}
}
