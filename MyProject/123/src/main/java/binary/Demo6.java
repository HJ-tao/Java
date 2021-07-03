package binary;

import org.apache.commons.lang.StringUtils;

/**
 * 补码是一个算法:
 * 1.实现了计算机能够处理负数(有符号数)功能
 *   --将高位为1的数作为负数使用,正好是一半作为负数使用
 * 2.Java利用parseInt和toString实现了2进制补码和10进制之间的转换
 * 3.补码是计算机底层处理负数的算法.
 * 
 * 一个整数溢出是负数.(错误)
 * 最大值加1是最小值!
 * 
 * 补码互补对称公式: -n = ~n+1;(对于最小值不适用)
 * 
 * @author soft01
 *
 */
public class Demo6 {
	public static void main(String[] args) {
		int i =-1;
		System.out.println(Integer.toBinaryString(i));
		
		long l = -1L;
		System.out.println(Long.toBinaryString(l));
		
		for(int j=-50;j<=50;j++){
			String bin = Integer.toBinaryString(j);
			String str = StringUtils.leftPad(bin, 32, "0");
			System.out.println(str);
		}
		
		System.out.println(~100+1);//"~"表示反码
		System.out.println(~-100+1);
		System.out.println(~-100);
		int n = 0xffffffff;
		System.out.println(n);
	}
}
