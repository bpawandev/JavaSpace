package com.core.reverse;

public class ReverseWordPrinter {
	public static void printReverse(String input) {
		String[] tokens = input.split(" ");

		for (int i = tokens.length - 1; i >= 0; i--) {
			System.out.println(tokens[i]);
		}
	}

	public static void main(String[] args) {
		printReverse("Hello Welcome to My World");
	}
}
