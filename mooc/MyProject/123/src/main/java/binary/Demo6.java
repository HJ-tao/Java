package binary;

import org.apache.commons.lang.StringUtils;

/**
 * ������һ���㷨:
 * 1.ʵ���˼�����ܹ�������(�з�����)����
 *   --����λΪ1������Ϊ����ʹ��,������һ����Ϊ����ʹ��
 * 2.Java����parseInt��toStringʵ����2���Ʋ����10����֮���ת��
 * 3.�����Ǽ�����ײ㴦�������㷨.
 * 
 * һ����������Ǹ���.(����)
 * ���ֵ��1����Сֵ!
 * 
 * ���뻥���Գƹ�ʽ: -n = ~n+1;(������Сֵ������)
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
		
		System.out.println(~100+1);//"~"��ʾ����
		System.out.println(~-100+1);
		System.out.println(~-100);
		int n = 0xffffffff;
		System.out.println(n);
	}
}
