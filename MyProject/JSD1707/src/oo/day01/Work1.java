package oo.day01;

import java.util.Scanner;

public class Work1 {
	public static void main(String []args){
        Scanner sc = new Scanner(System.in);
		System.out.print("请输入任意四位整数:");
		int number = sc.nextInt();
		int result = addPass(number);
		System.out.print("加密之后的数字为："+result);
	}

   public static int addPass(int n){
		int times=1,temp = 0,news = 0;
		int[] newNum = new int[4];
		for(int i=0;i<4;i++){
		   temp = (n/times%10+5)%10;
	       newNum[i] = temp;
		   times *= 10;
		}
		for(int i=0;i<2;i++){
		   temp = newNum[i];
		   newNum[i] = newNum[3-i];
		   newNum[3-i] = temp;
		}
		times = 1;
		for(int i=0;i<4;i++){
		   news += newNum[i]*times;
		   times *= 10;
		}
		return news;
   }

}
