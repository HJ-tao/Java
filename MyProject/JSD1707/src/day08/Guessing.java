package day08;

import java.util.Scanner;

public class Guessing {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("游戏开始.(exit表示退出游戏)"); 
		char[] chs = generate();    //通过调用方法产生随机字符数组
		int count = 0;            //计数器，计算失败的次数
		while(true){
			System.out.println("请输入猜测字符：");
			String str = sc.next().trim().toUpperCase();  //将输入的字符串去除前后空格，并且统一转为全大写字母
			if(str.equals("EXIT")){                 //输入如果为exit，则退出循环
				System.out.println("后会有期.");
				break;
			}
			char[] input = str.toCharArray();    //将字符串转换为字符数组
			int[] result = check(chs,input);     //调用方法判断猜测字符与源字符的匹配度
			if(result[1]==chs.length){            //猜测正确
				int score = 100*chs.length-count*10;     //定义并计算分数
				System.out.println("恭喜你！你的分数为："+score); 
				break;
			}else{
				count++;    //错误次数加1
				System.out.println("字符正确个数为："+result[0]+",位置正确个数为："+result[1]);
			}
		}
	}

	public static char[] generate(){
		char[] chs = new char[5];
		boolean[] flags = new boolean[100];    //定义开关数组
		for(int i=0;i<chs.length;i++){
			int index;//定义下标
			do{
				index = (int)(Math.random()*26+65);  //产生65到91之间的整数
			}while(flags[index]);      //判断随机整数是否重复
			chs[i] = (char)index;    //整数直接转为char数组，然后赋值
			flags[index] = true;	  //将该下标对应的开关改为开启状态
		}
		return chs;
	}


	public static int[] check(char[] chs,char[] input){
		int[] result = new int[2];   //定义数组存储得到的数据，result[0]:字符正确，result[1]:位置正确
		for(int i=0;i<chs.length;i++){        
			for(int j=0;j<input.length;j++){
				if(chs[i]==input[j]){    //判断字符是否相同
					result[0]++;  
					if(i==j){             //判断下标(即位置)是否相同
						result[1]++;
					}
					break;
				}
			}	
		}
		return result;
	}

	
//	public static char[] generate(int len){
//		char[] chs = new char[len];
//		boolean[] flags = new boolean[100];
//		for(int i=0;i<chs.length;i++){
//			int index;
//			do{
//				index = (int)(Math.random()*26+65);
//			}while(flags[index]);
//			chs[i] = (char)index;
//			flags[index] = true;
//		}
//		return chs;
//	}
//	
//	public static int[] check(char[] chs,char[] input){
//		int[] result = new int[2];//result[0]用来存放字符对的个数，result[1]用来存放位置对的个数.
//		for(int i=0;i<chs.length;i++){
//			for(int j=0;j<input.length;j++){
//				if(input[j]==chs[i]){
//					result[0]++;
//					if(i==j){
//						result[1]++;
//					}
//					break;
//				}
//			}
//		}
//		return result;
//	}
//	
//	
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		System.out.println("游戏开始(输入exit退出游戏)：");
//		char[] chs = generate(5);   //添加了参数
//		int count = 0;//计算错误次数
//		while(true){
//			System.out.print("请输入猜测的字符：");
//			String guess = sc.next().trim().toUpperCase();
//			char[] input = guess.toCharArray();
//			int[] result = check(chs,input);
//			if(result[1]==5){
//				int score = 100*chs.length - count*10;
//				System.out.println("恭喜你，猜对了!得分为："+score);
//				break;
//			}else{
//				count++;
//				System.out.println("正确的字符个数："+result[0]+"\n位置正确的个数为："+result[1]);
//			}
//		}
//	}
	
	
    //基本类型判断相等,使用==
	//引用类型判断相等,使用equals
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] chs = generate();  //获取随机字符数组
		int count = 0;  //猜错的次数
		System.out.println("游戏开始-->");
		while(true){   //自造死循环
			System.out.print("请输入猜测的字符：");
			String str = sc.next().toUpperCase();
			if(str.equals("EXIT")){
				System.out.println("再见！");
				break;
			}
			char[] input = str.toCharArray(); //将字符串转换为字符数组类型
			int[] result = check(chs,input);  //对比：字符位置正确输出分数并跳出循环，否则输出提示
			if(result[0]==5){
				int score = 100*chs.length-count*10;
				System.out.println("恭喜你，猜对了!得分为："+score);
				break;
			}else{
				count++;
				System.out.println("字符正确的个数为："+result[1]+",字符位置正确的个数为："+result[0]);
			}
		}
	}
	
	
	public static char[] generate(){
		char[] chs = new char[5];
		char[] src = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
				'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		boolean[] flags = new boolean[src.length];  //开关数组默认为false
		for(int i=0;i<chs.length;i++){
			int index;
			do{
				index = (int)(Math.random()*src.length);
			}while(flags[index]);  //判断index是否重复
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
					result[1]++;      //字符正确
					if(i==j){
						result[0]++;  //位置正确
					}
					break;
				}
			}
		}
		return result;
	}*/
	
	

}
