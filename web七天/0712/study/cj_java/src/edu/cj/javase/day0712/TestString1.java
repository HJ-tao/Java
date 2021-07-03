package edu.cj.javase.day0712;

import java.util.Scanner;

public class TestString1 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个整数:");
		int digit = sc.nextInt();
		TestString1 ts = new TestString1();
		int result = ts.jieChen(digit);
		System.out.println(result);
	}
    public int jieChen(int num){
    	System.out.print(num+"! = ");
    	int result = 1;
    	for (; num > 0; num--) {
			if(num!=1){
				System.out.print(num+"*");
			}else{
				System.out.print(num+" = ");
			}
    		result*=num;
		}
    	return result;
    }
}
