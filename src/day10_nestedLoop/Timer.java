package day10_nestedLoop;

import java.util.Scanner;

public class Timer {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("Time");
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Please enter your wait time in minute");
		
		for (int i = scan.nextInt(); i > 0 ; i--) {
			
			System.out.println(i-1);
			System.out.println("++++++++++++++++++++++");
			for (int j = 59; j >= 0 ; j--) {
				System.out.println("Second "+j);
				
				Thread.sleep(1000);
				
			}
		}
		
		
		
		System.out.println("Time's up");
		scan.close();
		
		
		
	}
}
