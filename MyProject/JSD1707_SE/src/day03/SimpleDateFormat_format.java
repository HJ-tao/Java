package day03;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * ���Խ�Date��String֮�䰴��ָ�������ڸ�ʽ����ת��.
 * @author soft01
 *
 */
public class SimpleDateFormat_format {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
		System.out.println("��ǰʱ��:"+sdf.format(date));
	}

}
