package day16_arrays;

public class ArrayIntro {
	public static void main(String[] args) {
		
		
		String [] months;
//		                    0        1        2       3      4       5
		String names[] = {"Erkin","Elira","Darima","Dina","Pedro","Famira"};
		
		
		//index                 0   1      2   3  4 5  6 7
		int nums[] = new int[] {1,231233,4223,25,63,74,8,9};
		
		System.out.println(nums[0]);//1
		
		System.out.println(nums[3]);//5
		
		System.out.println(nums[6]);//8
		
		System.out.println(names[1]);
		System.out.println(names[5]);
		
		
		
		String fruits[] = new String[6];
		
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		System.out.println(fruits[3]);
		System.out.println(fruits[4]);
		System.out.println(fruits[5]);
		
		fruits[0] = "Apple";
		fruits[1] = "Banana";
		fruits[2] = "Orange";
		fruits[3] = "Kivi";
		fruits[4] = "Mango";
		fruits[5] = "Pear";
		
		
		
		
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		System.out.println(fruits[3]);
		System.out.println(fruits[4]);
		System.out.println(fruits[5]);
		
		
		fruits[3] = "Kiwis";
		
		
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		System.out.println(fruits[3]);
		System.out.println(fruits[4]);
		System.out.println(fruits[5]);
		
//		fruits[6] = "Melon";
//		
//		System.out.println(fruits[6]);
		
	}
}
