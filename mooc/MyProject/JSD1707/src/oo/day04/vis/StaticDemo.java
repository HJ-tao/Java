package oo.day04.vis;

public class StaticDemo {
	public static void main(String[] args) {
		Foo f = new Foo();
		f.show();
		
		Foo f2 = new Foo();
		f2.show();
		
		Foo f3 = new Foo();
		f3.show();
		
		Foo.print();  //static方法直接用类名点调用
	}
}

class Foo{
	public int a;
	static int b;
	
	public void show(){
		a++;b++;
		System.out.println(a+"\t"+b);
	}
	
	public static void print(){//静态方法
		System.out.println(b);
	}
}
