package com.bl;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayListExample {
	public static void main(String args[]) {
		// first array list
		ArrayList<String> firstList = new ArrayList<String>();
		// adds elements 
		firstList.add("Apple");
		firstList.add("Pears");
		firstList.add("Guava");
		firstList.add("Mango");
		System.out.println(firstList);
		// second array list
		List<String> secondList = new ArrayList<String>();
		// adds elements 
		secondList.add("Apple");
		secondList.add("Pears");
		secondList.add("Guava");
		secondList.add("Mango");
		System.out.println(secondList);
		// comparing both lists
		boolean l1 = firstList.equals(secondList); // returns true because lists are equal
		System.out.println(l1);
		// adding another element in the second list
		secondList.add("Papaya");
		// again comparing both lists
		boolean l2 = firstList.equals(secondList); // returns false because lists are not equal
		System.out.println(l2);
	}
}
