/**
 * 
 */
package com.interviewprep.practicequestions;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author pkhanna
 *
 */
public class PrintDayOfTheWeek {

	/**
	 * @param args
	 *            Input will be Monday; Output should be Day 2 Input will be
	 *            Sunday; Output should be Day 1 
	 *            Test Case: Handle Cases Sensitivity Input will be a string input
	 */

	public static String ReturnDayNumber(String thisString) {

		String outputString = "";

		// Creating HashMap to store key as name of day and value as day number
		HashMap<String, String> myHashMap = new HashMap<String, String>();
		myHashMap.put("sunday", "1");
		myHashMap.put("monday", "2");
		myHashMap.put("tuesday", "3");
		myHashMap.put("wednesday", "4");
		myHashMap.put("thursday", "5");
		myHashMap.put("friday", "6");
		myHashMap.put("saturday", "7");

		// Looking up HashMap for user's input string
		if (myHashMap.containsKey(thisString)) {
			// returning value for the user's input as key
			outputString = myHashMap.get(thisString);
			System.out.println("For given input, the Day number is: " + outputString);
		}
		else {
			System.out.println("Your given input is not any valid Week day");
		}
		return outputString;
	}

	public static void main(String[] args) {

		// Taking input from user and saving as type String
		Scanner input = new Scanner(System.in);
		System.out.println("Please provide input string: ");
		String inputString = input.nextLine();

		// Formatting input String to LowerCase
		String thisString = inputString.toLowerCase();

		// Calling ReturnDayNumber method and passing user input as parameter
		ReturnDayNumber(thisString);

	}

}
