package day02;

public class DataTypeDemo {
	public static void main(String[] args){
		int a = 5;
		long b = a;
		int c = (int)b;
		long d = 10000000000L;
		int e = (int)d;
		System.out.println(e);//不是100亿，超出int范围
		float f = 5.987F;
		int g = (int)f;
		System.out.println(g);//5
		byte b1 = 5;
		byte b2 = 6;
		byte b3 = (byte)(b1 + b2);
		System.out.println(2+2);  //4
		System.out.println(2+'2');  //52
		System.out.println('2'+'2');  //100
		
		
		
		
		/*boolean b1 = true;
		boolean b2 = false;
		//boolean b3 = 56;  boolean只有true和false类型
		char c1  = '男';
		char c2 = 'm';
		char c3 = '8';
		char c4 = ' ';
		//char c5 = ''; 字符型单引号里必须有字符
		//char c6 = '男性';  单引号里只能有一个字符
		char c7 = 65;
		System.out.println(c7);//A
		char c8 = '\'';
		System.out.println(c8);//'
*/		
		
		
		
		/*int a = 250;
		//int b = 10000000000;
		System.out.println(5/2+"\t"+2/5+"\t"+2.0/5);//2	0	0.4
		int c = 2147483647;
		c = c+1;
		System.out.println(c);//-2147483648
		long d = 10000000000l;
		long e = 1000000000*2*10L;
		System.out.println(e);//200亿
		long f = 1000000000*3*10L;
		System.out.println(f);//不是300亿
		long g = 1000000000L*3*10;
		System.out.println(g);//300亿
		long h = System.currentTimeMillis();
		System.out.println(h);
		double i = 3.14;
		double j = 6.0,k = 4.9;
		System.out.println(j-k);//1.099999996
*/	}

}
