package binary;

import org.apache.commons.lang.StringUtils;

public class Demo2 {
	public static void main(String[] args) {
		String str="12";
		//��str���������ַ�0,����Ժ��ܵĳ�����10���ַ�
		//0000000012
		String s = StringUtils.leftPad(str, 10, "0");
		System.out.println(s);
		
		str = "123";
		s = StringUtils.leftPad(str, 10,"0");
		System.out.println(s);
	}
}
