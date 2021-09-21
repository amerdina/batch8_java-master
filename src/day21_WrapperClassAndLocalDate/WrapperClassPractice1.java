package day21_WrapperClassAndLocalDate;

public class WrapperClassPractice1 {

	public static void main(String[] args) {
		 Integer a =10;
		 byte b =a.byteValue();
		 System.out.println(b);
		 double d=a.doubleValue();
		 System.out.println(d);
		 long l=a.longValue();
		 
		 String num="123";
		 int value=Integer.parseInt(num);
		 System.out.println(value+7);
		 
int result=value+7;
System.out.println(result);

		num=Integer .toString(result);
		System.out.println(num.charAt(1));
		// ________
		 String str2= "25";
		 byte valueB=Byte.parseByte(str2);
 		 System.out.println(valueB);
 		 
//String str2 = "25";//
		
		//byte valueB = Byte.parseByte(str2);
		
		System.out.println(valueB);
		
		
		
		//String str2= "25";
		// byte valueB=Byte.parseByte(str2);
		 
		 System.out.println(valueB);
		
		//Add 100 to the valueB, and assign the result to the str2;
		
		 byte result2=(byte)(valueB+100);
		 str2=Byte.toString(result2);
		 System.out.println(str2);
		 
		 
		 
	}

}
