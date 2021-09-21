package day5_ifStatement;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);// create instance of scanner object
		
		System.out.println("Please type a number");
		
//		int a = 10;
		
		int a = scan.nextInt();
		
		
		
//		System.out.println("Type some double number");
		
//		double value = scan.nextDouble();
		
		
		System.out.println("Value of a is "+a);
		
		
		int b = 10;
		
		int c = a +b;
		
		System.out.println("Result = "+ c);
		
		
//		System.out.println("Value of my double variable is "+ value);
		
		
		
		scan.close();
		

	}

}
