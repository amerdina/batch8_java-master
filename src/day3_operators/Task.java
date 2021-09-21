package day3_operators;

public class Task {
	public static void main(String[] args) {
		
		
		/*write a program that can calculate the salary after tax based on the salary
		 * 
		 *  and tax rate 
		 *  Ex:if salary = 100000 
		 *  taxRate = 0.28 
		 *  totalTax = salary * taxRate;
		 *  salary after tax = salary - totalTax
		 *  
		 *  */
		
			
			int salary = 100000;
			
			double taxRate = 0.28;
			
			double totalTax = salary * taxRate;
			
			double netIncome = salary - totalTax;
			
			
			System.out.println("Total tax paid "+ totalTax);
			
			System.out.println("Net income "+ netIncome);
			
			
		
		
		
			
		
		
		
		
		
		
		
		
		
		
	}
}
