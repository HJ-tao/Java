package edu.cj.javase.day0710.work;

import java.util.Arrays;

public class Work7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[]nums = new int[20];
		int i = 0;
		while (i<nums.length)
		{
			if (i<2) {
				nums[i] = 1;
			} else {
                nums[i] = nums[i-1]+nums[i-2];
			}
			i++;
		}
		//输出数组中的元素
		System.out.println(Arrays.toString(nums));
		for (int j = 0; j < nums.length; j++) {
			System.out.print(nums[j]+" ");
		}

	}

}
