package day06;

import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入金字塔的行数:");
		int line = sc.nextInt();
		for(int row=0;row<line;row++){
			for(int i=line-1-row;i>0;i--)
			{
				System.out.print(" ");
			}
			for(int i=1;i<=2*row+1;i++){
				System.out.print("*");
			}
			System.out.println();
		}
		//输出菱形
		/*for(int row=0;row<line-1;row++){
			for(int i=0;i<row+1;i++)
			{
				System.out.print(" ");
			}
			for(int i=0;i<=2*line-4-2*row;i++){
				System.out.print("*");
			}
			System.out.println();
		}*/
		
	}

}
