package day03;

import java.util.Calendar;

/**
 * void set(int field,int value)
 * ��ָ����ʱ���������ָ����ֵ
 * @author soft01
 *
 */
public class Calendar_set {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		/*
		 * ����Ϊ2008-08-08 20��08��08
		 */
		//������
		calendar.set(calendar.YEAR, 2008);
		calendar.set(Calendar.MONTH, Calendar.AUGUST);
		calendar.set(Calendar.DAY_OF_MONTH, 8);
		calendar.set(Calendar.HOUR_OF_DAY, 20);
		calendar.set(Calendar.MINUTE, 8);
		calendar.set(Calendar.SECOND, 8);
		
		System.out.println(calendar.getTime());
	}
}
