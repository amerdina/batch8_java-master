package day20Array;

import java.util.Arrays;

public class Task9aboutArray {

	public static void main(String[] args) {
//ask 9:Write a Java program to sort a numeric array and a string array.
// int[] my_array1 = {1789, 2035, 1899, 1456, 2013,
//  1458, 2458, 1254, 1472, 2365,1456, 2165, 1457, 2456};
//
// String[] my_array2 = {"Java",
//  "JDBC", "SQL","Junit", "Selenium", "Jenkins",
/"Cucumber", "Agile",  "SDLC", "WebDriver" 

			          
   int [] nums1= {1789, 2035, 1899, 1456, 2013,
		   1458, 2458, 1254, 1472, 2365,
		   1456, 2165, 1457, 2456};  
		  
		Arrays.sort(nums1);
		System.out.println(Arrays.toString(nums1));
	 
		
   String[] names = {"Java", "JDBC","SQL","Junit", "Selenium", "Jenkins","Cucumber",
				  "Agile","SDLC", "WebDriver" };
		   
	 Arrays.sort(names);
 System.out.println(Arrays.toString(names));
			
		  
		  
		   }
	}

 
