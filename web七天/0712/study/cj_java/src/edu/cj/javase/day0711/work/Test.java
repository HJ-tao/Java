package edu.cj.javase.day0711.work;

import java.util.Scanner;

public class Test {
     public static void main(String[] args) {
		Student stu = new Student();
		stu.stuName = "����";
		stu.schoolName = "������ѧ";
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag){
			stu.useCalculator();
			System.out.print("�Ƿ��������? true or false!!");
			flag = sc.nextBoolean();
		}
		System.out.println("��ӭ�´μ���ʹ��!bye����");
	}
}
