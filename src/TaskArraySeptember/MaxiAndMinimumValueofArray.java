package TaskArraySeptember;

import java.util.Arrays;

public class MaxiAndMinimumValueofArray {

	public static void main(String[] args) {
		/***Task 12:
		 Write a Java program to find the maximum and minimum value of an array.
		int[] my_array1 = { 1789, 2035, 1899, 1456, 2013,
		           1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456};
			 * */	
				///Task 12:	////
		 int[] my_array1 = { 1789, 2035, 1899, 1456, 2013,
				           1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456};	
			int	max=0;
			int mini=my_array1[0] ;
		 	 Arrays.sort(my_array1);
		 	System.out.println (Arrays .toString( my_array1)) ;
			for(int i=0;i<my_array1.length;i++) {
				 
				if (my_array1[i]>max) {
					max=my_array1[i];
				}
			 if(my_array1[i]<mini) {
					mini=my_array1[i];
				}
			
			}
			System.out.println("the Max number in my_array1 = "+ max );
			System.out.println("the Mini number in my_array1 = "+ mini );
			}}

