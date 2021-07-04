package edu.cj.javase.day0711.work;

import java.util.Scanner;

public class Test {
     public static void main(String[] args) {
		Student stu = new Student();
		stu.stuName = "张三";
		stu.schoolName = "长江大学";
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag){
			stu.useCalculator();
			System.out.print("是否继续运算? true or false!!");
			flag = sc.nextBoolean();
		}
		System.out.println("欢迎下次继续使用!bye！！");
	}
}
