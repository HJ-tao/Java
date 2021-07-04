package binary;
/**
 * 二进制
 * "编程语言"利用算法(和稀泥)支持了10进制到2进制之间的转换.
 * 1.Integer.parseInt() 将10进制字符串转换为2进制整数
 * 2.Integer.toString() 将2进制整数转换为10进制字符串
 * 
 * 计算机内存中没有10进制整数
 * 
 * 大多数情况下10进制到2进制整数的转换会自动完成.
 * 
 * 如果需要手动将10进制转换为2进制整数时候,就有需要调用Integer.parseInt()
 * 
 * 
 * @author soft01
 *
 * 16进制
 * 
 * 16进制的根本用途:16进制用于简写2进制,其中将2进制每4位数简写为1位16进制数.
 * 
 * 16进制就是2进制!
 * 
 * 计算机内部没有16进制.
 */
public class Demo4 {

	public static void main(String[] args) {
		//16进制用于简写2进制数据
		int i = 0x28f16022;
		System.out.println(Integer.toBinaryString(i));
	}

}
