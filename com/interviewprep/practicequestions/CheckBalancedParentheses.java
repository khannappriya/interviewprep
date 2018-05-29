package com.interviewprep.practicequestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class CheckBalancedParentheses {

	public static boolean checkBalancedParentheses(String sInputString) {

		// first define hashmap and add key-values association for all 3 bracket
		// types

		Stack<String> sStack = new Stack<String>();
		HashMap<String, String> hm = new HashMap<String, String>();
		//boolean outputMessage = false;
		hm.put("{", "}");
		hm.put("(", ")");
		hm.put("[", "]");

		// Get a set of the entries
		Set set = hm.entrySet();

		/*
		 * // display key, value of hashmap for testing purpose only for
		 * (Map.Entry<String, String> entry : hm.entrySet()) {
		 * System.out.println(entry.getKey() + " : " + entry.getValue()); }
		 * 
		 */

		// for loop that iterates over given string input
		// condition check of each bracket using stack
		
		//System.out.println("before FOR loop");

		for (int i = 0; i <= sInputString.length() - 1; i++) {
			
			//System.out.println("inside FOR loop");

			if (hm.containsKey(sInputString.valueOf(sInputString.charAt(i)))) {
				sStack.add(sInputString.valueOf(sInputString.charAt(i)));
				//System.out.println("Stack created");
			}

			if (hm.containsValue(sInputString.valueOf(sInputString.charAt(i)))) {
				
				//System.out.println("Values Compare Block");
				String stackPeek = sStack.peek();

				//if((sInputString.valueOf(sInputString.charAt(i)).contains(hm.get(sStack.peek())))){
				//	outputMessage = true;
				//}
				
				if (hm.get(sStack.peek()).equals((sInputString.valueOf(sInputString.charAt(i))))) {
					
					sStack.pop();

					//outputMessage = true;
					//System.out.println("output message is true");
					
				} 
			else {
				return false;	
				//outputMessage = false;
					//System.out.println("output message is false");

				}

			}
		}

		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// call function

		String sExampleString = "[({})]";
		boolean functionOutput = checkBalancedParentheses(sExampleString);

		if (functionOutput == true) {
			System.out.print("Given input string has balanced parentheses");
		} else {
			System.out.print("Given input string DOES NOT has balanced parentheses");
		}

	}

}
