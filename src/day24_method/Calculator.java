package day24_method;

public class Calculator {

	public static void main(String[] args) {
		   
//		addition (3,6);
//		addition (13,16);
//		addition(0,16);
		Multiplication(  3,  5);
		Multiplication( 10, 12);
		subtraction(50, 30); 
		divition(80,20);
		divition(90,30);
	}
		
		public static void addition(int num1,int num2) {
			System.out.println(num1+num2);
			
	}

		public static void Multiplication(int num1,int num2) {
			int result=num1*num2;
			System.out.println(result=num1*num2);
			
		}
		public static void subtraction(int num1,int num2) {
			int result=num1-num2;
			System.out.println(result=num1-num2);
			
		}
		public static void divition (int  num1, int num2) {
			int result=num1/num2;
			System.out.println(result=num1-num2);
			
		} 
		
		
}
