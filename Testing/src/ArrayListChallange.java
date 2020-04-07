import java.util.Scanner;

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.
public class ArrayListChallange {

	private static Scanner scaneer = new Scanner (System.in);
	private  static MobilePhone mobilePhone = new MobilePhone("0032 5451 53"); 

	public static void main(String[] args) {

		boolean quit= false;
		startPhone();
		printAction();



		while(!quit) {
			System.out.println("\n Enter action: (6 to show available action)");
			int action= scaneer.nextInt();
			scaneer.nextLine();

			switch (action) {
			case 0:
				System.out.println("\n Shutting down the mobile....");
				quit = true;
				break;

			case 1:
				mobilePhone.printContacts();
				break;

			case 2:
				addNewContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				queryContact();
				break;
			case 6:
				printAction();
			default:
				break;
			}

		}

	}

	private static void addNewContact() {
		System.out.println("Enter new contact name: ");
		String name = scaneer.nextLine();
		System.out.println("Enter the phone number: ");
		String phone = scaneer.nextLine();
		Contact newContact = Contact.createContact(name, phone);
		if(mobilePhone.addNewContact(newContact) ) {
			System.out.println("New contact added: name = "+name+", phone= "+phone);
		}else {
			System.out.println("Cannot add, "+name+" already on file");
		}
	}
	
	private static void updateContact() {
		System.out.println("Enter existing contact name: ");
		String name = scaneer.nextLine();
		Contact existingContact = mobilePhone.queryContact(name);
		if(existingContact == null) {
			System.out.println("Contact not found.");
			return;
		}
		System.out.println("Enter new contact name: ");
		String newName = scaneer.nextLine();
		System.out.println("Enter new phone number: ");
		String newnumber = scaneer.nextLine();
		Contact newContact = Contact.createContact(newName, newnumber);
		if(mobilePhone.updateContact(existingContact, newContact)) {
			System.out.println("Sucessfully updated record");
		}else {
			System.out.println("Error updating record");
		}
		
	}
	
	private static void removeContact() {
		System.out.println("Enter existing contact name: ");
		String name = scaneer.nextLine();
		Contact existingContact = mobilePhone.queryContact(name);
		if(existingContact == null) {
			System.out.println("Contact not found.");
			return;
		}
		
		if(mobilePhone.removeContact(existingContact)) {
			System.out.println("Successfully deleted");
		}else {
			System.out.println("Error deleting contact");
		}
		
	}
	private static void queryContact() {
		System.out.println("Enter existing contact name: ");
		String name = scaneer.nextLine();
		Contact existingContact = mobilePhone.queryContact(name);
		if(existingContact == null) {
			System.out.println("Contact not found.");
			return;
		}	
		System.out.println("Name "+existingContact.getName()+" phone number is "+existingContact.getPhoneNumber());	
	}
	

	private static void startPhone() {
		System.out.println("Starting phone........");	
	}


	private static void printAction() {
		System.out.println("\nAvailable action : \nPress ");
		System.out.println("\t 0 - to shutdown\n"+
				"\t 1 - to print contacts\n"+
				"\t 2 - to add new contact\n"+
				"\t 3 - to update an existing contact\n"+
				"\t 4 - to remove an existing contact\n"+
				"\t 5 - query if an existing contact exist\n"+
				"\t 6 - to print a list of available action");
		System.out.println("Choose your action: ");
	}







}
