package day6_switchStatement;

public class Calculator {
	public static void main(String[] args) {
		/*
		 * Create a basic calculator using if else statement. Note: Create a string
		 * variable name it operator. Create 3 numeric variable, total, num1 and num2
		 * and perform basic calculation.
		 */

//		String operator = "*";
//		
//		int num1 = 5;
//		int num2 = 3;
//		int total = 0;
//		
//		
//		
//		if (operator == "+") {
//			total = num1 + num2;
//		}else if (operator == "-") {
//			total = num1 - num2;
//		}else if (operator == "*") {
//			total = num1 * num2;
//		}else if (operator == "/") {
//			total = num1 / num2;
//		}else {
//			System.out.println("Invalid operator");
//		}
//		
//		
//		
//		System.out.println(total);

		String operator = "(";
		int num1 = 5;
		int num2 = 3;
		int total = 0;
		if (operator == "+") {
			total = num1 + num2;
//			System.out.println(total);
		} else if (operator == "-") {
			total = num1 - num2;
//			System.out.println(total);
		} else if (operator == "*") {
			total = num1 * num2;
//			System.out.println(total);
		} else if (operator == "/") {
			total = num1 / num2;
//			System.out.println(total);
		}

		System.out.println(total);

	}
}
