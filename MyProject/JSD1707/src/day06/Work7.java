package day06;

import java.util.Scanner;

public class Work7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("游戏开始(输入exit表示退出游戏).");
		int degree = 0;
		while(true){
			System.out.println("请输入游戏级别：");
			System.out.println("******1.高级(9个字母)******");
			System.out.println("******2.中级(7个字母)******");
			System.out.println("******3.低级(5个字母)******");
			System.out.println("**********exit************");
			String str1 = sc.next().trim(); 
			if(str1.equalsIgnoreCase("exit")){
				System.out.println("再见！");
				break;
			}
			degree = (int)Double.parseDouble(str1);
			if(degree==0||degree>3){
				System.out.println("输入错误！");
				continue;
			}
			char[] chs = generate(11-degree*2);
			System.out.println(chs);
			int count = 0;   //错误次数计数器
			while(true){
				System.out.println("请输入猜测的数据：");
				String str2 = sc.next().trim().toUpperCase();
				char[] input = str2.toCharArray();
				if(input.length!=chs.length){
					System.out.println("你输入的字母个数和等级不匹配,请重新输入.");
					break;
				}
				int[] result = check(chs,input);
				if(result[1]==chs.length){
					int score = 100*chs.length - count*10;
					System.out.println("恭喜你，答对了！得分为："+score);
					break;
				}else{
					count++;
					System.out.println("字符正确的个数为："+result[0]+",位置正确的个数为："+result[1]);
				}
			}
		}
	}
	
	public static char[] generate(int len){
		char[] chs = new char[len];
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] src = str.toCharArray();
		boolean[] flags = new boolean[src.length];
		for(int i=0;i<chs.length;i++){
			int index;
			do{
				index = (int)(Math.random()*src.length);
			}while(flags[index]);
			chs[i] = src[index];
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
