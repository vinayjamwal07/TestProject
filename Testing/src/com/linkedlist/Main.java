package com.linkedlist;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		Customer customer = new Customer("Vinay", 535.21);
		Customer anotherCustomer = customer;
		anotherCustomer.setBalance(124.3);
		System.out.println("Balance for customer "+ customer.getName()+" is " +customer.getBalance());
		
	     ArrayList <Integer> intList = new ArrayList<Integer>();
	     intList.add(1);
	     intList.add(54);
	     intList.add(21);
	  
	     
	     for(int i = 0;i<intList.size();i++) {
	    	 System.out.println("Entered number in arraylist:"+i+" "+intList.get(i));
	     }
	     System.out.println();
	     
	     intList.add(1, 9);
	    
	     for(int i = 0;i<intList.size();i++) {
	    	 System.out.println("Entered number in arraylist:"+i+" "+intList.get(i));
	     }
	     
	     
	}
}
