package day02;
/**
 * String֧��������ʽ������:
 * String[] split(String regex)
 * ����ǰ�ַ��������ݰ�������������ʽ�Ĳ��ֽ��в��,����ֺ�����ɶ��ַ���
 * ����һ������󷵻�
 * @author soft01
 *
 */
public class String_split {

	public static void main(String[] args) {
		String str = "alb12lala324lsjfl89";
		/*
		 * ���ڲ�ֵĹ����з�������ƥ���˲�ֲ���,��ô�����м���һ�����ַ���.
		 * ���������ַ���ĩβ����ƥ��,�����в�ֿ��ַ����ᱻ����.
		 */
		String[] ss = str.split("\\d");
		System.out.println(ss.length);
		for(int i=0;i<ss.length;i++){
			System.out.println(ss[i]);
		}
	}

}
