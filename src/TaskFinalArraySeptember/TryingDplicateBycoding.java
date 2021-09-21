package TaskFinalArraySeptember;

import java.util.Arrays;

public class TryingDplicateBycoding {

	public static void main(String[] args) {
		/*Write a Java program to find the duplicate values of an array of integer values.
		 int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};

		String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
				  * */
				
		// int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};	
//			int found=0;
//			Arrays.sort(my_array);
//			System.out.println(Arrays.toString(my_array));
		//	
		//  for (int i=0;i <my_array.length;i++) {
//			  if(my_array[i] == my_array[i+1])
//			  {
//				 found= my_array[i];
//				   System.out.println("this is diplicate number " +found);
//			  }}
//			}}
		//	
		String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
		String found="";
		Arrays.sort(my_array);
		 System.out.println(Arrays.toString(my_array));
		 
		for (int i=0;i <my_array.length;i++) {
			  if( my_array[i] .equals (my_array[i+1]) )
			  {
				 found= my_array[i];
				   System.out.println("this is diplicate string " +found);
			  }}
			}}
		 


	}

}
