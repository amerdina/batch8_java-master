package day10_nestedLoop;

public class BreakStatement {
	public static void main(String[] args) {
		
		for(int i = 1 ; i <= 10 ; i++) {
			
			System.out.println(i);
			
			if (i == 5) {
//				System.out.println();
				break;
				
			}
			
		}
		
		int count = 20;
		
		do {
			System.out.println(count);
			
			if (count == 14) {
				break;
			}
			
			count--;
		}while(count > 0);
		
		
		
		
		
	}
}
