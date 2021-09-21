package day16_arrays;

import java.util.Arrays;

public class ReadArrayByIndex {
	public static void main(String[] args) {

		String[] months = new String[12];
		months[0] = "january";
		months[1] = "feburary";
		months[2] = "march";
		months[3] = "april";
		months[4] = "may";
		months[5] = "june";
		months[6] = "july";
		months[7] = "august";
		months[8] = "september";
		months[9] = "october";
		months[10] = "november";
		months[11] = "december";
//		System.out.println(months[0]);
//		System.out.println(months[1]);
//		System.out.println(months[2]);
//		System.out.println(months[3]);
//		System.out.println(months[4]);
//		System.out.println(months[5]);
//		System.out.println(months[6]);
//		System.out.println(months[7]);
//		System.out.println(months[8]);
//		System.out.println(months[9]);
//		System.out.println(months[10]);
//		System.out.println(months[11]);

//		System.out.println(months.length);

//		for (int i = 0; i < 12; i++) {
////			System.out.println(i);
//			
//			System.out.println(months[i]);
//		}
		
		Arrays.sort(months);
		
		for (int i = 0; i < months.length; i++) {
//			System.out.println(i);
			
			System.out.println(months[i]);
		}
		

	}
}
