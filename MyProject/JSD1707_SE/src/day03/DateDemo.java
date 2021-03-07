package day03;
/**
 * java.util.Date
 * Date的每一个实例用于表示一个时间点.
 * 由于Date存在设计缺陷,所以大部分操作时间的方法都被声明为过时的,不再建议使用.
 * Date的每一个实例内部维护着一个long值,该值表示的是自1970年1月1日00：00：00到该实例
 * 表示的日期之间所经过的毫秒.
 */
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		/*
		 * 默认创建的Date表示当前系统时间
		 */
		Date mili = new Date();
		System.out.println(mili);
		/*
		 * long getTime()
		 * 获取当前Date对象内部维护的毫秒值
		 */
		long time = mili.getTime();
		System.out.println(time);
		long days = time/1000/60/60/24;
		System.out.println("从1970年到现在经过了"+days+"天.");
		/*
		 * void setTime(long ms)
		 * 给定一个long值,使得当前Date对象表示该日期
		 */
		time += 1000*60*60*24;
		mili.setTime(time);
		System.out.println(mili);
		mili.setTime(time-1000L*60*60*24*365*1000);
		System.out.println(mili);
		
	}

}
