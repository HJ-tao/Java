package edu.cj.javase.day0710.work;

import java.util.Scanner;

public class Work1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���������������:");
		double weight = sc.nextDouble();
		double costMoney = 0;
		if (weight<=50) {
			costMoney = 0.15*weight;
		} else {
			costMoney = 0.15*50+0.22*(weight-50);
		}
        System.out.printf("���������Ϊ%.2f����,��֧���˷ѣ�%.2fԪ\n",weight,costMoney);
        System.out.println("���������Ϊ"+weight+"����,��֧���˷ѣ�"+costMoney+"Ԫ");
        sc.close();
	}

}
