package oo.day04.vis;

public class Work2 {

	public static void main(String[] args) {
		Mmc m = new Mmc();
		m.print();
		Mmc.show();
		
		Mmc m1 = new Mmc();
		m1.print();
		Mmc.show();
	}

}

class Mmc{
	public static int a=0;
	public static int b;
	
	public void print(){
		b++;
		System.out.println("b="+b);
	}
	
	public static void show(){
		a++;
		System.out.println("a="+a);
	}
}
