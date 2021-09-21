package day26_SaterdayReview;

public class MaxiAndMiniElementInArrayList {

 	public static void main(String[] args) {
 		int num1[]= {10,33,46,58,62};	 
//   System.out.println(maximum (num1));
 		System.out.println(minimum (num1));
 	}
//
//	public static int maximum(int num1[]) {//return//
////	int num1[]= {1,3,4,5,6};
//	int max=num1[0] ;
//	for (int i = 0; i < num1.length; i++) { 	
//	if(max<num1[i]) {
//		max=num1[i];
//		}
//	}
//	return max;	
//		
//	}	
//}	
// 
///////minimum
 
//	public static int minimum(int num1[]) { 
////	int num1[]= {1,3,4,5,6};
//	int mini=num1[0] ;
//	for (int i = 0; i < num1.length; i++) { 	
//	if(mini>num1[i]) {
//		mini=num1[i];
//		}
//	}
//	return mini;	
//		
//	}	
//}	

	public static int minimum(int num1[]) { 
//		int num1[]= {1,3,4,5,6};
		int mini=num1[0] ;
		for ( int dina:num1) { 	
		if(mini>dina) {
			mini=dina;
			}
		}
		return mini;	
			
		}	
	}	
	
//public static void maximumNumber1(int arr[]) {
//	Arrays.sort(arr);
//	System.out.println(arr[arr.length - 1]);
//}
//
//public static void minimumNumber1(int arr[]) {
//	Arrays.sort(arr);
//	System.out.println(arr[0]);
//}

	
	
 
