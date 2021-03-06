package com.bank.autoboxingEX;

import java.util.ArrayList;

//There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions



public class Customer {

	private String customerName;
	private ArrayList<Double> transactions;


	public Customer(String customerName, double initialAmount) {	
		this.customerName = customerName;
		this.transactions = new ArrayList<Double>();
		addTransaction(initialAmount);
	}


	public void  addTransaction(double amount) {
		
		this.transactions.add(amount);

	}

	public String getCustomerName() {
		return customerName;
	}


	public ArrayList<Double> getTransactions() {
		return transactions;
	}

}
