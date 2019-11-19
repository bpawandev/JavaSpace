package com.jackson.example.jackson2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaTest {
	public static void main(String[] args) throws JsonProcessingException {
		String json = "{\"studentId\":101,\"name\":\"Chinna\",\"rank\":2,\"grade\":8}";
		ObjectMapper mapper = new ObjectMapper();
		Student student = null;
		try {
			student = mapper.readValue(json, Student.class);
			System.out.println(student);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

	}
}
