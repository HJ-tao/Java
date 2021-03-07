package date.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDemo1 {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();//当前系统时间
		System.out.println(date);//Date重写了toString方法
		
		long time = date.getTime();
		System.out.println(time);//输出距离1970年1月1日到现在的毫秒数
		
		time += 1000*60*60*24; 
		date.setTime(time);   
		System.out.println(date);//输出后一天的时间
		
		
		//输出指定格式日期
		/**
		 * y:年   M：月   d：日  H：小时(24小时制) h：小时(12小时制) m：分  s：秒   
		 * E:星期  a：上午(下午)
		 * 
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss a E");//创建时建立格式
		String str = sdf.format(date);
		System.out.println(str);
		
		
		String s = "2016-03-24 08:35:35";
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//格式需要与字符串的格式一致
		Date date1 = sdf1.parse(s);//将字符串变为时间类型
		System.out.println(date1);
		
		
		//计算至今为止活的天数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入出生日期：(yyyy-MM-dd)");
		String ss = sc.nextLine();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		Date birth = sdf2.parse(ss);
		Date now = new Date();
		long time1 = now.getTime()-birth.getTime();
		time1 /= 24*60*60*1000;
		System.out.println("您已经活了"+time1+"天");
		
		
		//计算10000天的纪念日
		long time2 = birth.getTime() + (10000L*24*60*60*1000);
		Date souvenir = new Date();
		souvenir.setTime(time2);
		System.out.println("您出生10000天的纪念日是："+sdf.format(souvenir));
		
		//计算年龄
		Date birthDay = new Date();
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
		birthDay = sdf3.parse(ss);
		Date now1 = new Date();
		long times = now1.getTime()-birthDay.getTime();
		times /= (60L*60*1000*24*365);
		System.out.println((int)times);
	}

}
