package oo.day02;

import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) {
		System.out.print("请输入斐波那契数列的某一项(从1开始):");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int result = feibo(number);
		System.out.println("得到的数f("+number+")="+result);
		double rate = (double)feibo(45)/feibo(46);
		System.out.println("f("+45+")与f("+46+")的比值为"+rate);
	}
	
	public static int fib(int n){
		 if(n!=1 && n!=2){
			 return fib(n-1)+fib(n-2);
		 }else{
			 return 1;
		 }
	}
	
	public static int feibo(int n){
		int[] temp = new int[n];
		if(n==1 || n==2){
			temp[0] = temp[1] = 1;
		}else{
			temp[0] = temp[1] = 1;
			for(int i=2;i<temp.length;i++){
				temp[i] = temp[i-1]+temp[i-2];
			}
		}
		return temp[n-1];
	}

}
