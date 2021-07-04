package day03;

import java.util.Scanner;

public class Work3 {

	public static void main(String[] args) {
		System.out.println("请输入你的工资的税前金额￥：");
		Scanner sc = new Scanner(System.in);
		double tax = 0;
		double money = sc.nextDouble();
		double amount = money - 3500;
		if(amount <= 0){
			tax = 0;
		}else if(amount<=1500){
			tax = amount*0.03;
		}else if(amount<=4500){
			tax = amount*0.1-105;
		}else if(amount<=9000){
			tax = amount*0.2-555;
		}else if(amount<=35000){
			tax = amount*0.25-1005;
		}else if(amount<=55000){
			tax = amount*0.3-2755;
		}else if(amount<=80000){
			tax = amount*0.35-5505;
		}else{
			tax = amount*0.45-13505;
		}
		System.out.println("你应该缴纳的个人所得税是:￥"+tax);
	}

}
