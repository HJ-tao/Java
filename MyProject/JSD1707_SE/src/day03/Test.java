package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * ����������,Ҫ���û������Լ�������,
 * ��ʽ:yyyy-MM-dd
 * Ȼ�󾭹��������,���������Ϊֹ,һ�����˶�����
 * @author soft01
 *
 */
public class Test {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������(��ʽ:yyyy-MM-dd):");
		String bir = sc.nextLine();
		
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday = sdf.parse(bir);
		long times1 = birthday.getTime();
		long times2 = now.getTime();
		long intervel = times2-times1;
		long days = intervel/1000/60/60/24;
		System.out.println("������Ϊֹ,һ������"+days+"��.");
		
		long souvenir = times1 + 10000L*1000*60*60*24;
		Date s = new Date(souvenir);
		System.out.println("10000��ļ�����:"+sdf.format(s));
		
		sc.close();
	}

}
