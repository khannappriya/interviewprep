package com.interviewprep.practicequestions;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckSmallestModDiffForTwoIntArrays {

	public static int CheckSmallestModDiffForTwoIntArrays(ArrayList<Integer> userIntArray1,
			ArrayList<Integer> userIntArray2) {


		int minimumDiff= Integer.MAX_VALUE;

		for (int i = 0; i <= userIntArray1.size() - 1; i++) {

			for (int j = 0; j <= userIntArray2.size() - 1; j++) {

				if((Math.abs(userIntArray1.get(i) - userIntArray2.get(j)))< minimumDiff) {
					
					minimumDiff=Math.abs(userIntArray1.get(i) - userIntArray2.get(j));

				}

			}
		}

		return minimumDiff;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner to take initial input from user
		Scanner inputForArray1 = new Scanner(System.in);
		System.out.print("Please provide input integers for Array1: ");

		ArrayList<Integer> userIntArray1 = new ArrayList<Integer>();
		while (inputForArray1.hasNextInt()) {
			userIntArray1.add(inputForArray1.nextInt());
		}

		Scanner inputForArray2 = new Scanner(System.in);
		System.out.print("Please provide input integers for Array2: ");

		// Declare ArrayList to store integer array provided by user

		ArrayList<Integer> userIntArray2 = new ArrayList<Integer>();

		while (inputForArray2.hasNextInt()) {
			userIntArray2.add(inputForArray2.nextInt());
		}
		System.out.println(userIntArray1);
		System.out.println(userIntArray2);

		int messageToUser;
		messageToUser= CheckSmallestModDiffForTwoIntArrays(userIntArray1, userIntArray2);
		
		System.out.print("Smallest Absolute Difference between the given int arrays is: "+messageToUser);

	}

}
