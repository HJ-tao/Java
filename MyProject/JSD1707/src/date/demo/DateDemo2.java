package date.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDemo2 {

	public static void main(String[] args) throws ParseException {
		Date now = new Date();
		Date birth = new Date();
		Scanner sc = new Scanner(System.in);
		
		long time = now.getTime();
		time += 10000L*60*60*24*1000;
		Date future = new Date();
		future.setTime(time);
		System.out.println("距离今天10000天是："+future);
		
//		System.out.println("请输入你的出生日期：");
//		String str1 = sc.nextLine();
		String str1 = "1996-07-28";
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		birth = sdf1.parse(str1);
		System.out.println("你的生日是 ："+sdf1.format(birth));
		
		time = now.getTime() - birth.getTime();
		time /= (1000L*60*60*24*365);
		System.out.println("从出生到现在共经历了"+time+"年.");
		
		time = birth.getTime();
		time += (10000L*24*60*60*1000);
		future.setTime(time);
		System.out.println("你出生10000天的纪念日为："+sdf1.format(future)+".");
	}
}
