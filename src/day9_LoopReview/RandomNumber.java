package day9_LoopReview;


import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		
		for(int i = 0 ; i < 10; i++){
			
			System.out.println(random.nextInt(100));
			
		}
		
		
//		703 | 571 | 202 + 123 + 1234
		
		
		String areaCode = "202";
		
		
		
		for (int i = 1; i < 101; i++) {
			System.out.print(areaCode);
			System.out.print(random.nextInt(1000));
			
			System.out.print(random.nextInt(9999));
			
			System.out.println();
			System.out.println();
		}
		
		
		
	}
}
