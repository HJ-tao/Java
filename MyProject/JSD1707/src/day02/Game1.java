package day02;

import java.util.Scanner;

public class Game1 {

	public static char[] rand(int num){
		char []numbers = new char[num];
		String src = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < num; i++) {
			numbers[i] = src.charAt((int)(Math.random()*src.length()));
		}
		return numbers;
	}
	
	public static int IsAllRight(char []number,String g){
		int a = 0;
		for(int i=0;i<number.length;i++){
			String t1 = number[i]+"";
			String t2 = g.charAt(i)+"";
			if(t1.equalsIgnoreCase(t2)){
				a++;
			}
		}
		return a;
	}
	
	public static int IsPartRight(char []number,String g){
		int b = 0;
		char []m = g.toCharArray();
		for(int i = 0;i<number.length;i++){
			for(int j=0;j<m.length;j++){
				if(number[i]==m[j]){
					b++;
					break;
				}
			}
		}
		return b;
	}
	
	
	public static void main(String[] args) {
		char []num = rand(4);
		System.out.println(num);
		int corrR = 0,partR = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入猜测的四个字母：");
		for(int i=0;i<3;i++){
			System.out.println("--------------第"+(i+1)+"次----------------");
			String guess = sc.next();
			while(guess.length() < 4){
				System.out.println("需要输入四个字母，请添加字母");
				guess += sc.next();
			}
			corrR = IsAllRight(num,guess);
			partR = IsPartRight(num,guess);
			System.out.println("完全正确："+corrR+"\t部分正确："+(partR-corrR));
			if(corrR==4){
				System.out.println("恭喜你，猜对了！");
				break;
			}
		}
		System.out.println("游戏结束.");
		sc.close();
	}

}
