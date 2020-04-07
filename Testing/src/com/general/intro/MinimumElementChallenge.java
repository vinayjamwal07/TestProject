package com.general.intro;
import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the array length : ");
		int num = scanner.nextInt();

		int[] arrayMade=readInteger(num);
		
		
		for(int i=0;i<arrayMade.length;i++) {
			System.out.println("Entered value on index "+i+" value is :"+arrayMade[i]);
		}

		findMin(arrayMade);	
	}


	private static int[] readInteger (int count) {

		System.out.println("Enter "+count+" integer values.");
		int[] value = new int [count];

		for(int i=0;i<value.length;i++) {

			value[i]=scanner.nextInt();
		}

		return value;
	}


	private static int[] findMin(int[] arrayMade) {

		int [] sortedArray = Arrays.copyOf(arrayMade, arrayMade.length);	
		boolean flag=true;
		int temp;

		while (flag) {
			for(int i=0; i<sortedArray.length-1;i++) {

				if(sortedArray[i]>sortedArray[i+1]) {
					temp=sortedArray[i];
					sortedArray[i]=sortedArray[i+1];
					sortedArray[i+1]=temp;
					flag=true;
				}             
			}
		}
		return sortedArray;
	}

	
	

}
