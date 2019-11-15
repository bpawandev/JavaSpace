package com.collection.set;

import java.util.TreeSet;

public class Person {
	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>();
		names.add("Pawan");
		names.add("Chinna");
		names.add("Krishna");
		names.add("Vijay");
		names.add("Suresh");
		System.out.println(names);
		
		//iterating using foreach
		for(String name : names) {
			System.out.println(name);
		}
	}
}
