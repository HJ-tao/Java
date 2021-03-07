package oo.day04.vis;

public class Work1 {
	public static void main(String[] args) {
		Xoo b = new Xoo();
		Xoo z = new Xoo();
	}
}


class Zoo{
	{
		System.out.println("Aoo的普通代码块");
	}
	Zoo(){
		System.out.println("AOO的构造方法");
	}
	static{
		System.out.println("Aoo的静态代码块");
	}
}

class Xoo extends Zoo{
	Xoo(){
		System.out.println("Boo的构造方法");
	}
	{
		System.out.println("Boo的普通代码块");
	}
	static{
		System.out.println("Boo的静态代码块");
	}
}