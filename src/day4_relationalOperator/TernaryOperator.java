package day4_relationalOperator;

public class TernaryOperator {

	public static void main(String[] args) {
		
//		variable x = (condition) ? true value : false value;
		
		int a , b;
		
		a = 10;
//		      false           get this value
//		     condition
//		b = (a == 1)   ? 20 : 30;
		
		b = (a == 10) ? 20 : 30;
		
		System.out.println(b); //in line statement
		
		
		int c = (a == 10 && b < 40) ? 50 : 90;
		
		System.out.println(c);
		
		
		
		

	}

}
