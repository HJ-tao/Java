package oo.day06;
//不用第三个数完成两个数的交换
public class Exchange {

	public static void main(String[] args) {
		int a=3,b=8;
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println(a);
		System.out.println(b);
	}

}
