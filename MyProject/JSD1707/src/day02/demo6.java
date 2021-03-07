package day02;

import java.util.Scanner;

public class demo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入命令：\n1.显示全部记录；\n2.查询登录记录；\n0.退出；");
		int command = sc.nextInt(); 
		switch(command){
		   case 0:
		   {
			   System.out.println("---------------退出---------------");
			   System.out.println("欢迎下次使用！");
			   break;
		   }
		   case 1:
		   {
			   System.out.println("---------------显示全部记录-------------");
			   break;
		   }
		   case 2:
		   {
			   System.out.print("---------------查询登录记录--------------");
			   break;
		   }
		   default:
		   {
			   System.out.println("输入错误!");
		   }
		}
		sc.close();
	}

}
