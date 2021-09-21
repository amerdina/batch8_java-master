package TaskArrayAndArrayList;

public class TaskAboutSumNumbersInArraYOfDigitWhithNUMBERS {

	public static void main(String[] args) {
/* 5-write a program that can return the sum of all the digits from a string
            ex:
                input: “a1b2c3”
                output: 6
                    (1+2+3= 6)
                input: “Today’s date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)*/	
		
	String str1="Today’s date is 04/27/2020";
	int sum=0;
	 
	for(int i=0;i<str1.length();i++) {
		char eachChar=str1.charAt(i);
		
	if(Character.isDigit(eachChar))	{
       String str2=Character.toString(eachChar);
        int value=Integer.parseInt(str2);
    	 sum=sum+value;
// System.out.println(sum);
 	}}
	System.out.println("Total sum is " + sum );
	}}
