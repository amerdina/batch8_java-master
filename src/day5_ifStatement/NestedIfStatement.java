package day5_ifStatement;

public class NestedIfStatement {

	public static void main(String[] args) {

		int temperature = 60;

		boolean sunny = false;

		if (temperature > 90) {
			if (sunny) {
				System.out.println("Beach");
			} else {
				System.out.println("Movie");
			}
		} else {
			if (sunny) {
				System.out.println("Tennis");
			} else {
				System.out.println("Soccer");
			}

		}

	}

}
