package edu.cj.javase.day0712;

public class TestString4 {
    public static void main(String[] args) {
		String s = "hello world:)";
		int leng = s.length(); //获取字符串的长度
		System.out.println(leng);
		/*
		 * 根据字符串数据中的索引(索引从0开始)
		 * 来获取到该索引位置上对应的字符
		 * charAt(int index),返回一个char类型的数据
		 * 
		 * 与charAt()方法互逆的方法:
		 *   indexOf(对应的字符)
		 *   lastIndexOf(从左往右数最后一次出现的字符)
		 *   对应的返回类型为int
		 */
		
		char ch = s.charAt(4);
		System.out.println("ch = "+ch);
		//互逆方法indexOf或者lastIndexOf方法的使用
		int lastIndex = s.lastIndexOf('o');
		System.out.println("lastIndex = "+lastIndex);
		
		int index = s.indexOf('o');
		System.out.println("index = "+index);
	}
   
    /*
     * 练习:
     *    1.通过键盘输入一个字符串,编程实现循环遍历得到该字符串中的每一个字符
     *    2.编写代码实现随机获取4位或者6位的验证码，验证码的源字符串为:
     *       String src = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789长江大学计科专业的宝宝们辛苦了";
     *      思路:
     *          获取随机数的两种方式  
     *             1.java.lang包中的 Math.random()，该方法得到的数据是一个[0.0,1.0)
     *             2.java.util包中的Random类中的nextInt(int seed)     [0,seed)
     *             
     *          通过charAt(int index)来获取   src中对应索引位置上的字符
     *          
     *          
     *          将得到的单个char字符拼接成String即可完成
     *          
     * 
     */
}
