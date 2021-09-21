package day13_StringTasks;

public class SubStringTask {

	public static void main(String[] args) {
		
		
		String email2 = "test@gmail.com";
		
		System.out.println(email2.indexOf("@"));
		
		
		String email = "irfan.tursun@techcirclesolutions.org";
		
		// Extract username and domain name from email
		
		
//		String username = "irfan.tursun";
//		String domainName = "techcirclesolutions";
		
		String username = email.substring(0,email.indexOf("@"));
		
		System.out.println(username);
		
		System.out.println(email.lastIndexOf("."));
		
		int startIndex = email.indexOf("@")+1;
		
		int endingIndex = email.lastIndexOf(".");
		
		String domainName = email.substring(startIndex, endingIndex);
		
		System.out.println(domainName);
		
		
//		               012345678910
		String city = "Bloomington";
		
		
		System.out.println(city.substring(2, 4));
		
		System.out.println(city.substring(2, 8));
		
		
		System.out.println(city.substring(8));
		
		
		String s = "mint".replace('t', 'e');
		
		System.out.println(s);
		
		System.out.println(s.toUpperCase());
		
		
		int num = 10;
		
		String str = ""+num;
		
		System.out.println(str);
		
		
		String str2 = String.valueOf(num);
		
		System.out.println(str2); 
		System.out.println(str + str2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

