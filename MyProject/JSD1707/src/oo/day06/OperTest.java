package oo.day06;

public class OperTest {

	public static void main(String[] args) {
		Elephant e = new Elephant("Lily",8.73);
		Refrigerator ref = new Refrigerator(4,1.8);
		ref.open();
		ref.store(e);
		ref.close();
	}

}

class Elephant{
	double tall;
	String name;
	public Elephant(){
		this("null",0);
	}
	
	public Elephant(String name,double tall){
		this.name = name;
		this.tall = tall;
	}
}

class Refrigerator{
	double height;
	double width;
	
	public Refrigerator(){
		this(0,0);
	}
	
	public Refrigerator(double height,double width){
		this.height = height;
		this.width = width;
	}
	
	public void open(){
		System.out.println("冰箱已经打开.");
	}
	
	public void store(Elephant e){
		System.out.println("高"+e.tall+"米的大象"+e.name+"已经被装进"+height+"米高"+width+"宽的冰箱.");
	}
	
	public void close(){
		System.out.println("冰箱已经关闭.");
	}
}
