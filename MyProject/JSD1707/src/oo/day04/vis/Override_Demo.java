package oo.day04.vis;

public class Override_Demo {
	public static void main(String[] args) {
		Boo b = new Boo();
		b.show();
	}
}

class Aoo{
	void show(){
		System.out.println("Aoo");
	}
}

class Boo extends Aoo{
	void show(){
		System.out.println("Boo");
	}
}

class Coo extends Aoo{
	void show(){
		System.out.println("Coo");
	}
}
