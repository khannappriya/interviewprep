/**
 * 
 */
package com.interviewprep.practicequestions;

/**
 * @author pkhanna
 *
 */
public class Triangle {

	/**
	 * @param args
	 */

	public static int triangle(int n) {

		System.out.println("Entering n= " + n);
		if (n == 1) {
			System.out.println("Returning 1");
			return 1;
		} else {
			int temp = n + triangle(n - 1);
			System.out.println("Returning " + temp);
			return temp;
		}
	}

	public static void main(String[] args) {

		int answer = triangle(1);
		System.out.println("Final answer is: " + answer);
	}

}
