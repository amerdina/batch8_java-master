package day_25MethodParamsAndMethodOverLoading;

public class MethodReturnValue2 {
   public static void main(String[] args) {

	   
	     add2Num(1,3); 
	   
	     System.out.println (add2Num(1,2,3)); 
	   int result =add2Num(1,2,3);
	   System.out.println(result);
	   
}
   
 public static void add2Num(int num1,int num2) {
	 System.out.println(num1+num2);
	 
 }  
   
 public static void int add2Num(int num1,int num2,int num3) {
	// System.out.println(num1+num2+num3);
	 return num1+num2+num3;
	 
 }  
   
   
   
   
   
   
}
