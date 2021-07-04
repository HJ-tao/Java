package day01;

/**
 * 文档注释只定义在三个地方:
 * 类,常量,方法上
 * 
 * 在类上定义文档注释是用来说明这个类的设计以及其解决的问题等相关描述信息.
 * 
 * @author Hash
 * @version 1.0 21/08/17
 * @see java.lang.String
 * @since JDK1.0
 */

public class APIDocDemo {
	/**
	 * sayHello方法中的问候语
	 */
	public static final String INFO = "Nihao!";
	
	/**
	 * 给给定的用户添加一个问候语
	 * @param abc 给定的用户名
	 * @param b
	 * @return 返回含有问候语的字符字符串
	 */
	public String sayHeool(String abc,int b){
		return "你好？"+abc;
	}
}
