package day5_ifStatement;

public class IfStatementIntro {
	public static void main(String[] args) {
		
		int count = 2;
		
		int total = 4;
		
		
//		if (your expression) {}
		
		if (count > 3) {
			
			total = 0;
			
		}else {
			
			total = total + count;
			
		}
		
		
		System.out.println(total);
		
	}
}
