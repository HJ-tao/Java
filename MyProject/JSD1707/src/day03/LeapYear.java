package day03;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入年份：");		
		int year = sc.nextInt();
		boolean flag = year%4==0 && year%100!=0 ||year%400==0;
		if(flag){
			System.out.println(year+"是闰年");
		}else{
			System.out.println(year+"是平年");
		}
		
		sc.close();
	}	
}
