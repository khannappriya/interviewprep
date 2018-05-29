package com.interviewprep.practicequestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

//Find first non repeating character in a given string and display that character on console

//Given 2 arrays of size m & n, find the pair from diff array with minimum difference

public class CheckFirstNonRepeatingCharacter {

	public static String CheckFirstNonRepeatingCharacter(String inputString) {

		String outputString = "";
		int defaultValue = 1;

		/**
		 * LinkedHashMap is used to maintain the order in HashMap. We used
		 * LinkedHashMap so as to maintain the order of incoming characters of
		 * inputString and return the 1st non-repeating char
		 */

		// Create an object hashMapCheck of type LinkedHashMap
		LinkedHashMap<Character, Integer> hashMapCheck = new LinkedHashMap<Character, Integer>();
		// Set set = hashMapCheck.entrySet();

		// Loop the entire inputString
		for (int i = 0; i <= inputString.length() - 1; i++) {

			// Store/Replace/Update values as 0 for the repeating char keys of
			// inputString otherwise store value as 1 (defaultValue) for
			// the non-repeating char
			if (hashMapCheck.containsKey(inputString.charAt(i))) {
				hashMapCheck.replace(inputString.charAt(i), 0);
			} else {
				hashMapCheck.put(inputString.charAt(i), defaultValue);
			}

			// hashMapCheck.putIfAbsent(inputString.charAt(i), 1);

		}

		// Below for block is used to render data from HashMap
		// We use break to exit our for block as soon the first key with value=1 is found
		for (Entry<Character, Integer> entry : hashMapCheck.entrySet()) {

			if (entry.getValue().equals(1)) {
				outputString = entry.getKey().toString();
				// System.out.println(entry.getKey() + " : " +
				// entry.getValue());
				break;
			} else {
				outputString = "Your input does not have any non-repeating char";
			}
			// break;

		}
		return outputString;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scannerinput = new Scanner(System.in);
		System.out.println("Please provide input string: ");
		String userInputString = scannerinput.nextLine();

		System.out.println("You have entered string as: " + userInputString);

		String displayOutput = CheckFirstNonRepeatingCharacter(userInputString);

		System.out.println("For the given input string, the first non-repeating character is: " + displayOutput);
	}

}
