package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * @author Baikati Pawan
 *
 */
public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> personMap = new HashMap<>();
		personMap.put(101, "Bob");
		personMap.put(201, "John");
		personMap.put(100, "Pal");
		personMap.put(15, "Brown");

		Set<Entry<Integer, String>> entries = personMap.entrySet();
		Iterator<Entry<Integer, String>> iterator = entries.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
