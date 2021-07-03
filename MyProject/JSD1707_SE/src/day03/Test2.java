package day03;

import java.text.ParseException;
import java.util.Calendar;

/**
 * 查看自己生日是哪年的第几天？
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
		
		System.out.println("是该年的第"+calendar.get(Calendar.DAY_OF_YEAR)+"天.");
		
		int week = calendar.get(Calendar.DAY_OF_WEEK)-1;
		String[] data = {"日","一","二","三","四","五","六"};
		System.out.println("那天是星期"+data[week]);
		/*
		 * 设置某些时间分量的值可能导致其他时间分量值的变化
		 * 例如:设置了周几后,对应的日期也会改变
		 */
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		System.out.println(calendar.getTime());
		/*
		 * 可以设置时间分量对应的值超过其范围,Calendar会自动进位.
		 */
		calendar.set(Calendar.DAY_OF_MONTH, 32);
		System.out.println(calendar.getTime());
	}
}
