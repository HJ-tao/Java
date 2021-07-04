package day02;

import java.util.Random;
import java.util.Scanner;

public class Game2 {

	public static void main(String[] args) {
		Random ra = new Random();
		int rand = ra.nextInt(1000)+1;
		int guess = 0,times = 0;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("-----------第"+(times+1)+"次-------------");
			System.out.println("请输入猜测的数据：");
			guess = sc.nextInt();
			if(guess==-1){
				System.out.println("游戏退出.");
				break;
			}
			if(guess>rand){
				System.out.println("大了.");
			}else if(guess<rand){
				System.out.println("小了.");
			}else{
				System.out.println("恭喜你，猜对了！正确答案即为："+rand);
				break;
			}
			if(times==9&&guess!=rand){
				System.out.println("很遗憾！正确答案为："+rand);
			}
			times++;
		}while(times < 10);
		System.out.println("游戏结束.");
		sc.close();
	}

		
		
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("数据范围1到1000之间，输入0表示退出");
		int rand = (int)(Math.random()*1000)+1;
		for (int i = 0; i < 10; i++) {
			System.out.println("-------------第"+(i+1)+"次----------------");
			System.out.print("请输入猜测数据：");
			int gues = sc.nextInt();
			if(gues == 0){
				System.out.println("欢迎下次继续！");
				break;
			}else if(gues>rand && i!=9){
				System.out.println("大了.");
			}else if(gues<rand && i!=9){
				System.out.println("小了.");
			}else if(gues==rand){
				System.out.println("恭喜你，猜对了！");
				break;
			}else if(i==9){
				System.out.println("很遗憾，正确答案为："+rand);
			}
		}
		System.out.println("游戏结束.");
		sc.close();
	}*/

}
