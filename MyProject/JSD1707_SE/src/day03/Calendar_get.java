package day03;

import java.util.Calendar;

public class Calendar_get {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//��ȡ��
		int year = calendar.get(Calendar.YEAR);
		//��ȡ��
		int month = calendar.get(Calendar.MONTH);
		/*
		 * ������صĳ���
		 * DATE:���е���,��DAY_OF_MONTHһ��
		 * DAY_OF_MONTH:���е���
		 * DAY_OF_WEEK:�����е���
		 * DAY_OF_YEAR:���е���
		 */
		int days = calendar.get(Calendar.DAY_OF_MONTH);
		int day = calendar.get(Calendar.DATE);
		System.out.println(year+"-"+month+"-"+day);
		
		int h = calendar.get(Calendar.HOUR_OF_DAY);
		int m = calendar.get(Calendar.MINUTE);
		int s = calendar.get(Calendar.SECOND);
		System.out.println(h+":"+m+":"+s);
		
		int ydays = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("�����ǽ���ĵ�"+ydays+"��");
		
		/*
		 * ��ȡָ��ʱ���������������ֵ
		 */
		int maxd = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("����һ����"+maxd+"��.");
		System.out.println("���껹ʣ"+(maxd-ydays)+"��.");
		
		int mdays= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("����һ����"+mdays+"��.");
		
	}
}
