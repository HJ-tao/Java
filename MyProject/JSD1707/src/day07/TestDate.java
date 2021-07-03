package day07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) throws ParseException {
		String str = "2017-08-06 14:22:22";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(str);
		Date now = new Date();
		long time = now.getTime() - date.getTime();
		time /= 1000*60*60;
		System.out.println(sdf.format(date)+"距离现在已经过去了"+time+"个小时.");
		
	}

}
