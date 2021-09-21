package day26_SaturdayReviewMethodWeek;

public class MethodAddArrayAndGetSum {

	public static void main(String[] args) {
/*Sum of all elements in integer array?
//	It's a very simple program. We can use for loop to iterate over the array elements and add them to get the final sum.
		
 * */  
	int num1[]= {1,2,3,4,5};
	
	System.out.println(ArraySum(num1));
	
	
	
	
	}
	
	public static int ArraySum(int num[]) { 
	int sum=0;
	for (int i=0;i<num.length ;i++) {
		System.out.println  (num[i]);
 
	sum+=num[i];	
	 
	}
		
	 System.out.println("sum=" + sum);
		
		return sum;
	}}
	 
 	
		 
  