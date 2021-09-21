package AllTaskFriends;

public class Practice {

	public static void main(String[] args) {
		String str="Hello java java java";
		String lookingFor="java";
		
		
		
		
	}
		
	public static int FindWord(String str,String lookingFor); 	
		
		  String[] word1 = str.split(" ");
		//System.out.println(Arrays.toString(word1));
		boolean flage=false;
		int count = 0;
		for (String word : word1) {
			if (lookingFor.equals(word)) {
				count++;flage=true;
			}
		}
		if(flage)
		{
			System.out.println("I found it "+ lookingFor + count+ "times");
		}else
		{
			System.out.println(lookingFor+"is NotFond");}
		 }
	 	return count;
	 	}}
