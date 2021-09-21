package Day18_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListReplaseelementAndreturnIndex {

	public static void main(String[] args) {
/*write java program for array element 
 * #replace panda to bear 
 * # print position index of panda which is modified
 * */						
List<String>animals=new ArrayList<>(Arrays.asList("doge","cat","rabit","panda","pidgone"));
int index=0; 
String replacewith="bear";
for(int i=0;i<animals.size();i++)
{ 
	if (animals.get(i)=="panda")
     {
	index=i;
	System.out.println("the index of panda is "+ index);
	animals.set(index, replacewith);
	}	
 //  System.out.println(animals);////
}
System.out.println(animals);
	}

}
