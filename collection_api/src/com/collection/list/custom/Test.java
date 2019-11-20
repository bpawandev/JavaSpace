package com.collection.list.custom;

public class Test {
	public static void main(String[] args) {
		CustomArrayList<Integer> numbers = new CustomArrayList<>();
		numbers.add(10);
		numbers.add(4);
		numbers.add(5);
		numbers.add(20);
		numbers.add(15);
		numbers.add(null);
		
		// prints the arraylist data
		numbers.show();
		
		//prints the value at index 2
		System.out.println(numbers.get(2));
		
		numbers.remove(4);

		numbers.show();
		
	}
}
