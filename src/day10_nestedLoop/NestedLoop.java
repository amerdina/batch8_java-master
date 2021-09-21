package day10_nestedLoop;

public class NestedLoop {
	
	public static void main(String[] args) {
		
		
		for(int i = 1 ; i <= 6 ; i++) {
			
			System.out.println("Row <"+ i+">");
			
			for (int j = 1; j < 4 ; j++) {
//				System.out.println("Column "+j);
				
				System.out.println("Cell("+i+" , "+j+")");
				
			}
			
		}
		
//		
//		1 2 3
//		1 2 3
//		1 2 3


		
		for (int i = 1 ; i < 4 ; i++) {
			for (int j = 1 ; j < 4 ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		int n = 8;
		
		 int space = n - 1;
	     
	        // run loop (parent loop)
	        // till number of rows
	        for (int i = 0; i < n; i++)
	        {
	            // loop for initially space,
	            // before star printing
	            for (int j = 0; j < space; j++)
	                System.out.print(" ");
	     
	            // Print i+1 stars
	            for (int j = 0; j <= i; j++)
	                System.out.print("* ");
	     
	            System.out.print("\n");
	            space--;
	        }
	     
	        // Repeat again in
	        // reverse order
	        space = 0;
	     
	        // run loop (parent loop)
	        // till number of rows
	        for (int i = n; i > 0; i--)
	        {
	            // loop for initially space,
	            // before star printing
	            for (int j = 0; j < space; j++)
	                System.out.print(" ");
	     
	            // Print i stars
	            for (int j = 0; j < i; j++)
	                System.out.print("* ");
	     
	            System.out.print("\n");
	            space++;
	        }
	
		
		
		
	}
	
	
	
}
