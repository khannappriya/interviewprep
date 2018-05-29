package com.interviewprep.practicequestions;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class FindFirstElementOccuringOddTimes {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner to take initial input from user
		int MaxNumberOfOddOccurences;
		int i;
				Scanner input = new Scanner(System.in);
				System.out.print("Please provide input integer: ");
				
				// Declare ArrayList to store integer array provided by user
				ArrayList<Integer> intarray = new ArrayList<Integer>();
				
				while (input.hasNextInt()) {
					intarray.add(input.nextInt());
				}
				System.out.println(intarray);
				
				
				int sizeOfArray= intarray.size();
				System.out.println("Size of given array is: "+sizeOfArray);
				
				if (sizeOfArray % 2 ==0)
				{
					MaxNumberOfOddOccurences = sizeOfArray -1;
					System.out.println("Maximum Number of Odd Occurences is: "+MaxNumberOfOddOccurences);
				}

				else{
					MaxNumberOfOddOccurences = sizeOfArray;
					System.out.println("Maximum Number of Odd Occurences is: "+MaxNumberOfOddOccurences);
				}
				
				
				
				
				
				
	}

}
