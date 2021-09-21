package TaskFinalArraySeptember;

import java.util.Arrays;

public class TaskFindNameBetweenListJANKIN {

	public static void main(String[] args) {
/*Task-10
 * Write a Java program to find index of Jenkins before sorting and after sorting.
String[] my_array2 = {"Java", "JDBC","SQL", "Junit","Selenium","Jenkins","Cucumber", "Agile", "SDLC", "WebDriver"};
 * */	
		//Task-10//
String[] my_array2 = {"Java", "JDBC","SQL", "Junit","Selenium","Jenkins","Cucumber", "Agile", "SDLC", "WebDriver"};
		
int index=0;

 System.out.println(Arrays.toString(my_array2));
 
 for(int i=0;i<my_array2.length;i++) 
{
	 if(my_array2[i].equals("Jenkins")  ) {
	 index=i;
		 System.out.println("index of Jenkins before sorting is " + index );
	 } }
	System.out.println();
 Arrays.sort(my_array2);  
	System.out.println(Arrays.toString(my_array2)); 
	
	for(int i=0;i<my_array2.length;i++) 
	 {
		 if(my_array2[i].equals ("Jenkins" ) ) {
			 index=i;
			 System.out.println("index of Jenkins after sorting is " + index );
		 }}}}
	 
// System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++ ");
//	
		
/*Task-11
 * Write a Java program to test if an array contains a certain value
    int[] my_array1 = { 1789, 2035, 1899, 1456, 2013,1458, 2458, 1254, 1472, 2365,1456, 2265, 1457, 2456};
Check if 2019 , 2013contains above array.
 * */
		
//int[] my_array1 = { 1789, 2035, 1899, 1456, 2013,1458, 2458, 1254, 1472, 2365,1456, 2265, 1457, 2456};	
//
// Arrays.sort(my_array1);  
// System.out.println(Arrays.toString(my_array1)); 
// System.out.println();
// 
//for (int element:my_array1) {
//
//	
//	if   (element== 2013)  {
//		 System.out.println("2013 is contains in my_array1");
//	}  
//	
//	 if   (element== 2019)  {
//	 	 System.out.println("2019 is contains in my_array1");
//	 }}}} 
    
 //System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

		
		
		
 

 









