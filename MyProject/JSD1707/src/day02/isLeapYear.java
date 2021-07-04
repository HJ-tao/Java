package day02;  //声明包名

import java.util.Scanner;

public class isLeapYear {
//声明类
	public static void main(String[] args) {
		System.out.println("请输入年份：");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year%4==0 && year%400!= 0 || year%400==0){
			System.out.println("输入年份为闰年.");
		}else{
			System.out.println("输入年份为平年.");
		}
		sc.close();
	}
}
