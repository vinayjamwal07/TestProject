package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListInorderEx {

	public static void main(String[] args) {
		LinkedList<String> placesTovisit = new LinkedList<String>();
		addInOrder(placesTovisit, "Chandigarh");
		addInOrder(placesTovisit, "Mandi");
		addInOrder(placesTovisit, "Mohali");
		addInOrder(placesTovisit, "Panchkula");
		addInOrder(placesTovisit, "Zirakpur");
		addInOrder(placesTovisit, "Shimla");
		addInOrder(placesTovisit, "Sarkaghat");
		addInOrder(placesTovisit, "Makehar");
		addInOrder(placesTovisit, "Cholthara");
		
		printList(placesTovisit);
		addInOrder(placesTovisit, "Nabahi");
		addInOrder(placesTovisit, "Khlardu");
		printList(placesTovisit);
		
	}

	private static void printList(LinkedList<String> placesTovisit) {
		Iterator<String> i = placesTovisit.iterator();
		System.out.println("========================");

		while (i.hasNext()) {
			System.out.println("Now visiting " + i.next());
		}
		System.out.println("========================");

		/*
		 * for (int i= 0; i< placesTovisit.size();i++) {
		 * System.out.println("Places to be visited :"+placesTovisit.get(i)); }
		 */
	}

	private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
		ListIterator<String> stringListIterator = linkedList.listIterator();

		while (stringListIterator.hasNext()) {
			int comparison = stringListIterator.next().compareTo(newCity);
			if (comparison == 0) {
				System.out.println(newCity + " is alrady included in the destination");
				return false;
			} else if (comparison > 0) {
				// new city should appear before this one
				stringListIterator.previous();
				stringListIterator.add(newCity);
				return true;
			} else if (comparison < 0) {
				// move to the next city
			}
		} 
		
		stringListIterator.add(newCity);
		return true;
	}

	/*
	 * private static void visit(LinkedList cities) { Scanner scanner = new
	 * Scanner(System.in); boolean quit = false; ListIterator<String> listIterator =
	 * cities.listIterator(); if(cities. )
	 * 
	 * }
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
