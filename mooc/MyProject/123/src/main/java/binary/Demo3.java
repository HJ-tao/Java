package binary;
/**
 * 10����
 * ��10��1
 * ����:0 1 2 3 4 5 6 7 8 9 
 * Ȩ:10000 1000 100 10 1
 * ����:10
 * 
 * 2����
 * ��2��1
 * ����:0 1
 * Ȩ:128 64 32 16 8 4 2 1
 * ����:2
 */
import org.apache.commons.lang.StringUtils;

public class Demo3 {

	public static void main(String[] args) {
		/*
		 * ���0��50ʵ�ʵĴ洢���:
		 */
		for(int i=0;i<50;i++){
			String bin = Integer.toBinaryString(i);
			String s = StringUtils.leftPad(bin, 32, "0");//�Ҷ���
			System.out.println(s);
		}
	}

}
