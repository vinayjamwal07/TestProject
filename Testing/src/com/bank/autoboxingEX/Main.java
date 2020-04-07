package com.bank.autoboxingEX;
//There should be a Bank class
//It should have an arraylist of Branches
//Each Branch should have an arraylist of Customers
//The Customer class should have an arraylist of Doubles (transactions)

//Customer:
//Name, and the ArrayList of doubles.

//Branch:
//Need to be able to add a new customer and initial transaction amount.
//Also needs to add additional transactions for that customer/branch

//Bank:
//Add a new branch
//Add a customer to that branch with initial transaction
//Add a transaction for an existing customer for that branch
//Show a list of customers for a particular branch and optionally a list
//of their transactions

//Demonstration autoboxing and unboxing in your code
//Hint: Transactions
//Add data validation.
//e.g. check if exists, or does not exist, etc.
//Think about where you are adding the code to perform certain actions

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank("SBI");
		bank.addBranch("Sarkaghat");
		
		bank.addCustomer("Sarkaghat","Vinay" ,100.45);		
		bank.addCustomer("Sarkaghat","Vijay" ,5400.45);
		bank.addCustomer("Sarkaghat","Ram" ,4100.45);
		
		bank.addBranch("Mandi");
		bank.addCustomer("Mandi","Vinit" ,1240.45);
		
		bank.addBranch("JoginderNagar");
		bank.addCustomer("Mandi","Vinit" ,1240.45);
		
		if(!bank.addCustomer("Vip road","Vinay", 451147.00)) {
			System.out.println("Error this branch does not exist ");
		}
		
		
		
	}
}
