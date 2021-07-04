package edu.cj.javase.day0712;

import java.util.Scanner;

public class TestString2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个整数:");
		int digit = sc.nextInt();
		TestString2 ts = new TestString2();
		int result = ts.jieChen(digit);
		System.out.println(result);
	}
    public int jieChen(int num){
    	System.out.print(num+"! = ");
    	int result = 1;
    	String s = "";
    	for (; num > 0; num--) {
			s+=num+"*";
    		result*=num;
		}
    	System.out.print(s.substring(0,s.length()-1)+" = ");
    	return result;
    }
}
