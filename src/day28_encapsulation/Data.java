package day28_encapsulation;

public class Data {

	public static void main(String[] args) {
		 
		Credentials c=new Credentials();
		//
		System.out.println(c.getUserName());
		System.out.println(c.getPassward());
		
		c.setUserName("techcircle@techcirclesolutions.org");
		c.getPassward("passward @b");
		
		System.out.println(c.getUserName());
		System.out.println(c.getPassward());
		
	}

}
