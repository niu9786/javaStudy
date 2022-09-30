import java.util.Arrays;

public class ArraySorterDemo {

	public static void main(String[] args) {
		int[] test1 = new int[] { 27, 54, 15, 4, 38 };
		
		System.out.println(Arrays.toString(test1));
		
		System.out.println();
		
		ArraySorter.bubbleSort(test1);
		
		System.out.println(Arrays.toString(test1));
		
		System.out.println();
		
		int[] test2 = new int[] { 87, 24, 21, 57, 4 };
		
		System.out.println(Arrays.toString(test2));
		
		System.out.println();
		
		ArraySorter.bubbleSort(test2);
		
		System.out.println(Arrays.toString(test2));

	}

}
