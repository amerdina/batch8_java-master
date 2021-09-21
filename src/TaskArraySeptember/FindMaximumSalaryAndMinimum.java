package TaskArraySeptember;

public class FindMaximumSalaryAndMinimum {

	public static void main(String[] args) {
//		**Task 16:
//Who has the highest salary?
//String[] employeeNames = {"Nadia", "Darima", "Erkin" , "Opal", "Farima"};
//// index numbers:      0        1          2       3         4
//
// int[] employeeSalary = {1000000, 110000, 105000, 120000, 125000};
// Opal : $100000
//			               ....
// who has the highest salary
//who has the minimum salary
//			 */
			 String[] emp_Names = {"Nadia", "Darima", "Erkin" , "Opal", "Farima"};
			 int[] emp_Salary = {1000000, 110000, 105000, 120000, 125000};
			  int highposition=-1; int LowSalary=100000000;             
			 int highSalary=0;int Lowposition=-1;
			 
			 
			 for(int i=0;i<emp_Salary.length;i++){
				
				 if (highSalary<emp_Salary[i]) 
				{
					highSalary=emp_Salary[i];
					highposition=i;
					}
				 for(int j=0;j<emp_Salary.length ;j++){  
				 if(LowSalary > emp_Salary[j]) {
						LowSalary= emp_Salary[j];
						Lowposition = j;
				}
				 } }
			 
			 System.out.println("Employee has highSalary is " + emp_Names[highposition]+"Salary is "+highSalary);
				System.out.println("Employee has LowSalary is " + emp_Names[Lowposition]+" Salary is "+LowSalary);
			 
			 }
 
	}

 
