package day27_classAndObject;

import java.util.ArrayList;

public class StudentObject {

	public static void main(String[] args) {
		Student  John=new Student();
		John.name="John";
		John.age=12;
		John.color="fair";
		John.gender='M';
		
		John.eat();
		John.sleep();
		John.run();
		
		Student  student2=new Student();
		student2.name="sophia";
		student2.age=10;
		student2.color="fair";
		student2.gender='f';
		
		student2.eat();
		student2.sleep();
		student2.run();
		
		Student Lily=new Student();
		Lily.name="Lily";
		Lily.age=11;
		Lily.color="Dark";
		Lily.gender='f';
		
		Lily.eat();
		Lily.sleep();
		Lily.run();
		

	 



//ArrayList<Dog>dogs=new ArrayList<>();
//dogs.add(dog1);
//dogs.add(dog2);
//dogs.add(dog3);
//dogs.add(dog4);
//dog.add(dog5);
//dog.add(dog6);
//dog.add(dog7);
//dog.add(dog8);
//dog.add(dog9);
//dog.add(dog10);



Student student1 =new Student();
student1.name="dina";
student1.age=3;
student1.color="white";
student1.gender='F';


Student student5 =new Student();
student5.name="rana";
student5.age=4;
student5.color="white";
student5.gender='F';

student5.printInfo();
Student student4 =new Student("hhhh",8,'k',"jj");
student4.printInfo();


// testing git hub

}
}


