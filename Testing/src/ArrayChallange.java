import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallange {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the length of array :");
		int num = scan.nextInt();

		int[] myInteger = getInteger(num);
        int[] sorted = sortInteger(myInteger);
        printArray(sorted);



	}

	public static int[] getInteger(int capacity) {

		System.out.println("Enter "+capacity+" integer values:\r");

		int[] values=new int[capacity];

		for(int i=0;i < values.length;i++) {
			values[i]=scan.nextInt();
		}
		return values;
	}

	public static void printArray(int[]array) {
		for(int i =0;i<array.length;i++) {
			System.out.println("Element "+i+" typed value is "+array[i]);
		}
	}

	public static int[] sortInteger(int[]array) {

		/*
		 * int [] sortedArray= new int[array.length]; for(int i=0;i<array.length;i++) {
		 * sortedArray[i]=array[i]; }
		 */
		
		int [] sortedArray= Arrays.copyOf(array, array.length);
		boolean flag=true;
		int temp;

		while(flag) {
			flag=false;
			for(int i=0;i<sortedArray.length-1;i++) {
				if(sortedArray[i] < sortedArray[i+1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = temp;
					flag=true;
				}
			}
		}
		return sortedArray;

	}

}
