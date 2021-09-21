package AllTaskFriends;

public class ArrayListTaskPedroOpal {
//Write java program that can add an Integer after the last index of an integer array
//	int nums[] = { 1, 2, 3 };
//	int nums2[] = new int[nums.length + 1];
//	for (int i = 0; i < nums.length; i++) {
//		nums2[i] = nums[i];
//	}
//	nums2[nums.length] = 7;
//	System.out.println(Arrays.toString(nums2));
	//****************//
// Write java program that can add a double after the last index of a double array
//	double nums[] = { 1.0, 2.0, 3.0 };
//	double nums2[] = new double[nums.length + 1];
//	for (int i = 0; i < nums.length; i++) {
//		nums2[i] = nums[i];
//	}
//	nums2[nums.length] = 7.5;
//	System.out.println(Arrays.toString(nums2));
	
// Write java program s that can add a String after the last index of a String array
//	String words[] = { "I", "am", "a" };
//	String words2[] = new String[words.length + 1];
//	for (int i = 0; i < words.length; i++) {
//		words2[i] = words[i];
//	}
//	words2[words.length] = "CHAMPION";
//	System.out.println(Arrays.toString(words2));
// Write java program that can add a char after last index of a char array
//	char letters[] = { 'w', 'x', 'y' };
//	char letters2[] = new char[letters.length + 1];
//	for (int i = 0; i < letters.length; i++) {
//		letters2[i] = letters[i];
//	}
//	letters2[letters.length] = 'z';
//	System.out.println(Arrays.toString(letters2));
//	
/*
* Write a program that can return the sum of all the digits from a string ex:
* input: “a1b2c3” output: 6 (1+2+3= 6) input: “Today’s date is 04/27/2020"
* output: 17 (0+4+2+7+2+0+2+0=17)
*/
//	String str = "a1b2c3";
//	String str2 = "Today’s date is 04/27/2020";
//	ArrayList<String> list = new ArrayList<>();
//	ArrayList<String> list2 = new ArrayList<>();
//	int total1 = 0;
//	for (int i = 0; i < str.length(); i++) {
//		if (Character.isDigit(str.charAt(i))) {
//			String currentChar = Character.toString(str.charAt(i));
//			list.add(currentChar);
//		}
//	}
//	for (int i = 0; i < list.size(); i++) {
//		int value = Integer.parseInt(list.get(i));
//		total1 += value;
//	}
//	System.out.println(total1);
//	int total2 = 0;
//	for (int i = 0; i < str2.length(); i++) {
//		if (Character.isDigit(str2.charAt(i))) {
//			String currentChar = Character.toString(str2.charAt(i));
//			list2.add(currentChar);
//		}
//	}
//	
//	for (int i = 0; i < list2.size(); i++) {
//		int value = Integer.parseInt(list2.get(i));
//		total2 += value;
//	}
//	System.out.println(total2);
	
/*
* Write a program that can set the last element of the Integer arraylist to
* zero 
* ex: list = [1,2,3,4,5]; output: [1,2,3,4,0];
*/
//	ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//	list.set(list.size() - 1, 0);
//	System.out.println(list);
//	
//* Write a program that can multiply each odd number by 2 
//* ex: list = [1,2,3,4,5]; output: [2,2,6,4,10]
//	ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//	for (int i = 0; i < list.size(); i++) {
//		if (list.get(i) % 2 == 1) {
//			int num = list.get(i);
//			num *= 2;
//			list.set(i, num);
//		}
//	}
//	
//	System.out.println(list);

// Write a program that find the unique names from an arraylist of string
//	ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "Mary", "John", "Bob", "Susan", "Bob"));
//	for (int i = 0; i < names.size(); i++) {
//		int count = 0;
//		for (int k = 0; k < names.size(); k++) {
//			if (names.get(i) == names.get(k)) {
//				count++;
//			}
//		}
//		if (count == 1) {
//			System.out.print(names.get(i) + " ");
//		}
// 
//		 
//	}
//
//}
