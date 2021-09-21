package day22_myArayListWithIrfan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListAddAll {

	public static void main(String[] args) {
//	 ArrayList<Integer>nums1=new ArrayList<>(Arrays.asList( 1,3,5,7,9));
//	 ArrayList<Integer>nums2=new ArrayList<>(Arrays.asList( 2,4,6,8));
//
//	 Iterator<Integer>iterator=nums2.iterator();
//	 System.out.println(nums1);
//	 while()
//	}
//
//}

//ArrayList<String> room = new ArrayList<>(Arrays.asList("assa","fff" ,"ffa","dd","eea"));
//		char endsWith = 'a';
//		for (String name : room) {
//			if (name.charAt(name.length() - 1) == endsWith) {
//			   room.add(name);
//				 
//			}
//		}
//		System.out.println(room);
//		ArrayList<String> names = new ArrayList<>();
		//Create list of names that ends with an letter a
//		names.add("Darima");
//		names.add("Opal");
//		names.add("Dina");
//		names.add("Zamira");
//		names.add("Ariuna");
//		names.add("Erkin");
//		names.add("Qasir");
//		names.add("Famira");
//		names.add("Nadia");
//		names.add("Mergen");
//		names.add("Pedro");
//		names.add("Elira");
//		
//		Create list of names that ends with an letter a
		ArrayList<String> names = new ArrayList<>( Arrays.asList("assa","fff" ,"ffa","dd","eea")); 
//		names.add("Darima");
//		names.add("Opal");
//		names.add("Dina");
//		names.add("Zamira");
//		names.add("Ariuna");
//		names.add("Erkin");
//		names.add("Qasir");
//		names.add("Famira");
//		names.add("Nadia");
//		names.add("Mergen");
//		names.add("Pedro");
//		names.add("Elira");
//		
		ArrayList<String> list = new ArrayList<>( );
		char endsWith = 'a';
		for (String zamira:names) {
			if (zamira.charAt(zamira.length() - 1) == endsWith) {
				list.add(zamira);
			}
		}
		System.out.println(list);
		
		
		
	}}