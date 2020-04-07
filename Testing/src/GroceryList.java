import java.util.ArrayList;

public class GroceryList {
	private ArrayList<String> groceryList= new ArrayList<String>();

	
	public ArrayList<String> getGroceryList() {
		return groceryList;
	}

	public void addGroceryItems(String item) {
		groceryList.add(item);

	}

	public void printGrocerylist() {
		System.out.println("you have "+ groceryList.size()+" items in your grocery list");
		for(int i=0; i<groceryList.size();i++) {
			System.out.println((i+1)+". "+groceryList.get(i));
		}
	}

	public void modifyGroceryitem(String currentItem,String newItem) {
		int position = finditems(currentItem); 
		if( position >= 0) {
			modifyGroceryitem(position, newItem);
		}
	}

	private void modifyGroceryitem(int postion, String newItem) {

		groceryList.set(postion, newItem);
		System.out.println("Grocery item "+ (postion+1) + " has been modified");
	}

	public void removegrocerItem(String item) {
		int position = finditems(item); 
		if( position >= 0) {
			removegrocerItem(position);
		}
	}

	private void removegrocerItem(int position) {
		String theItem= groceryList.get(position);
		groceryList.remove(position);
		System.out.println("  Removed item "+theItem);
	}

	private int finditems(String searchItem) {
		return groceryList.indexOf(searchItem);
	}

	public boolean onFile(String searchItem) {
		int position = finditems(searchItem);
		if(position >= 0) {

			return  true;
		}

		return false;
	}
}
