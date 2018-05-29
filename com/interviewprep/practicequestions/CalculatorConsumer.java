/**
 * 
 */
package com.interviewprep.practicequestions;

/**
 * @author pkhanna
 *
 */
public class CalculatorConsumer {

	public static void main(String[] args) {
		int i = 2;
		int j = 3;
		Calculator thisCal = new Calculator();
		int outputAdd = thisCal.addNumbers(i, j);
		System.out.println(outputAdd);
		int outputSubtract = thisCal.subtractNumbers(i, j);
		System.out.println(outputSubtract);

	}
}
