package date.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println("当前时间为:"+date);
		long miliseconds = date.getTime();
		System.out.println("距离1970年的毫秒数为:"+miliseconds);
		
		miliseconds += 1000L*60*60*24*1000;
		date.setTime(miliseconds);
		System.out.println("1000天以后的日期为:"+date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String newDate = sdf.format(date);
		System.out.println("调整后的1000天以后的日期为:"+newDate);
		
		String str = "2010-02-02 12:00:00";
		Date newTime = sdf.parse(str);
		System.out.println("获取字符串得到的日期为:"+newTime);
		
		Calendar calendar = Calendar.getInstance();
		newTime = calendar.getTime();
		System.out.println("Calendar类型转为Date类型后的日期为:"+newTime);
		
		calendar.setTime(date);
		System.out.println("Date转为Calendar类型后的日期为:"+calendar);
		
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("通过Calendar获取的日期为"+day+"号.");
		
		int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("本月一共"+days+"天.");
		
		calendar.set(Calendar.DAY_OF_WEEK, 3);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
		System.out.println("设置星期到本星期的星期二,确认日期:"+sdf1.format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 3);
		System.out.println("添加三个月,日期变为:"+sdf.format(calendar.getTime()));
	}

}
