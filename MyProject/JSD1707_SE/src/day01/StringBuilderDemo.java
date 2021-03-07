package day01;
/**
 * java.lang.StringBuilder
 * 内部维护一个可变的字符数组,由于字符串的设计不利与频繁修改字符串内容(每次修改内容创建对象是很小号内存的),StringBuilder
 * 由于维护可变的字符数组,所以基于它修改字符串都是在一个字符数组进行的,所以内存开销小.频繁修改时的优势明显.
 * 
 * StringBuilder的设计目的就是为了解决修改字符串的问题,所以其提供了很多便于修改字符串内容的方法.
 * @author soft01
 *
 */
public class StringBuilderDemo {

	public static void main(String[] args) {
		String str = "好好学习java";
		StringBuilder sb = new StringBuilder(str);
		
		/*
		 * String append(String str)
		 * 将给定内容追加到当前字符串末尾等同于"+"的作用
		 */
		
	}

}
