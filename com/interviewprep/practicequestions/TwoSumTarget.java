package com.interviewprep.practicequestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSumTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		System.out.println("Two Sum result is: " + Arrays.toString(twoSum(nums, target)));
	}

	// Given an array of integers, return indices of the two numbers such that
	// they add up to a specific target.
	/**
	 * Given nums = [2, 4, 4, 3, 13, 11, 7, 5, 15], target = 8, Because nums[3]
	 * + nums[7] = 3 +5 = 8, return [3, 7].
	 */

	public static int[] twoSum(int[] nums, int target) {
		int[] outputArray = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i <= nums.length - 1; i++) {
			int complement= target - nums[i];
			if(map.containsKey(complement)){
				outputArray[0]=map.get(complement)+1;
				outputArray[1]=i+1;
				return outputArray;
			}
			map.put(nums[i], i);
		}
		return outputArray;
	}
}
