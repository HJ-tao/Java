package day03;

import java.util.Scanner;

public class Work5 {
	public static void main(String[] args) {
		int max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("请依次输入三个整数：a,b,c（以空格隔开）");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b){
			if(a>c){
				max = a;
			}else{
				max = c;
			}
		}else{
			if(b>c){
				max = b;
			}else{
				max = c;
			}
		}
		System.out.println("最大值为"+max);
	}
}
