package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 程序启动后,要求用户输入自己的生日,
 * 格式:yyyy-MM-dd
 * 然后经过程序计算,输出到今天为止,一共活了多少天
 * @author soft01
 *
 */
public class Test {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入生日(格式:yyyy-MM-dd):");
		String bir = sc.nextLine();
		
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday = sdf.parse(bir);
		long times1 = birthday.getTime();
		long times2 = now.getTime();
		long intervel = times2-times1;
		long days = intervel/1000/60/60/24;
		System.out.println("到今天为止,一共活了"+days+"天.");
		
		long souvenir = times1 + 10000L*1000*60*60*24;
		Date s = new Date(souvenir);
		System.out.println("10000天的纪念日:"+sdf.format(s));
		
		sc.close();
	}

}
