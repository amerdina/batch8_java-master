package day20Array;

import java.util.Arrays;

public class Task2AboutArray {

 	public static void main(String[] args) {
// Task 10: Write a Java program to find index of Jenkins before sorting and after sorting.
// String[] my_array2 = {  "Java", "JDBC","SQL","Junit", "Selenium",
//			           "Jenkins", "Cucumber", "Agile","SDLC", "WebDriver" };	 

	
	
 
 
 
 		int nums1[] = {1,2,3,4,5};
		int nums2[] = {6,7,8,9,10};
		
		
		int nums3[] = new int [nums1.length + nums2.length];
   		 
   		
   		int position = 0;
   		
   		for(int i = 0 ; i < nums1.length; i++) {
   			
//   			System.out.println(nums1[i]);
//   			nums3[0] = nums1[0];
   			nums3[position] = nums1[i];
   			position++;
   		}
   		
   		System.out.println(Arrays.toString(nums3));
   		
   		for (int i = 0; i < nums2.length; i++) {
   			
//   			System.out.println(nums2[i]);
//   			nums3[0] = nums1[0];
   			nums3[position] = nums2[i];
   			position++;
   		}
   		
   		System.out.println(Arrays.toString(nums3));
   		
   		
    

   
	}

}
