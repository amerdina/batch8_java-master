package day4_relationalOperator;

public class RelationalOperator_continue {
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 10;
		int num3 = 15;

		// >

		System.out.println(num1 > num2); // false
//	                        10  >  15   	
		System.out.println(num1 > num3); // false

		System.out.println(num3 > num2); // true

		System.out.println(num1 >= num2); // true
//        10  >  15   	
		System.out.println(num1 >= num3); // false

		System.out.println(num3 >= num2); // true
		
//		System.out.println(num1 => num2);

	}
}
