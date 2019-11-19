package com.jackson.example.jackson2;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @author Baikati Pawan
 *
 */
public class Person {
	private int ssn;
	private String firstName;
	private String lastName;
	private String email;

	public Person(int ssn, String firstName, String lastName, String email) {
		this.ssn = ssn;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public static void main(String[] args) {
		Person person = new Person(101, "Pawan", "Kumar", "pawan@abc.com");

		ObjectMapper mapper = new ObjectMapper();
		mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
		try {
			// convert Pojo into json (prints normally)
			String json = mapper.writeValueAsString(person);

			// convert Pojo into json (prints json pretty format)
			String formattedJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);

			System.out.println(json);

			System.out.println(formattedJson);

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
