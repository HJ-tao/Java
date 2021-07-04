package day06;

import java.util.Scanner;

/**
 * String replaceAll(String regex,String replacement)
 * 将字符串中匹配正则表达式的部分替换为replacement
 * @author soft01
 *
 */
public class StringDemo4 {

	public static void main(String[] args) {
		String demo = "123lajl23ayur67665uoeuwo231";
		demo = demo.replaceAll("\\d+", "###");
		System.out.println(demo);
		String regex = "(zz|mmp|nmb|djb|mdzz|tmd|sb)";
		String words = "你这个zz,mmp,sb,就是djb";
		words = words.replaceAll(regex, "*");
		System.out.println(words);
		/*Scanner sc = new Scanner(System.in);
		System.out.println("请输入邮箱地址:");
		String mailName = sc.nextLine();
		if(mailName.matches("\\w+@\\w+(\\.[a-zA-Z]+)+"))
		{
			String[] names = mailName.split("(\\.|@)");
			System.out.println(names.length);
			System.out.println("你好,"+names[0]+",您使用的邮箱域名为"+names[1]);
		}else{
			System.out.println("邮箱格式有误，请重新输入.");
		}*/
		
	}

}
