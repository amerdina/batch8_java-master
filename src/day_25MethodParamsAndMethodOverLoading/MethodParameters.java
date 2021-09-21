package day_25MethodParamsAndMethodOverLoading;

public class MethodParameters {

	public static void main(String[] args) {
		sayHello("Hanaa") ;

	}
	
	public static void sayHello() {
		System.out.println("Hello");
	}
	public static void sayHello(string name) {
		System.out.println("Hello,"+name);
	}
}
