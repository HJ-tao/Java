package binary;

import org.apache.commons.lang.StringUtils;

public class Demo2 {
	public static void main(String[] args) {
		String str="12";
		//在str的左侧填充字符0,填充以后总的长度是10个字符
		//0000000012
		String s = StringUtils.leftPad(str, 10, "0");
		System.out.println(s);
		
		str = "123";
		s = StringUtils.leftPad(str, 10,"0");
		System.out.println(s);
	}
}
