package com.collection.comparatorvscomparable;

import java.util.Set;
import java.util.TreeSet;

public class TestEmployee {
	public static void main(String[] args) {

		Employee[] employees = { new Employee(1001, "Sai", "Developer", 50),
				new Employee(1010, "Pawan", "Architect", 80), new Employee(1004, "Chinna", "CEO", 101),
				new Employee(1002, "Ashok", "Lead", 60) 
				};

		Set<Employee> treeSet = new TreeSet<>(new EmployeeComparator());
		for (Employee emp : employees) {
			treeSet.add(emp);
		}

		System.out.println(treeSet);
	}
}
