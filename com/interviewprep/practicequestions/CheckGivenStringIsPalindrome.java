package com.interviewprep.practicequestions;

import java.util.Scanner;

public class CheckGivenStringIsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputCheck;
		String inputCheckReverse;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please provide input string: ");
		
		inputCheck= scan.nextLine();
		
		System.out.println(inputCheck);
		
		StringBuilder sReverse = new StringBuilder();
		
		for(int i=inputCheck.length()-1;i>=0;i--)
		{
			sReverse.append(inputCheck.charAt(i));
		}
		
		System.out.println(sReverse);
		
		
		if(inputCheck.compareToIgnoreCase(sReverse.toString())==0)
		{
			System.out.println("Given string is a palindrome");
		}else
		{
			System.out.println("Given string is NOT a palindrome");
		}
		
	}

}
