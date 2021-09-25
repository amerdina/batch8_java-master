package day29_inheritance;

public class AudioBook extends Book {

	int lenght;
	String narrator;
	
	public void listen() {
		
		System.out.println("Listening audio book : ");
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("lenght : "+lenght);
		System.out.println("narrator : "+narrator);
		System.out.println("price : "+price);
		
	}
	
	
}