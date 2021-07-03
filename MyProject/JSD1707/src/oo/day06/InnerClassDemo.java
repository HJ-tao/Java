package oo.day06;

public class InnerClassDemo {
	
	public static void main(String[] args) {
		Mama m = new Mama();
		//Baby b = new Baby(); //编译错误,内部类对外不具备可见性
		m.createBaby();
	}
}


class Mama{	
	private String name;
	Baby createBaby(){
		return new Baby();
	}
	class Baby{
		void show(){
			System.out.println(name);
			System.out.println(Mama.this.name);
//			System.out.println(this.name);
		}
	}
}








