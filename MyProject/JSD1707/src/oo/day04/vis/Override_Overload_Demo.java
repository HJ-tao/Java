package oo.day04.vis;

public class Override_Overload_Demo {
	public static void main(String[] args) {
		Doo d = new Doo();
		d.print();
		d.show(1);
		
		Eoo e = new Eoo();
		e.print();
		e.show(3);
		e.show(1, 2);
		
		Doo de = new Eoo();//向上造型
		de.show(2);
		de.print();
	}
}

class Doo{
	public void print(){
		System.out.println("Doo");
	}
	
	public void show(int i){
		System.out.println(i+"在Doo里");
	}
}


class Eoo extends Doo{
	public void show(int m,int n){//重载
		System.out.println(m+"和"+n+"在Eoo里");
	}
	
	public void print(){//重写
		System.out.println("Eoo");
	}
}
