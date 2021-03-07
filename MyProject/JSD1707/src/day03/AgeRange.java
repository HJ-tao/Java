package day03;

import java.util.Scanner;

public class AgeRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入年龄：");		
		int age = sc.nextInt();
		System.out.println(age>=18 && age<=50);
		sc.close();
	}
}
