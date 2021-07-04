package edu.cj.javase.day0710.work;

import java.util.Scanner;

public class Work1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入行李的重量:");
		double weight = sc.nextDouble();
		double costMoney = 0;
		if (weight<=50) {
			costMoney = 0.15*weight;
		} else {
			costMoney = 0.15*50+0.22*(weight-50);
		}
        System.out.printf("行李的重量为%.2f公斤,请支付运费￥%.2f元\n",weight,costMoney);
        System.out.println("行李的重量为"+weight+"公斤,请支付运费￥"+costMoney+"元");
        sc.close();
	}

}
