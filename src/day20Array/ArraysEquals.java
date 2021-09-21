package day20Array;

import java.util.Arrays;

public class ArraysEquals {

	public static void main(String[] args) {
		 int nums[]= {5,4,3,2,1};
		 int nums2[]= {1,2,3,4,5};
		 int nums3[]= {2,3,4,5};
		 System.out.println(Arrays.equals(nums, nums2));
		 System.out.println(Arrays.equals(nums, nums3));
Arrays.sort(nums);
System.out.println(Arrays.equals(nums, nums2));

Arrays.sort(nums3);
System.out.println(Arrays.equals(nums2, nums3));

//////////////
int a[]= {1,8,3};
int b[]=new int[a.length];
//b=a;
//System.out.println(a);
//System.out.println(b);
//System.out.println(a[0]==b[0]);





b[0]=a[0];
b[1]=a[1];
b[2]=a[2];
System.out.println(a[0]==b[0]);
///////

String[]cars= {"Volvo","Bmw","Ford","Mazda"};
for(String i:cars) {
	System.out.println(i) ;
	
	/////////
	int nums[]= {10,20,30,40,50};
	for(int darima:nums) {
		System.out.println(darima);
	}}
	
	
	
	
 






	}

}
