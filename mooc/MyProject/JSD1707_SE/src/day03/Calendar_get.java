package day03;

import java.util.Calendar;

public class Calendar_get {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//获取年
		int year = calendar.get(Calendar.YEAR);
		//获取月
		int month = calendar.get(Calendar.MONTH);
		/*
		 * 和天相关的常量
		 * DATE:月中的天,与DAY_OF_MONTH一致
		 * DAY_OF_MONTH:月中的天
		 * DAY_OF_WEEK:星期中的天
		 * DAY_OF_YEAR:年中的天
		 */
		int days = calendar.get(Calendar.DAY_OF_MONTH);
		int day = calendar.get(Calendar.DATE);
		System.out.println(year+"-"+month+"-"+day);
		
		int h = calendar.get(Calendar.HOUR_OF_DAY);
		int m = calendar.get(Calendar.MINUTE);
		int s = calendar.get(Calendar.SECOND);
		System.out.println(h+":"+m+":"+s);
		
		int ydays = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("今天是今年的第"+ydays+"天");
		
		/*
		 * 获取指定时间分量所允许的最大值
		 */
		int maxd = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("今年一共有"+maxd+"天.");
		System.out.println("今年还剩"+(maxd-ydays)+"天.");
		
		int mdays= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("本月一共有"+mdays+"天.");
		
	}
}
