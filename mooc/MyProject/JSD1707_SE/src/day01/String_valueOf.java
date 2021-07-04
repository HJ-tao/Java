package day01;

import java.util.Arrays;

/**
 * static String valueOf(XXX xxx)
 * 字符串提供了一组重载的valueOf方法,可以将java中不同类型的数据转换为字符串
 * 常见的是将基本类型转换为字符串
 * 
 * @author soft01
 *
 */
public class String_valueOf {

	public static void main(String[] args) {
		int d = 123;
		String str = String.valueOf(d);
		System.out.println(str);
		
		
		double dou = 123.123;
		String str2 = String.valueOf(dou);
		System.out.println(str2+4);
	}
	
}
