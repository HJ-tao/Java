package day03;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * 可以将Date与String之间按照指定的日期格式互相转换.
 * @author soft01
 *
 */
public class SimpleDateFormat_format {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
		System.out.println("当前时间:"+sdf.format(date));
	}

}
