package day4_relationalOperator;

public class Review {
	public static void main(String[] args) {
		
		int valueA = 20;
		
		int valueB = 4;
		
		System.out.println(valueA + valueB); // 24
		
		int valueC = valueA - valueB; // 16
		
		System.out.println(valueC);
		
		
		System.out.println(valueA * valueB);// 80
		
		System.out.println(valueA / valueB); // 5
		
		
		System.out.println(valueA % valueB); 
		
		
		System.out.println(21%2); // 1
		
		System.out.println(21%4); // (4 +4 +4 +4+4 +1)
		
		
		int a = 1;
		
		a++; // a = a + 1
		
		System.out.println(a); //2
		
		
		System.out.println(a++);//2
		System.out.println(a); //3
		
		
		System.out.println(--a); // a = a -1
		--a;
		
		System.out.println(a);
		
		
		//Relational operator return boolean value
		
		int num1 = 10;
		
		int num2 = 10;
		
		int num3 = 15;
		
		
		System.out.println(num1 == num2); // true
		
		System.out.println(num1 == num3); // false
		
		System.out.println(num1 != num2); // false
		
		System.out.println(num1 != num3); // true
		
		
		System.out.println(num1 < num2); // fasle
		
		System.out.println(num1 <= num2); // true
		
	}
}
