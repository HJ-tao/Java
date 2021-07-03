package day04;

import java.util.Scanner;

public class Work2 {

	public static void main(String[] args) {
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入整数（例如10）：");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			sum += 1.0/i;
		}
		System.out.println("sum="+sum);
		sc.close();
	}

}
