package day20Array;

import java.util.Arrays;

public class Try {

	public static void main(String[] args) {
		int[] arr ={1,1,2,3,3,4,1,2};	
		  
		 Arrays.sort(arr);
		 System.out.println(Arrays.toString(arr));
		     for (int i = 0; i < arr.length-1; i++)
			 {
		    	 if(arr[i]== arr [i+1])
		    	 {
		    		i+=2;
		    	 }
		    	 
		    	  System.out.println("the unique number  is " + arr[i])  ;
		    	   
		    	 }}}	 
