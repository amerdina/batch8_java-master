package day5_ifStatement;

public class LogicalOperator {

	public static void main(String[] args) {
		
		
		int score = 148;
		
		char grade = ' ';
		
		// 0 <= score <= 100 
		
		if (score >=0 && score <=100) {
			
			
			if (score >= 90 && score <= 100) {
				grade = 'A';
			}else if (score >= 80 && score < 90) {
				grade = 'B';
			}else if (score >= 70 && score < 80) {
				grade = 'C';
			}else if (score >= 60 && score < 70) {
				grade = 'D';
			}else {
				grade = 'F';
			}
			
		}else {
			System.out.println("Invalid score");
		}
		
		
		System.out.println("Your score is <"+ score + "> grade is <"+ grade +">");
		
		
		
		
		
		
		
		

	}

}
