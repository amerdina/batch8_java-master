package day14_StringInterviewQuestions;

public class CodilityTestCoders {

	public static void main(String[] args) {
		/*
		 * That, given positive Integer N, Points the consecutive numbers from 1 to N,
		 * each on a separate line, However, and number divisible by 2, 3, 5, should be
		 * replaced by the word Codility, Test, Coders respectively.
		 * 
		 * If the number divisible by more than one if the numbers: 2,3 or 5, it should
		 * be replaced by a concatenation of the respective words Codility, Test, and
		 * Coders in the given order. For example, numbers divisible by both 2 and 3
		 * should be replaced by CodilityTest and numbers divisible by all three
		 * numbers: 2,3, and 5, should be replaced by CodilityTestCoders. For example,
		 * here is the output for 24: 1 Codility Test Codility Coders CodilityTest 7
		 * Codility Test CodilityCoders 11 CodilityTest 13 Codility TestCoders Codility
		 * 17 CodilityTest 19 CodilityCoders Test Codility 23 CodilityTest
		 *
		 *
		 * 
		 */

//		String a = "Codility";
//		String b = "Test";
//		String c = "Coders";
//		int num = 24;
//
//		for (int i = 1; i <= num; i++) {
//			if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
//				String k = Character.toString(i);
//
//				System.out.println(k.replace(k, a));
//			} else {
//				System.out.println(i);
//			}
//		}

//		int str = 24;
//
//		for (int i = 1; i <= str; i++) {
//
//			if (i % 1 != 0)
//				System.out.println("codility" + " ");
//
//			else if (i % 7 != 0)
//				System.out.println("codilityTest" + " ");
//
//			else if (i % 30 != 0)
//				System.out.println("CodilityTestCoders." + " ");
//
//			else
//				System.out.println(i + " ");
//		}

//		1
//		Codility
//		Test
//		Codility
//		Coders
//		CodilityTest
//		7
//		Codility
//		Test
//		CodilityCoders
//		11
//		CodilityTest
//		13
//		Codility
//		TestCoders
//		Codility
//		17
//		CodilityTest
//		19
//		CodilityCoders
//		Test
//		Codility
//		23
//		CodilityTest

//		String str1 = "Codility";
//		String str2 = "Test";
//		String str3 = "Coders";
//		for (int i = 1; i <= 24; i++) {
//			if (i % 2 == 0) {
//				System.out.println(str1);
//			} else if (i % 3 == 0) {
//				System.out.println(str2);
//			} else if (i % 5 == 0) {
//				System.out.println(str3);
//			} else if (i % 2 == 0 && i % 3 == 0) {
//				System.out.println(str1.concat(str2));
//			} else if (i % 2 == 0 && i % 5 == 0) {
//				System.out.println(str1.concat(str3));
//			} else if (i % 3 == 0 && i % 5 == 0) {
//				System.out.println(str2.concat(str3));
//			} else if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
//				System.out.println(str1.concat(str2).concat(str3));
//			} else {
//				System.out.println(i);
//			}
//		}

//		for (int i = 0; i <= 24; i++) {
//
//			System.out.println(i);
//
//			if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
//
//				System.out.println(" CodilityTestCoders ");
//			}
//
//			String PrintThis = "";
//
//			if (i % 2 == 0 && i % 3 == 0) {
//				PrintThis = "CodilityTest";
//
//				if (i % 2 == 0 && i % 5 == 0) {
//					PrintThis = "CodilityTest";
//
//					if (i % 3 == 0 && i % 5 == 0)
//						PrintThis = "CodilityTest";
//				}
//
//				System.out.println(PrintThis);
//
//			}
//		}
		
		
		
		String str1 = "Codility";
		String str2 = "Test";
		String str3 = "Coders";
		
		String msg = "";
		
		
		for(int i = 1 ; i <=34; i ++) {
			
			
			if (i % 2 == 0) {
				msg = str1;
			}
			
			if (i % 3 == 0) {
//				msg += str2;
				
				msg = msg.concat(str2);
			}
			
			if (i % 5 == 0) {
//				msg += str3;
				msg = msg.concat(str3);
			}
			
			if (msg.length() == 0) {
				System.out.println(i);
			}else {
				System.out.println(msg);
			}
			
			msg = "";
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
