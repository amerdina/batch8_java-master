package day26_SaturdayReviewMethodWeek;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskMerage2arrayListWithMethod {

	public static void main(String[] args) {
/*How to merge two lists in java?
		
//		List1 =  {1,2,3,4,5,6,7}
//		list2 = {11,22,33,44,55,66,77}
		
//	create a method to merge 2 list, and return the sum of all the numbers
 * 
 * */		  
 ArrayList<Integer>list1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
 ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(11,22,33,44,55,66,77));

 System.out.println( merage2ArrayList(list1,list2));
 
	}

public static int merage2ArrayList(ArrayList<Integer>list1,ArrayList<Integer>list2)
{  
ArrayList<Integer>list3=new ArrayList<>();
int sum=0;
 
	list3.addAll(list1 );
	list3.addAll(list2);
	for( int dina:list3) {
	sum+= dina ; 
}
	 System.out.println(list3);
	 System.out.println(sum);
 return sum ;
		 
	}	}

 

//		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
//		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55, 66, 77));
//		mergeAndTotal(list1, list2);
//	
//	}
//	
//	
//	public static void mergeAndTotal(ArrayList<Integer> list1, ArrayList<Integer> list2) {
//		
//		ArrayList<Integer> list3 = new ArrayList<>();
//		list3.addAll(list1);
//		list3.addAll(list2);
//		
//		int total = 0;
//		for (int i = 0; i < list3.size(); i++) {
//			total += list3.get(i);
//		}
//		System.out.println(list3);
//		System.out.print(total);
//	}}
	
	
	
	
	
	
	
	
	
 
