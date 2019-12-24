package com.collection.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Baikati Pawan
 *
 */
public class TestPerson {

	public static void sortBySsn(List<Person> persons) {
		System.out.println("=====================based on ssn ascending order================================");
		Collections.sort(persons, (person1, person2) -> person1.getSsn() - (person2.getSsn()));
		persons.stream().forEach(person -> System.out.println(person));

		System.out.println("=====================based on ssn discending order================================");
		Collections.sort(persons, (person1, person2) -> person2.getSsn() - (person1.getSsn()));
		persons.stream().forEach(person -> System.out.println(person));
	}

	public static void sortByFirstName(List<Person> persons) {

		System.out.println("=====================based on first name ascending order================================");
		Collections.sort(persons, (person1, person2) -> person1.getFirstName().compareTo(person2.getFirstName()));
		persons.stream().forEach(person -> System.out.println(person));

		System.out.println("=====================based on first name discending order================================");
		Collections.sort(persons, (person1, person2) -> person2.getFirstName().compareTo(person1.getFirstName()));
		persons.stream().forEach(person -> System.out.println(person));
	}

	public static void sortByLastName(List<Person> persons) {
		System.out.println("=====================based on last name ascending order================================");
		Collections.sort(persons, (person1, person2) -> person1.getLastName().compareTo(person2.getLastName()));
		persons.forEach(person -> System.out.println(person));

		System.out.println("=====================based on last name discending order================================");
		Collections.sort(persons, (person1, person2) -> person2.getLastName().compareTo(person1.getLastName()));
		persons.forEach(person -> System.out.println(person));
	}

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person(501, "Krishna", "Sai", "Male", "Australia"),
				new Person(101, "Pawan", "Kumar", "Male", "India"),
				new Person(201, "Suresh", "Babu", "Male", "America"),
				new Person(401, "Kalyani", "James", "Female", "London"),
				new Person(301, "James", "Blake", "Male", "America"));

		System.out.println("==================printing all the persons===========================================");
		persons.stream().forEach(person -> System.out.println(person));
		sortBySsn(persons);
		sortByFirstName(persons);
		sortByLastName(persons);

	}

}
