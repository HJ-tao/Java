package edu.cj.javase.day0711.work;

import java.util.Scanner;

public class NewTest {
     public static void main(String[] args) {
		NewStudent stu = new NewStudent();
		NewCalculator cal = new NewCalculator();
		stu.stuName = "����";
		stu.schoolName = "������ѧ";
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag){
			//��ʱ��calΪ��Ӧ��NewCalculator��һ������,��ʵ��ΪNewCalculator����
			stu.useCalculator(cal);
			System.out.print("�Ƿ��������? true or false!!");
			flag = sc.nextBoolean();
		}
		System.out.println("��ӭ�´μ���ʹ��!bye����");
	}
}
