package edu.cj.javase.day0710.work;

import java.util.Scanner;

public class Work2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���������ϵ�����:");
		double price = 0 ;  //���ھֲ�������ʹ��ǰһ��Ҫ��ʼ��
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
		System.out.printf("���ϵ�����Ϊ%.2f��,��֧��%.2fԪ\n",weight,costMoney);
		System.out.println("�˿�֧��:");
		double payMoney = sc.nextDouble();
		System.out.printf("�˿�֧����%.2fԪ,���㣤%.2f\n",payMoney,(payMoney-costMoney));
		System.out.println("�˿�֧����"+payMoney+"Ԫ,���㣤"+(payMoney-costMoney)+"Ԫ");
	}

}
