package day03;

import java.text.ParseException;
import java.util.Calendar;

/**
 * �鿴�Լ�����������ĵڼ��죿
 * @author soft01
 *
 */
public class Test2 {
	public static void main(String[] args) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR,1992);
		calendar.set(Calendar.MONTH, 7);
		calendar.set(Calendar.DAY_OF_MONTH, 4);
		System.out.println(calendar.getTime());
		
		System.out.println("�Ǹ���ĵ�"+calendar.get(Calendar.DAY_OF_YEAR)+"��.");
		
		int week = calendar.get(Calendar.DAY_OF_WEEK)-1;
		String[] data = {"��","һ","��","��","��","��","��"};
		System.out.println("����������"+data[week]);
		/*
		 * ����ĳЩʱ�������ֵ���ܵ�������ʱ�����ֵ�ı仯
		 * ����:�������ܼ���,��Ӧ������Ҳ��ı�
		 */
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		System.out.println(calendar.getTime());
		/*
		 * ��������ʱ�������Ӧ��ֵ�����䷶Χ,Calendar���Զ���λ.
		 */
		calendar.set(Calendar.DAY_OF_MONTH, 32);
		System.out.println(calendar.getTime());
	}
}
