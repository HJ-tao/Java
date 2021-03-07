package day02;

import java.util.Scanner;

/**
 * 字符串支持正则表达式的相关方法之一
 * boolean matches(String regex)
 * 使用给定的正则表达式匹配当前字符串的格式是否满足该正则表达式要求,满足则返回true。
 * @author soft01
 *
 */
public class String_matches {

	public static void main(String[] args) {
		String regex = "^[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z]+)+$";
		System.out.println(regex);
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入邮箱地址:");
		String email = sc.nextLine();
		/*
		 * String提供的matches方法传入的正则表达式就算不加边界符(^$)也是
		 * 全匹配验证
		 */
		boolean ihh = email.matches(regex);
		if(ihh){
			System.out.println("匹配");
		}else{
			System.out.println("不匹配");
		}
		sc.close();
	}

}
