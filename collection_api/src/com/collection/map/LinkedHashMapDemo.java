package com.collection.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("John", 11);
		linkedHashMap.put("Vijay", 15);
		linkedHashMap.put("Ram", 8);
		linkedHashMap.put("Raju", 4);
		System.out.println(linkedHashMap);

		Set<String> set = linkedHashMap.keySet();
		System.out.println("Keys :" + set);

		Collection<Integer> values = linkedHashMap.values();
		System.out.println("Values : " + values);

		Set<Entry<String, Integer>> entries = linkedHashMap.entrySet();
		System.out.println(entries);

		Iterator<Entry<String, Integer>> iterator = entries.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = (Entry<String, Integer>) iterator.next();
			System.out.println(entry.getKey() + "----" + entry.getValue());
		}

	}
}
