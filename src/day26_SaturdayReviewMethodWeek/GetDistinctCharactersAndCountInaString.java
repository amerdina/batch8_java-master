package day26_SaturdayReviewMethodWeek;

public class GetDistinctCharactersAndCountInaString {
	public static void main(String[] args) {
		
/*How to get distinct() characters and their count in a String?
 * */
	String str="hello world";
	int count=0;
	for( int i=0;i<str.length();i++){
		char eachChar=str.charAt(i);
		count++;
	}
	 System.out.println(count);
	
}}
