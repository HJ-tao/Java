package edu.cj.javase.day0712;

public class TestString7 {
    public static void main(String[] args) {
		
		/*
		 * 根据字符串数据中的索引(索引从0开始)
		 * 来获取到该索引位置上对应的字符
		 * charAt(int index),返回一个char类型的数据
		 * 
		 * 与charAt()方法互逆的方法:
		 *   indexOf(对应的字符)
		 *   lastIndexOf(从左往右数最后一次出现的字符)
		 *   对应的返回类型为int,如果没找到对应的字符那么返回结果为-1
		 *   
		 *   
		 *   截取子字符串的方法:
		 *      substring(int beginIndex):从开始指定的索引位置开始截取子字符串一直到最后一个字符
		 *      截取的子字符串的长度为 当前字符串.length()-beginIndex
		 *       如:  String s = "hello world!"
		 *          String ss = s.substring(2) 子字符串的长度为 s.length()-2
		 *          ss的内容为 llo world!
		 *      substring(int beginIndex,int endIndex):从开始指定的索引位置开始截取子字符串一直到endIndex
		 *      截取的子字符串的长度为 endIndex-beginIndex ,对应的子字符串不包括endIndex索引所对应的字符   
		 *      
		 *      
		 *      分割字符串的方法  split()
		 *      用于将字符串按照某个对应的字符进行分割,返回一个字符串数组
		 *      
		 *      toLowerCase()__转小写
		 *      toUpperCase————转大写
		 *      concat()——字符串连接方法  等同于 "+"连接符
		 *      
		 */
    	String s = "hello";
    	s = s.toUpperCase();
    	System.out.println(s); //HELLO?
    	
    	//s = s.concat(" world");
    	s+=" world";
    	System.out.println(s);
		
    }
}
