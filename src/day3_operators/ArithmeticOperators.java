package day3_operators;

public class ArithmeticOperators {

	public static void main(String[] args) {

		// + , - , * , / , % , ++ , --

		int numA = 10;

		int numB = 2;

		int result = numA + numB;
//		                    10  + 2
		System.out.println(numA + numB);// 12

		System.out.println(result);

//		                    10   -  2 
		System.out.println(numA - numB); // 8

//		                    10  *  2
		System.out.println(numA * numB); // 20

//		                    10  /  2
		System.out.println(numA / numB); // 5

		int numC = numB + 1; // 3

		System.out.println(numC);

		System.out.println(numA / numC);

		// Modular operator %

//		 10 / 3 = 3.333333

//		 10  = 3 +3 + 3 +1  

		System.out.println(10 % 3);

		System.out.println(10 % 5);

		System.out.println(10 % 4); // (4 + 4 + 2)

		System.out.println(10 % 9);// (9 + 1)

		// even number

		System.out.println(numA % 2);

		// odd number
		System.out.println(11 % 2);

		System.out.println(1231210 % 2);
		System.out.println(1231211 % 2);

		// increment ++

		int valueA = 1;

//		    valueA = valueA +1;

		valueA++;
		valueA++;
		valueA++;

		System.out.println(valueA);
		
		
		int valueB = 0;
		
		System.out.println(valueB++);
		System.out.println(valueB);// 1
		
		
		System.out.println(++valueB);//2
		
		
		//--
		int c = 5;
		
		c-- ;   // c = c -1
		c-- ;
		
		System.out.println(c);
		
		
		
		
		
		
		

	}

}
