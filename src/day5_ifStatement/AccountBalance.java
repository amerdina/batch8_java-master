package day5_ifStatement;

import java.util.Scanner;

public class AccountBalance {
	public static void main(String[] args) {
		
		double overdrawnPenalty = 8.0;
		double interestRate = 0.02;
		double balance;
		
		System.out.println("Enter your checking account balance $");
		
		Scanner scan = new Scanner(System.in);
		
		
		balance = scan.nextDouble();
		
		
		System.out.println("Original balance $"+balance);
		
		if (balance >= 0) {
			balance = balance + (interestRate * balance)/12;
		}else {
			balance = balance - overdrawnPenalty;
		}
		
		System.out.println("Your new balance is $"+ balance);
		
		scan.close();
		
		
		
	}
}
