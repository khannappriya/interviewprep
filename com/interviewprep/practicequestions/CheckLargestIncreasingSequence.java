package com.interviewprep.practicequestions;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

class CustomObject {
	int countTotal;
	String str;

	public CustomObject(String str, int countTotal) {

		this.countTotal = countTotal;
		this.str = str;
	}
}

public class CheckLargestIncreasingSequence {

	public static int CheckLargestIncreasingSequence(ArrayList<Integer> userIntArray) {

		StringBuilder appendString = new StringBuilder();
		LinkedHashSet<CustomObject> linkedHash = new LinkedHashSet<CustomObject>();

		for (int i = 0; i <= userIntArray.size() - 1; i++) {

			if (userIntArray.get(i) < userIntArray.get(i++)) {

				String functionString = appendString.append(userIntArray.get(i)).toString();

				int countOfMySequence = userIntArray.get(i);

				CustomObject obj = new CustomObject(functionString, countOfMySequence);

				linkedHash.add(obj);
				
				System.out.println(linkedHash);

			}

		}

		int outputSequence = 0;

		return outputSequence;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inputForArray = new Scanner(System.in);
		System.out.print("Please provide input integers for Array1: ");

		ArrayList<Integer> userIntArray = new ArrayList<Integer>();
		while (inputForArray.hasNextInt()) {
			userIntArray.add(inputForArray.nextInt());
		}

		// System.out.println(linkedHash);
		// System.out.println(userIntArray);

	}

}
