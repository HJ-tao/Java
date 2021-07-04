package date.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Calendar抽象类的常用实现类：GregorianCalendar即阳历
 * static Calendar getInstance()
 * 该方法可以获取该系统所在地区适用的历法实现类，大部分地区都是GregorianCalendar;
 * 
 * Calendar的方法：
 *   Date getTime()//直接返回Date类型的日期
 *   void setTime(Date date)//将Date类型转为Calendar类型
 *   int get(int field)//获取单独时间分量的值
 *   int getActualMaximum(int field)//返回时间分量的最大值
 *
 */
public class CalendarDemo1 {

	public static void main(String[] args) throws ParseException {
		Calendar c = Calendar.getInstance();
		//System.out.println(c);//GregorianCalendar的toString信息很多，但不能直观反映出日期
		
		Date date = c.getTime();
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
		System.out.println(date);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		/*
		 * 关于天的时间分量有：
		 * DAY_OF_MONTH:月中的天;
		 * DAY_OF_WEEK:周中的天(一周中的第几天,周日为1,依次后推);
		 * DAY_OF_YEAR:年中的天;
		 * DATE:月中的天,与DAY_OF_MONTH一致
		 */
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"-"+month+"-"+day);
		
		
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println(hour+":"+minute+":"+second);
		
		int days = c.get(Calendar.DAY_OF_YEAR);
		System.out.println("今天是今年的第"+days+"天");
		
		int week = c.get(Calendar.DAY_OF_WEEK);//1表示周日
		String[] data = {"日","一","二","三","四","五","六"};
		System.out.println("今天是星期"+data[week-1]);
		
		days = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("今年一共"+days+"天.");
		
		days = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("本月一共"+days+"天.");
		
	}
}

