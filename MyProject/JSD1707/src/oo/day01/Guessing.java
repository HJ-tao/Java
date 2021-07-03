package oo.day01;

import java.util.Scanner;

public class Guessing {

	public static void main(String[] args) {
		System.out.println("猜字母游戏开始.");
		Scanner sc = new Scanner(System.in);
		char[] chs = generate();
		int count = 0;
		while(true){
			System.out.print("请输入猜测的字符:");
			String str = sc.next().trim().toUpperCase();
			if("EXIT".equals(str)){
				System.out.println("你已经退出.");
				break;
			}
			char[] input = str.toCharArray();
			int[] result = check(chs,input);
			if(result[1]==5){
				int score = 100*chs.length - 10*count;
				System.out.println("Congradulation!Your score:"+score);
				break;
			}else{
				count++;
				System.out.println("字符正确个数："+result[0]+"，位置正确个数："+result[1]);
			}
		}
	}
	
	public static char[] generate(){
		char[] chs = new char[5];
		boolean[] flags = new boolean[100];
		for(int i=0;i<chs.length;i++){
			int index;
			do{
				index = (int)(Math.random()*26+65);
			}while(flags[index]);
			chs[i] = (char)index;
			flags[index] = true;
		}
		return chs;
	}

	public static int[] check(char[] chs,char[] input){
		int[] result = new int[2];
		for(int i=0;i<chs.length;i++){
			for(int j=0;j<input.length;j++){
				if(chs[i]==input[j]){
					result[0]++;
					if(i==j){
						result[1]++;
					}
					break;
				}
			}
		}
		return result;
	}
}
