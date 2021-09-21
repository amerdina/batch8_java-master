package TaskFinalArraySeptember;

public class FindNumberInArray20132019 {

	public static void main(String[] args) {
		int[] my_array1 = { 1789, 2035, 1899, 1456,  1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456 };
		int lookingFor1 = 2019;
		int lookingFor2 = 2013;
		for (int i = 0; i < my_array1.length; i++) {
			if (my_array1[i] == lookingFor1) {
				System.out.println("my_array1 contains " + lookingFor1);
			}
			if (my_array1[i] == lookingFor2) {
				System.out.println("my_array1 contains " + lookingFor2);
			}
		}

	}

}
