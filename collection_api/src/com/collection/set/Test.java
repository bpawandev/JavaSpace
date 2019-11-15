package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Set<String> phones = new HashSet<>();
		phones.add("Oneplus");
		phones.add("iPhone");
		phones.add("Sony");
		phones.add("Samsung");
		phones.add("Sony");
		phones.add("Oneplus");
		System.out.println(phones);
		
		//iterating using foreach
		for(String phone : phones) {
			System.out.println(phone);
		}
	}
}
