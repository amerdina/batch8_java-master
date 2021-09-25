package day27_classAndObject;

public class Student {
//instance Variable
	
	String name;
	int age;
	char gender;
	String color;
	
	
	
	public Student() {}
	
	
	
	public Student (String name,int age,char gender,String color) {
		this .age=age;
		this.color=color;
		this.gender=gender;
		this.name=name;
	}
		
	
	public void printInfo() {
		System.out.println(" NAME= "+ name + "age = "+ age + "gender= "+ gender +" color =" +color );
	}
	
	public void eat() {
		System.out.println(name+ " is eating ");
	}
public void run() {
	System.out.println(name+ " is running!");
}
public void sleep() {
	System.out.println(name+ " is sleeping!");
}
}
