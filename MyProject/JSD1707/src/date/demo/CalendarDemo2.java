package date.demo;
/**
 * int set(int field,int value)
 * 对指定时间分量进行设置值操作
 * void add(int field,int value)
 * 对指定时间分量累加相应的值，若为负数，则为减去.
 * 
 */

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CalendarDemo2 {

	public static void main(String[] args) throws ParseException {
		/*String str = "2014-05-13 13:13:13";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date old = sdf.parse(str);
		System.out.println(old);*/
		
		
		//以上代码等同与：
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2014);
		calendar.set(Calendar.MONTH, 04);
		calendar.set(Calendar.DAY_OF_MONTH, 13);
		calendar.set(Calendar.HOUR, 13);
//		calendar.set(Calendar.DAY_OF_WEEK, 3);
		calendar.set(Calendar.MINUTE, 13);
		calendar.set(Calendar.SECOND, 13);
		System.out.println(calendar.getTime());
		
		//加上年
		calendar.add(Calendar.YEAR, 3);
		System.out.println(calendar.getTime());
		
		//加上月
		calendar.add(Calendar.MONTH, 2);
		System.out.println(calendar.getTime());
		
		//加上日
		calendar.add(Calendar.DAY_OF_MONTH, 5);
		calendar.set(Calendar.DAY_OF_WEEK, 6);
		System.out.println(calendar.getTime());
	}

}
