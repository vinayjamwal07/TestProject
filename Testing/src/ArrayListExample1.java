import java.util.Scanner;

public class ArrayListExample1 {

	private static Scanner scan= new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the array limit :");
		int num= scan.nextInt();


		int[] myInteger= getInteger(num);
		for(int i=0;i<myInteger.length;i++) {
			System.out.println("Element "+i+" typed value is "+myInteger[i]);
		}

		System.out.println("The average is "+getAverage(myInteger));

	}



	private static int[] getInteger(int number) {
		System.out.println("Enter "+number+" integer values. \r");
		int[] values=new int[number];

		for(int i=0;i<values.length;i++) {
			values[i]=scan.nextInt();
		}
		return values;  
	}

	private static double  getAverage(int[] myInteger) {
		int sum=0;
		for(int i=0;i<myInteger.length;i++) {

			sum += myInteger[i]; 
		}

		return (double)sum/(double)myInteger.length;
	}
}
