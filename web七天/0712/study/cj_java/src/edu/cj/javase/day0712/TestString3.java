package edu.cj.javase.day0712;

public class TestString3 {
    public static void main(String[] args) {
		String s = "hello world:)";
		String ss = new String("hello WorLd:)");
		/*
		 * ==与equals方法的区别
		 * ==比较的是地址是否相同
		 * equals方法比较的是内容是否相同
		 * equalsIgnoreCase方法在比较字符串内容是可以忽略字母的大小写
		 */
		System.out.println(s==ss); //true or false ??
		System.out.println(s.equals(ss));  //true or false ??
		System.out.println(s.equalsIgnoreCase(ss));  //true or false ??
		
	}
   
}
