package date.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入生产日期(yyyy-MM-dd)：");
		String product = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date produce = sdf.parse(product);
		System.out.println("请输入保质期(天数)：");
		int times = sc.nextInt();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(produce);
		calendar.add(Calendar.DAY_OF_MONTH, times-14);
		calendar.set(Calendar.DAY_OF_WEEK, 4);
	    Date sale = calendar.getTime();
	    System.out.println("促销日为："+sdf.format(sale));
	}

}
