package day4_relationalOperator;

public class LogicalOperator {
	
	public static void main(String[] args) {
		
		
//		Logical and &&
		
//		condition1 condition2 result
//		
//		true       true        true
//		
//		true       false       false
//		
//		false      true        false
//		
//		false     false        false
		
		
		int num1 = 10;
		int num2 = 10;
		int num3 = 15;
		
		
		boolean result = num1 == num2; // true
		boolean result2 = num2 <= num3; // true
		
		
		System.out.println(result && result2);
		
		boolean result3 = result && result2;
		
		System.out.println(result3); // true
		
		
		
		System.out.println(num1 >= num2 && num1 < num2); // false
		
		
		
		
		
	}
}
