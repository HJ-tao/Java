package oo.day01;

public class RefNullDemo {
	public static void main(String[] args) {
		Cell c = new Cell();
		c.row = 3;
		Cell cc = c;  //指向同一个对象
		cc.row = 8;
		System.out.println(c.row);
		
		int a=5;
		int b=a;  //赋值
		b = 8;
		System.out.println(a);
		
		Cell ccc = new Cell();
		ccc.row = 2;
		ccc = null;
		ccc.row = 3;
	}
}
