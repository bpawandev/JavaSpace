package com.core.charcount;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {
	public static void charCount(String input) {
		Map<Character, Integer> charMap = new LinkedHashMap<>();
		char[] ch = input.toCharArray();
		for (char ch1 : ch) {
			if (ch1 == ' ') {
				continue;
			}
			if (charMap.containsKey(ch1)) {
				charMap.put(ch1, charMap.get(ch1) + 1);
			} else {
				charMap.put(ch1, 1);
			}

		}
		System.out.println(charMap);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		charCount(str);
		scanner.close();
	}
}
