package edu.cj.javase.day0710.work;

import java.util.Scanner;

public class Work8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[]nums = {8,4,2,1,23,344,12};
		Scanner sc = new Scanner(System.in);
		String ans = "yes";
		boolean flag = false; //假定未找到对应的数字
		while("yes".equals(ans)){
		System.out.print("请输入您要查找的数据:");
		int findNum = sc.nextInt();
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == findNum) {
				//System.out.println("找到了");
				flag = true;
				break;
			} /*else {
				//System.out.println("没找到");
			}*/
		}
		if (flag) {
			System.out.println("找到了");
		} else {
			System.out.println("没找到");
		}
		System.out.print("您还要继续查找吗? yes or no ");
		   ans = sc.next();		
		}
		System.out.println("欢迎下次继续使用哦!");
	}

}
