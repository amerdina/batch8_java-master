package day19Reviw;

import java.util.Arrays;
import java.util.Scanner;

public class GreatArray2dimWithScanner {

	public static void main(String[] args) {
		System.out.println("Please input 16 numbers.");
		Scanner in = new Scanner(System.in);
		int[][] theArray = new int[4][4];
		//this is if i insert more than 16 element he stop.
//int counter = 0;
//		while(scan.hasNext())
//			counter++;
//		if(counter>16)
//			sysout("error that's too many numbers")
//			break;
		
		for(int i = 0; i < theArray.length; i++) {
			for(int j = 0; j < theArray[i].length; j++) {
				theArray[i][j] = in.nextInt();
			
			}
		}
		
		for (int i=0;i<theArray.length;i++) {
			for(int j = 0; j<theArray[i].length; j++) {
				if (theArray[i][j] %2 ==1) {
					theArray[i][j]+=3;
				
				}
			}			
		}
		//this we put (for zamira) her because we need to print the final result it because 	
		 for(int[] anArray: theArray) {
			System.out.println(Arrays.toString(anArray));
		 }
in.close();
	}

}



