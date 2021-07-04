package day04;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		for (int i = 1; i <= 10; i++) {
			int a = (int)(Math.random()*100);
			int b = (int)(Math.random()*100);
			int result = a+b;
			System.out.println("("+i+")"+a+"+"+b+"=?");
			
			System.out.println("请输入答案：");
			int ans = sc.nextInt();
			
			if(ans == -1){
				System.out.println("您已经退出");
				break;
			}
			if(ans == result){
				score += 10;
				System.out.println("答对了");
			}else{
				System.out.println("答错了");
			}
		}
		System.out.println("总分为："+score);
		sc.close();
	}

}
