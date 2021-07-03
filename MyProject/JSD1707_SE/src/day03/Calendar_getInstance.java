package day03;

import java.util.Date;
import java.util.Calendar;

/**
 * 日历类
 * 日历类用于操作时间
 * 常见实现类GregorianCalendar，即:阳历
 * 
 * Calendar提供了静态方法:getInstance用于获取一个当前系统所在地区使用的实现类,大部分地区返回的都是阳历历法实现类.
 * @author soft01
 *
 */
public class Calendar_getInstance {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		/*
		 * Calendar提供了方法:
		 * Date getTime()
		 * 该方法会返回一个Date对象,该对象所表示的日期
		 * 就是当前Calendar所表示的日期.
		 * 
		 * void setTime(Date date)
		 * 使用给定的Date来设置此Calendar表示的日期。
		 */
		Date date = calendar.getTime();
		System.out.println(date);
	}
}
