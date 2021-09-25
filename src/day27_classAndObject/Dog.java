package day27_classAndObject;

public class Dog {
	//instance Variable
	
	
    String breed;
	String size;
	int age;
	String color;
	
	// defult constroctor //
	  public Dog() {}
	
	
	   //parameter constroctor//
	   public Dog(String breed,int age,String color,String size) {
		   
		this.age=age;  //setting value to instance variable age//
		this.breed=breed;//setting value to instance variable breed//
		this.size=size;//setting value to instance variable size//
		this.color=color;//setting value to instance variable color//
	   }   
		   
	   
	   public void printInfo() {
		   System.out.println("Name of the puppy is" + breed + "," + age + " yers old"+"size="+size+"color is " +color);
	   } 
	
	
	   
	   
//	//instance Method
//	public void eat() {
//		System.out.println(breed+ " is eating ");
//	}
//public void run() {
//	System.out.println(breed+ " is running!");
// 
////local variable//this acceess only inside this method we cant use it in another method//
//int num=10;
//System.out.println(num);
//}
//  
//public void sleep() {
//	System.out.println(breed+ " is sleeping!");
//}
//public void sit() {
//	System.out.println(breed+ " is sitting!");
//}
}


 
