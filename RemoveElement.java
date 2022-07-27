package com.bl;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
	public static void main(String[] args) {
		List<String> listStrings = new ArrayList<String>();
		listStrings.add("Audi");
		listStrings.add("BMW");
		listStrings.add("Bugatti");
		listStrings.add("Ford");
		listStrings.add("Honda");
		listStrings.add("Hyundai");

		System.out.println(listStrings);
		// Removing the third element from the list.
		listStrings.remove(2);

		System.out.println("After removing third element from the list:\n" + listStrings);
	}
}
