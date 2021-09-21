package day22_myArayListWithIrfan;

import java.util.ArrayList;
import java.util.Arrays;

public class CloneArrayLIstCod {

	public static void main(String[] args) {
		ArrayList<String> c1=new ArrayList<>(Arrays.asList("b","h","i")) ;
		ArrayList<String> newc1 = new ArrayList<String>(c1);
		System.out.println(newc1);

	}

}
