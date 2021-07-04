package day03;

import java.util.Scanner;

public class Work2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请依次输入三个整数a，b，c（以空格隔开）：");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int t = 0;
		System.out.println("您输入的是：\na="+a+",b="+b+",c="+c);// 34 75 65
		if(a>b){
			t = a; 
			a = b;
			b = t;
		}
		if(a>c){
			t = a;
			a = c;
			c = t;
		}
		if(b>c){
			t = b;
			b = c;
			c = t;
		}
		System.out.println("升序排列后，结果为：\na="+a+",b="+b+",c="+c);
	}
}
