package day02;

import java.util.Scanner;

public class Game3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int truth = 0,rids = 0;
		System.out.println("有加法运算器程序，其规则为：\n程序依次出10道加法题目，由用户输入题目的答案。用户每答完一道题，由系统提示结果：答错了或者答对了。10 道题目答完之后，系统\n计算得分并输出。如果用户希望提前结束，则可以输入－1提前退出。");
		for (int i = 0; i < 10; i++) {
			int a = (int)(Math.random()*100+1);
			int b = (int)(Math.random()*100+1);
			System.out.print("第"+(i+1)+"题："+a+"+"+b+"=");
			int result = sc.nextInt();
			if(result == -1){
				System.out.print("欢迎下次继续.");
				break;
			}else if(result == a+b){
				System.out.println("正确！");
				truth++;
			}else{
				System.out.println("错误！");
				rids++;
			}
			
		}
		System.out.println("正确："+truth+"\t错误："+rids);
		System.out.println("游戏结束.");
		sc.close();
	}

}
