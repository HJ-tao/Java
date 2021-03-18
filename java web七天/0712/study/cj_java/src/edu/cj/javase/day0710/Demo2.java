package edu.cj.javase.day0710;

public class Demo2 {

	/**
	 * java中的八种基本数据类型如下:
	 * 1.byte  字节型   -128~127 
	 * 2.char  字符型   占两个字节 可以用于存储一个汉字  用单引号 如 '男'
	 * 3.short 短整型
	 * 4.int   整型
	 * 5.long  长整型
	 * 6.float 单精度浮点型
	 * 7.double 双精度浮点型
	 * 8.boolean 布尔类型  用来存放 true or false 即真和假
	 * 
	 * 除了boolean类型不是数字外,其他的其中都是数字类型
	 * 
	 * 在java JDK5.0中工程师们新增了针对java中八种基本数据类型的引用(对象)类型————包装类、包裹类、装饰类
	 * 
	 * 基本数据类型			包装类or包裹类or装饰类		
	 * 
	 * 1.byte  				Byte
	 * 2.char               Character
	 * 3.short              Short
	 * 4.int                Integer
	 * 5.long               Long
	 * 6.float              Float
	 * 7.double             Double
	 * 8.boolean            Boolean
	 * 
	 * 包装类可以实现对基本数据类型、对象之间的转换，增强了数据的使用范围，除了引用属性还可以使用对应的方法,而基本数据类型只能
	 * 去调用对应变量的值
	 * 并且包装类还提供了丰富的方法，可以实现数据之间的相互转换
	 * 通常用到的方法如 parseXXX()
	 * XXX代表的是除了char之外的其他其中对应的数据的转换方法——————即可以将字符串数据通过parseXXX方法转换为基本数据类型
	 */
	public static void main(String[] args) {
		char sex = 'A';
		System.out.println((int)sex+"\n"+(sex+1));
		
		String s = "12345aaaa";
		int num1 ;
		try {
			num1 = Integer.parseInt(s);
			System.out.println(num1+1);
		} catch (NumberFormatException e) {
			System.out.println(s+"不是数字");
			//也可以手动的抛出此异常
			throw new RuntimeException(s+"不是数字");
		}
		

	}

}
