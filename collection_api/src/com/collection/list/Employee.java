package com.collection.list;

import java.util.LinkedList;
import java.util.List;

public class Employee {
	public static void main(String[] args) {
		List<String> emps = new LinkedList<>();
		emps.add("Chinna");
		emps.add("Pawan");
		emps.add("Vijay");
		emps.add("Krishna");
		emps.add("Suresh");
		emps.add(2,"Siva");
		System.out.println(emps);
		
		//iterating using foreach
		for(String emp : emps) {
			System.out.println(emp);
		}
	}
}
