package com.interviewprep.practicequestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SecondSmallestEvenIntegerOptimized {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// Scanner to take initial input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Please provide input integer: ");

		// Declare ArrayList to store integer array provided by user
		ArrayList<Integer> intarray = new ArrayList<Integer>();
		//ArrayList<Integer> evenarray = new ArrayList<Integer>();
		//ArrayList<Integer> oddarray = new ArrayList<Integer>();
		int smallestEven;
		int secondSmallestEven;
		while (input.hasNextInt()) {
			intarray.add(input.nextInt());
		}

		// System.out.println(intarray);

		// call each element of ArrayList
		// System.out.println("Reach before for loop");
		smallestEven = intarray.get(0);
		secondSmallestEven = intarray.get(intarray.size() - 1);

		if (secondSmallestEven < smallestEven) {
			int temp = secondSmallestEven;
			secondSmallestEven = smallestEven;
			smallestEven = temp;
		}

		//System.out.println(smallestEven);
		//System.out.println(secondSmallestEven);
		
		for (int i = 0; i <= intarray.size() - 1; i++) // O(n)

		{
			if (intarray.get(i) % 2 == 0)
			{
				
				// Case-1
				if ((smallestEven % 2 == 0) && (secondSmallestEven % 2 == 0)) {
					if (intarray.get(i) < smallestEven) {
						secondSmallestEven = smallestEven;
						smallestEven = intarray.get(i);

					} else if (intarray.get(i) > smallestEven && intarray.get(i) < secondSmallestEven) {
						secondSmallestEven = intarray.get(i);
					}

				}

				// Case-2
				if ((smallestEven % 2 == 0) && (secondSmallestEven % 2 != 0)) {
					if (intarray.get(i) < smallestEven) {
						secondSmallestEven = smallestEven;
						smallestEven = intarray.get(i);

					} else if (intarray.get(i) > smallestEven && intarray.get(i) < secondSmallestEven) {
						secondSmallestEven = intarray.get(i);
					} else {
						secondSmallestEven = intarray.get(i);

					}

				}

				// Case-3
				if ((smallestEven % 2 != 0) && (secondSmallestEven % 2 == 0)) {
					if (intarray.get(i) < smallestEven) {
						smallestEven = intarray.get(i);

					} else if (intarray.get(i) > smallestEven && intarray.get(i) < secondSmallestEven) {
						smallestEven = intarray.get(i);
					} else {
						smallestEven = secondSmallestEven;
						secondSmallestEven = intarray.get(i);
					}

				}
				
				// Case-4 ODD ODD
				if((smallestEven % 2 != 0) && (secondSmallestEven % 2 != 0))
				{
					if (intarray.get(i) < smallestEven) 
					{
						secondSmallestEven=smallestEven;
						smallestEven = intarray.get(i);
					}
					
					else if (intarray.get(i) > smallestEven && intarray.get(i) < secondSmallestEven) 
					{
						secondSmallestEven = intarray.get(i);
					
				}
					else
					{
						secondSmallestEven = intarray.get(i);
					}
				}

		}

		

	}

		if (secondSmallestEven % 2 == 0)
		{
			System.out.println("Your second smallest integer is: " + secondSmallestEven);
			
		}else if(smallestEven % 2 == 0)
		{
			System.out.println("Your second smallest integer is: " + smallestEven);
			
		}else 
		{
			System.out.println("No even numbers found ");
		}
}
}
