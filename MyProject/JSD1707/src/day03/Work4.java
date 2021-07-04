package day03;

import java.util.Scanner;

public class Work4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = sc.nextInt();
		System.out.println("请输入月份：");
		int month = sc.nextInt();
		int day = 0;
		boolean flag = (year%4==0&&year%100!=0||year%400==0);
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		default:
			System.out.println("输入错误!");
		}
		if(flag&&month==2){
			day++;
		}
		System.out.println(year+"年"+month+"月有"+day+"天");
	}

}
