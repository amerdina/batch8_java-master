package day20Array;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
	int nums[]=new int [] {5,3,1,2,4,9}; 
 System.out.println(nums[2]);
		System.out.println(nums[4]); 
		
		System.out.println(nums.length);
		System.out.println(nums[nums.length-1]);
		// to acess each element 
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
			Arrays.sort(nums);System.out.println();
			System.out.println(Arrays.toString(nums) );
			
			String names[] = {"C","D","A","B"};
			
			System.out.println(Arrays.toString(names));
			
			Arrays.sort(names);
			
			System.out.println(Arrays.toString(names));
			
			
			Arrays.sort(names);
			/////////
			///get the arrays
			
			int intArr[]= {10,20,15,22,35};
			
			int intArr2[]= {10,15,22};
			
			
			System.out.println(Arrays.equals(intArr, intArr2));
		///////////////
			
			
			
			
			
			
			
		}
		
		 
		
	}
 
}
