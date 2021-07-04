package edu.cj.javase.day0710.work;

import java.util.Scanner;

public class Work2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入西瓜的重量:");
		double price = 0 ;  //对于局部变量在使用前一定要初始化
		double weight = sc.nextDouble();
		if (weight>=10) {
			price = 0.8;
		} else if(weight>=8) {
			price = 0.6;
		}else if(weight>=6) {
			price = 0.4;
		}else if(weight>=4) {
			price = 0.3;
		}else
			price = 0.15;
		double costMoney = price * weight;
		System.out.printf("西瓜的重量为%.2f斤,请支付%.2f元\n",weight,costMoney);
		System.out.println("顾客支付:");
		double payMoney = sc.nextDouble();
		System.out.printf("顾客支付￥%.2f元,找零￥%.2f\n",payMoney,(payMoney-costMoney));
		System.out.println("顾客支付￥"+payMoney+"元,找零￥"+(payMoney-costMoney)+"元");
	}

}
