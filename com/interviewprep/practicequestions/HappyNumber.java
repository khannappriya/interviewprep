package com.interviewprep.practicequestions;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HappyNumber testHappy = new HappyNumber();
		boolean output = testHappy.isHappy(24);
		System.out.print(output);
	}

	
	int digitSquareSum(int n) {
	    int sum = 0, tmp;
	    while (n>0) {
	        tmp = n % 10;
	        sum += tmp * tmp;
	        n /= 10;
	    }
	    return sum;
	}

	boolean isHappy(int n) {
	    int slow, fast;
	    slow = fast = n;
	    do {
	        slow = digitSquareSum(slow);
	        fast = digitSquareSum(fast);
	        fast = digitSquareSum(fast);
	    } while(slow != fast);
	    if (slow == 1) return true;
	    else return false;
	}
		
	}

