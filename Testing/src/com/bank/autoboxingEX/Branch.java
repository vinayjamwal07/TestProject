package com.bank.autoboxingEX;

import java.util.ArrayList;

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

public class Branch {
	private String name;

	private ArrayList<Customer> customer;


	public Branch (String name) {
		this.name = name;
		customer = new ArrayList<Customer>();
	}


	public String getName() {
		return name;
	}

	public ArrayList<Customer> getCustomer() {
		return customer;
	}
	public boolean newCustomer(String customerName, double initialAmount) {
		if(findCustomer(customerName) == null) {
			this.customer.add(new Customer(customerName, initialAmount));
			return true;
		}
		return false;

	}

	public boolean addCustomerTransaction(String customerName,double amount) {
		Customer existingCustomer = findCustomer(customerName);

		if( existingCustomer != null) {
			existingCustomer.addTransaction(amount);
			return true;
		}
		return false;
	}
   
	private Customer findCustomer(String customerName) {
		for(int i = 0;i<this.customer.size();i++) {
			Customer checkedCustomer = this.customer.get(i);
			if(checkedCustomer.getCustomerName().equals(customerName)) {
				return checkedCustomer;
			}
		}
		return null;
	} 

}
