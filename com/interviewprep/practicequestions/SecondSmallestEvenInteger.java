package com.interviewprep.practicequestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// Write a function in java that returns the index of the second smallest even integer in an integer array
// Return the index if  even number is found, else return -1

//input integer array if has same number of even type integer, then return index of that first occurring number. eg. input=2, 2 then return= index(0)
// if input =2, 2, 2 then return= index(0)

//input will be all positive integers

//input eg. = 20, 30, 40, 50 then return= index of (30) 
// input int array can be dynamic and can be of any order (unsorted) 

// sorting time complexity is nlogn (it is higher than O(n))

public class SecondSmallestEvenInteger {

	public static void main(String[] args) {

		// Scanner to take initial input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Please provide input integer: ");

		// Declare ArrayList to store integer array provided by user
		ArrayList<Integer> intarray = new ArrayList<Integer>();
		ArrayList<Integer> evenarray = new ArrayList<Integer>();
		ArrayList<Integer> oddarray = new ArrayList<Integer>();
		int smallestEven;
		int secondSmallestEven = -1;
		while (input.hasNextInt()) {
			intarray.add(input.nextInt());
		}

		System.out.println(intarray);

		// call each element of ArrayList
		// System.out.println("Reach before for loop");
		for (int i = 0; i <= intarray.size() - 1; i++) // O(n)

		{
			// System.out.println("Reached inside for loop");
			if ((intarray.get(i)) % 2 == 0)

			{
				// System.out.println("Number is divisble by 2");
				// smallestEven=intarray.get(i);

				evenarray.add(intarray.get(i));
				// System.out.println("Even Int Array is: "+ evenarray);

			} else {
				oddarray.add(intarray.get(i));
				// System.out.println("Odd Int Array is: "+ oddarray);
				// System.out.println("Number is not divisible by 2");
			}

		}

		if(evenarray.isEmpty())
		{
			System.out.println("No even numbers provided");
			System.exit(0);         //Exits the code with the status code 0. To determine whether the program was successfully executed or if there was any anomaly.
		}
		
		
		Collections.sort(evenarray); // O(nlogn)
		
		
		if(evenarray.size()>=2)
		{
		secondSmallestEven = evenarray.get(1);
		}else
		{
			secondSmallestEven= evenarray.get(0);
		}

		System.out.println("Your second smallest integer is: " + secondSmallestEven);

		for (int j = 0; j <= intarray.size() - 1; j++) // O(n)
		{
			if (intarray.get(j) == secondSmallestEven) {
				System.out.println("Index of your second smallest integer is: " + j);
				break;
			}

		}

	}

}
