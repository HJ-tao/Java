package edu.cj.javase.day0712;

public class TestString5 {
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
		 */
		
		String s = "hello world!";
		String ss = s.substring(2);
		System.out.println(ss.length()+"\n"+ss);
		
		String sss = s.substring(2,8); //8-2 =6
		System.out.println(sss.length()+"\n"+sss);
		
		/*
		 * 从键盘输入一个文件名（名字.后缀名） 如:Hello.java
		 * 编写程序判断该文件是否为java文件
		 * 
		 */
		String file = "Hello.java";
		if(isJavaFile(file)){
			System.out.println(file+"是一个java源文件");
		}else{
			System.out.println(file+"不是一个java源文件");
		}
	}
   
    public static boolean isJavaFile(String fileName){
    	boolean isJava = false;
    	String subName = fileName.substring(fileName.lastIndexOf("."));
    	System.out.println(subName);
    	if (".java".equalsIgnoreCase(subName)) {
			isJava = true;
		}
    	return isJava;
    }
}
