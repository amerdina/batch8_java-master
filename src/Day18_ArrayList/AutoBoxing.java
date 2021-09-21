package Day18_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class AutoBoxing {

	public static void main(String[] args) {
//	Integer i= new Integer(10);
//	int i1=i;
//	//i1 is aprimitive integer with value
//	System.out.println("value of i:"+i);
//	System.out.println("value of i1:=" +i1 );
//		
		
//		Character gfg='a';
//		String name="jo";
//		
//		gfg.toString();
//		
//		char ch=gfg;
//		System.out.println("value of ch  =  " +ch);
//		System.out.println("value of gfg=" +gfg);
//		
		
//ArrayList<Integer> arrlist = new ArrayList<Integer>();
//		
//		arrlist.add(14);
//		arrlist.add(7);
//		arrlist.add(39);
//		arrlist.add(40);
//		
//		System.out.println("For Loop");
//		for (int counter = 0; counter < arrlist.size(); counter++) {
//			System.out.println(arrlist.get(counter));
//		}
////		
//		System.out.println("Advanced For Loop");
//		for(Integer num : arrlist) {
//			System.out.println(num);
//		}

//		System.out.println("while loop");
//		int count=0;
//		while(arrlist.size()>count) {
//		 
//			System.out.println(arrlist.get(count));
//			count++;
//			
		
//	System.out.println("itreator");
//	Iterator iter=ArrayList.iterator();
//	while(iter.hasNext()) {
		System.out.println(iter.next());
		System.out.println("Iterator");
		Iterator iter = arrlist.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	}

}
