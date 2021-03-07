package day02;
/**
 * String支持正则表达式方法三:
 * String replaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式的部分替换为给定的字符串
 * @author soft01
 *
 */
public class String_replaceAll {
	public static void main(String[] args) {
		String str = "abc123def234ghi";
		/*
		 * 将数字部分替换为:#NUMBER#
		 */
		str = str.replaceAll("\\d+", "#NUMBER#");
		System.out.println(str);
	}
}
