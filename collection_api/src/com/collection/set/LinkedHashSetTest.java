package com.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
	public static void main(String[] args) {
		Set<String> phones = new LinkedHashSet<>();
		phones.add("Oneplus");
		phones.add("iPhone");
		phones.add("Sony");
		phones.add("Samsung");
		phones.add("Sony");
		phones.add("Oneplus");
		System.out.println(phones);

		// iterating using foreach
		for (String phone : phones) {
			System.out.println(phone);
		}
	}
}
