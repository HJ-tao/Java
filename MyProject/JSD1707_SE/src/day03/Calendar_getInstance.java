package day03;

import java.util.Date;
import java.util.Calendar;

/**
 * ������
 * ���������ڲ���ʱ��
 * ����ʵ����GregorianCalendar����:����
 * 
 * Calendar�ṩ�˾�̬����:getInstance���ڻ�ȡһ����ǰϵͳ���ڵ���ʹ�õ�ʵ����,�󲿷ֵ������صĶ�����������ʵ����.
 * @author soft01
 *
 */
public class Calendar_getInstance {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		/*
		 * Calendar�ṩ�˷���:
		 * Date getTime()
		 * �÷����᷵��һ��Date����,�ö�������ʾ������
		 * ���ǵ�ǰCalendar����ʾ������.
		 * 
		 * void setTime(Date date)
		 * ʹ�ø�����Date�����ô�Calendar��ʾ�����ڡ�
		 */
		Date date = calendar.getTime();
		System.out.println(date);
	}
}
