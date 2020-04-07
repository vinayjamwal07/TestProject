import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
	private static Scanner scanner = new Scanner(System.in); 
	private static GroceryList grocerylist = new GroceryList(); 

	public static void main(String[] args) {

		boolean quit= false;
		int choice= 0;
		printInstruction();

		while(! quit) {
			System.out.println("Enter your choice: ");
			choice= scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 0:
				printInstruction();
				break;
			case 1:
				grocerylist.printGrocerylist();
				break;
			case 2:
				addItems();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchItem();
				break;
			case 6:
				processArrayList();
				break;
			case 7:
				quit = true;
				break;

			default:
				break;
			}
		}
	}

	/********* method to copy one arraylist to another *****************/
	private static void processArrayList() {

		ArrayList<String> newArray = new ArrayList<String>();
		newArray.addAll(grocerylist.getGroceryList());

		/* or */

		ArrayList<String> nextArray = new ArrayList<String>(grocerylist.getGroceryList());

		/* Converting arraylist to the array*/

		String [] mArray= new String[grocerylist.getGroceryList().size()];
		mArray = grocerylist.getGroceryList().toArray(mArray);		

	}

	private static void printInstruction() {
		System.out.println("\nPress ");
		System.out.println("\t 0 - To print choice options");
		System.out.println("\t 1 - To print the list of the grocery items");
		System.out.println("\t 2 - To add items to the grocery list");
		System.out.println("\t 3 - To modify an item in the list");
		System.out.println("\t 4 - To remove an item from the list");
		System.out.println("\t 5 - To search for the item in the list");
		System.out.println("\t 6 - To quit thw application");
	}

	private static void addItems() {
		System.out.println("Please enter the grocery item: ");
		grocerylist.addGroceryItems(scanner.nextLine());

	}

	private static void modifyItem() {
		System.out.println("Current item name: ");
		String itemNo = scanner.nextLine();
		scanner.nextLine();
		System.out.println("Enter the replacement item:");
		String newItem = scanner.nextLine();
		grocerylist.modifyGroceryitem(itemNo,newItem);
	}

	private static void removeItem() {
		System.out.println("Enter the item number to remove: ");
		String itemNumber = scanner.nextLine();
		grocerylist.removegrocerItem(itemNumber);
	}

	private static void searchItem() {
		System.out.println("Enter the item to search: ");
		String searchItem = scanner.nextLine();
		if(grocerylist.onFile(searchItem)){
			System.out.println("Found "+searchItem+ " in the grocery list");
		}else {
			System.out.println(searchItem+ " is not in shopping list");
		}

	}

}
