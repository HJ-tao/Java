package edu.cj.javase.day0711.work;

import java.util.Scanner;

public class NewTest {
     public static void main(String[] args) {
		NewStudent stu = new NewStudent();
		NewCalculator cal = new NewCalculator();
		stu.stuName = "张三";
		stu.schoolName = "长江大学";
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag){
			//此时的cal为对应的NewCalculator的一个对象,即实参为NewCalculator对象
			stu.useCalculator(cal);
			System.out.print("是否继续运算? true or false!!");
			flag = sc.nextBoolean();
		}
		System.out.println("欢迎下次继续使用!bye！！");
	}
}
