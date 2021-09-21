package day9_LoopReview;

public class ForLoop {
	public static void main(String[] args) {

//		if () {}
//		while () {}

//		for () {}

//		for(int i = 0; i < 5 ; i++ ) {
//			
//			System.out.println(i);
//			
//			
//		}
		
//		System.out.println(7%2 == 1);
		
		
		//Calculate sum of all odd numbers from 1 to 100

		int total = 0;
		
		for (int i = 1; i < 101; i++) {

			
			if (i%2 == 1) {
				
				total += i; //(1+3+5+9+11+....99) = 2500
//				System.out.println(i);
			}
			
			
			

		}
		
		System.out.println(total);
		
		
		
		
		
		/*
		 * tasks: 
		 *        1. print out the numbers between 0 ~ 100 
		 *        2. print out the numbers between 100 ~ 200 
		 *        3. print out all the odd numbers between 0 ~ 100 
		 *        4. print out all the even numbers between 0 ~ 100 
		 *        5. do 500 push ups
		 */
		
		
		for (int p= 0; p<= 500; p++) {
			System.out.println(p + " Push ups");
		}
		
		

	}
}
