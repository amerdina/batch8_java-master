package day22_myArayListWithIrfan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CompainTwoArrayListWithIterator {

	public static void main(String[] args) {
		ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(1,3,5,7,9)) ;
		ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(2,4,6,8)) ;
		
		
//		 Iterator<Integer>iterator=nums2.iterator();
//		while(iterator.hasNext()) {
//			 nums1.add(iterator.next()) ;
//		}
//		
		nums2.addAll(nums1);
		System.out.println("nums2= "+nums2);
		
		nums1.addAll(nums2);
		System.out.println("nums1= "  + nums1);
		
		
		
		
		
	}

}
