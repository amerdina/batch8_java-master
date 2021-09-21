package TaskArraySeptember;

import java.util.Arrays;

public class FindIndexArray {

	public static void main(String[] args) {
		/**Task 10:
		 //Write a Java program to find index of Jenkins before sorting and after sorting.
		//String[] my_array2 = { "Java",   "JDBC", "SQL","Junit","Selenium", "Jenkins","Cucumber"
		//, "Agile","SDLC", "WebDriver" };
		 * **/		 
		  String[]my_array2 = {"Java","JDBC","SQL","Junit","Selenium", "Jenkins","Cucumber", "Agile","SDLC", "WebDriver" };
		  
		 
		  for(int i=0;i<my_array2.length;i++) {

		  if (my_array2[i].equals("Jenkins")) {
			  System.out.println("index of Jenkins before sorting is" + i);
		  }}
		  Arrays.sort(my_array2);
		  System.out.println(Arrays.toString(my_array2));
		  
		  for(int i=0;i<my_array2.length;i++) {
		              if (my_array2[i].equals("Jenkins")) {
		            	  
			  System.out.println("index of Jenkins after sorting is  " + i);
				}}
		  
			}}

		 

	  