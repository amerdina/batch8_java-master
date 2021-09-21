package day19Reviw;

import java.util.Arrays;
import java.util.Scanner;

public class ContainValueInArray {

	public static void main(String[] args) {
 /*Task 15:
Input:
int[][] arr2D = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
/*
            task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3
            task2:
            	3 2 1
            	8 7 6 5 4
            	13 12 11 10 9
        	task3:
        		13 12 11 10 9
        		8 7 6 5 4
        		3 2 1
 */
  
  int[][] arr2D = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
  
// System.out.println("Task-1");
//  for(int i=arr2D.length-1 ; i >= 0; i--) {
//	 System.out.println(Arrays.toString(arr2D[i]));
//   
// for(int j=0;j<arr2D[i].length;j++) {
//	
// }} }}
   
 
//System.out.println("Task 2");	
// for (int i = 0; i < arr2D.length; i++) {
//		for (int k = arr2D[i].length - 1; k >= 0; k--) {
//			System.out.print(arr2D[i][k] + " ");
//		}
//		System.out.println();
//	}}}
		
 System.out.println("Task 3");	
 for (int i = arr2D.length-1; i >=0; i--) {
 		for (int j = arr2D[i].length - 1; j >= 0;j--) {
 			System.out.print (arr2D[i][j] + " ");
 			 
 	} 
  	 	System.out.println();
 	}}} 
		
		
		
		
		
 