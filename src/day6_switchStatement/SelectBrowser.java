package day6_switchStatement;

public class SelectBrowser {

	public static void main(String[] args) {

		String targetBrowser = "IE";

		switch (targetBrowser) {

		case "Chrome":
			// WebDriver driver = new ChromeDriver();
			System.out.println("Create instance of chrome browser");
			break;

		case "Edge":
			System.out.println("Create instance of Edge browser");
			break;

		case "Safari":
			System.out.println("Create instance of safari browser");
			break;

		case "IE":
			System.out.println("Create instance of ie browser");
			break;

		}

		int num1 = -200;
//		int num2 = -200;

		if (num1 > 0) {
			System.out.println("pozitive number is" + num1);
		} else if (num1 < 0) {
			System.out.println("negative number is" + num1);
		}else {
			System.out.println("Hello");
		}

//		if ("pozitive number is"+ num1  "negative number is" + num2);{
//		
//		System.out.println("pozitive number");	
//		
//		}else {
//			
//		System.out.println("negative number");	
//		}

	}

}
