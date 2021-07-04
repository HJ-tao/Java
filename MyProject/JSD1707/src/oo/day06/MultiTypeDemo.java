package oo.day06;

public class MultiTypeDemo {

	public static void main(String[] args) {
		Aoo o1 = new Boo();
		Inter1 o2 = (Inter1)o1;
		Boo o3 = (Boo)o1;
		if(o1 instanceof Coo){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}

}

interface Inter1{
}

class Aoo{
}

class Boo extends Aoo implements Inter1{
}

class Coo extends Aoo{
}