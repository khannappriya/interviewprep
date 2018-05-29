package com.interviewprep.practicequestions;

import java.util.Scanner;
import java.util.Stack;

//Given a Stack, keep track of the maximum value in it. 
//The maximum value may be the top element of the stack, but once a new element is pushed or an element is pop from the stack, 
//the maximum element will be now from the rest of the elements.

public class ReturnCurrentMaximumElementInStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString;
		String spaceString = " ";
		Scanner scan = new Scanner(System.in);
		System.out.print("Please provide input string: ");

		inputString = scan.nextLine();

		System.out.println(inputString);

		Stack<Integer> stackInt = new Stack<Integer>();
		Stack<String> stackString = new Stack<String>();

		for (int i = 0; i <= inputString.length() - 1; i++) {
			stackString.add(inputString.valueOf(inputString.charAt(i)));

			if (stackString.contains(spaceString)) {
				stackString.removeElement(spaceString);
			}
		}

		
		if (stackString.isEmpty()) {
			System.out.println("Given Stack is currently Empty");
		} else {
			System.out.println("Your Stack String is: " + stackString);
		}

	}

}
