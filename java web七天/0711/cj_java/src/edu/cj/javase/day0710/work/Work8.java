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
		boolean flag = false; //�ٶ�δ�ҵ���Ӧ������
		while("yes".equals(ans)){
		System.out.print("��������Ҫ���ҵ�����:");
		int findNum = sc.nextInt();
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == findNum) {
				//System.out.println("�ҵ���");
				flag = true;
				break;
			} /*else {
				//System.out.println("û�ҵ�");
			}*/
		}
		if (flag) {
			System.out.println("�ҵ���");
		} else {
			System.out.println("û�ҵ�");
		}
		System.out.print("����Ҫ����������? yes or no ");
		   ans = sc.next();		
		}
		System.out.println("��ӭ�´μ���ʹ��Ŷ!");
	}

}
