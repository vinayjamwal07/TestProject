import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayChallange {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the limit of array : \r ");
		int num = scan.nextInt();

		int[] array = getInteger(num);

		System.out.println("Original Array =" + Arrays.toString(array));

		//		for(int i = 0;i<array.length;i++) {
		//			System.out.println("Entered integer on index "+i+" and the value is "+array[i]);
		//			
		//		}

		reverse(array);
		System.out.println("Reversed array =" + Arrays.toString(array));

	}

	private static int[] getInteger(int number) {
		System.out.println("Enter " + number + " integer value");
		int[] value = new int[number];

		for (int i = 0; i < value.length; i++) {
			value[i] = scan.nextInt();
		}
		return value;
	}

	private static void reverse(int[] array) {

		int maxIndex = array.length - 1;
		int halfLength = array.length / 2;
		for (int i = 0; i < halfLength; i++) {
			int temp = array[i];
			array[i] = array[maxIndex - i];
			array[maxIndex - i] = temp;
		}
	}

}
