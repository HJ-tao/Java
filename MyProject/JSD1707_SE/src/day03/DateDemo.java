package day03;
/**
 * java.util.Date
 * Date��ÿһ��ʵ�����ڱ�ʾһ��ʱ���.
 * ����Date�������ȱ��,���Դ󲿷ֲ���ʱ��ķ�����������Ϊ��ʱ��,���ٽ���ʹ��.
 * Date��ÿһ��ʵ���ڲ�ά����һ��longֵ,��ֵ��ʾ������1970��1��1��00��00��00����ʵ��
 * ��ʾ������֮���������ĺ���.
 */
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		/*
		 * Ĭ�ϴ�����Date��ʾ��ǰϵͳʱ��
		 */
		Date mili = new Date();
		System.out.println(mili);
		/*
		 * long getTime()
		 * ��ȡ��ǰDate�����ڲ�ά���ĺ���ֵ
		 */
		long time = mili.getTime();
		System.out.println(time);
		long days = time/1000/60/60/24;
		System.out.println("��1970�굽���ھ�����"+days+"��.");
		/*
		 * void setTime(long ms)
		 * ����һ��longֵ,ʹ�õ�ǰDate�����ʾ������
		 */
		time += 1000*60*60*24;
		mili.setTime(time);
		System.out.println(mili);
		mili.setTime(time-1000L*60*60*24*365*1000);
		System.out.println(mili);
		
	}

}
