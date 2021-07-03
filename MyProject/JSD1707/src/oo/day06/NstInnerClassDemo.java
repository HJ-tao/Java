package oo.day06;
//匿名内部类
public class NstInnerClassDemo {
	public static void main(String[] args) {
		//创建了一个Inter2的子类，但是没有名字
		//为该子类创建了一个对象，名为o1
		//大括号中的为子类的类体
		Inter2 o1 = new Inter2(){
			
		};
		
		final int num = 5;
		
		Inter3 o3 = new Inter3(){
			public void show(){
				System.out.println("showshow");
				System.out.println(num);
			}
		};
		o3.show();
	}
}

interface Inter2{
}

interface Inter3{
	void show();
}