package day03;

import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请依次输入两个整数a，b（以空格隔开）：");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b){
			System.out.println("最大值为"+a);
		}else{
			System.out.println("最大值为"+b);
		}
	}
}
