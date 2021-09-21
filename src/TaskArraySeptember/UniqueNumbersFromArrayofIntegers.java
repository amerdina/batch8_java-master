package TaskArraySeptember;

import java.util.Arrays;

public class UniqueNumbersFromArrayofIntegers {

	public static void main(String[] args) {
/*/*  Taks14:
UniqueIntegers
    1. write a program that can print out the unique numbers from an array of integers
	    Ex:int[] arr ={1,1,2,3,3,4}
	        output:2 4**/
		
		     int[] arr ={1,1,2,3,3,4};	 
		   
		 Arrays.sort(arr);
		     for (int i = 0; i < arr.length-1; i++)
			 {
		    	 if(arr[i]== arr [i+1]) 
		    	 {
		    		i+=2;
		    	 }
		    	  
		    	  System.out.println("the unique number  is " + arr[i])  ;
		    	    
		    	 }}}
		    	 
		 
 
 
 
 
 
 