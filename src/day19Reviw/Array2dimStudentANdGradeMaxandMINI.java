package day19Reviw;

public class Array2dimStudentANdGradeMaxandMINI {

	public static void main(String[] args) {
		String[] student = {"Nadia", "Ali", "Meickel","Salma","Saad"};
		int[] grade = {90, 70, 50,80,60,};
		
		
		
		int highGrade = 0;
		int highPosition = 0;
		int lowGrade=100;
		int LowPosition=0;
		for(int i = 0; i<grade.length; i++) {
			if(highGrade < grade[i]) {
				highGrade = grade[i];
				highPosition = i;
			} 
			
			for(int j=0;j<grade.length ;j++){  
				 if(lowGrade > grade[j]) {
						lowGrade= grade[j];
						LowPosition = j;
				}
				 } }
			 
			 System.out.println("Employee has highSalary is " + student[highPosition]+"Grade is "+highGrade);
				System.out.println("Employee has LowSalary is " + student[LowPosition]+" Grade is "+lowGrade);
			 
		}
		


	}

 
