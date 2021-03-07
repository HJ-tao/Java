package day03;

import java.util.Scanner;

public class Cashier {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入单价（￥）：");
		double price = sc.nextDouble();
		System.out.print("请输入数量：");
		int number = sc.nextInt();
		System.out.print("支付金额（￥）：");
		double paid = sc.nextDouble();
		double totalPrice = price*number;
		double currentPrice = totalPrice>=500?totalPrice*0.8:totalPrice;
		if(currentPrice>paid){
			System.out.println("支付金额不足！缺￥"+(currentPrice-paid));
		}else{
			double dibs = paid - currentPrice;
			System.out.println("应支付￥"+currentPrice+"，找零￥"+dibs+"。");
		}
		sc.close();
	}
}
