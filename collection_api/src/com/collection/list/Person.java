package com.collection.list;

import java.util.List;
import java.util.ArrayList;

public class Person {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Pawan");
		names.add("Chinna");
		names.add("Krishna");
		names.add("Vijay");
		names.add("Suresh");
		System.out.println(names);

		// iterating using foreach
		for (String name : names) {
			System.out.println(name);
		}

		List<Integer> values = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			values.add(i);
		}
	}
}
