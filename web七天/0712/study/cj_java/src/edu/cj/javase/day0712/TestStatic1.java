package edu.cj.javase.day0712;

public class TestStatic1 {

	/**
	 * static:静态的,用来修饰属性或者方法以及代码块
	 * 被static修饰的属性称之为类属性，也叫静态属性
	 * 被static修饰的方法称之为类方法，也叫静态方法
	 * 是可以用类名以"."的方式直接调用，如果是在同一个类中或者有继承关系的时候可以直接使用
	 * 静态的属性或者方法还可以通过对象名以"."的方式调用
	 * 
	 * 没有被static修饰的属性或者方法称之为实例对象的属性或者方法,只能通过对象以"."的方式调用，
	 * 当然如果在同一个类中的非静态方法中可以直接使用
	 * 
	 * 说明!!!!
	 * 
	 *      静态的属性或者方法可以在非静态的属性或者方法中调用
	 *      反之不可以哦
	 */
	static int num;
	int age;
	public static void main(String[] args) {
		System.out.println(num); //在同一个类中直接使用
		System.out.println(TestStatic1.num); //可以通过类名.静态属性
		System.out.println(new TestStatic1().num); //可以通过对象名.静态属性
		//System.out.println(age); 在静态的方法中不能直接引用非静态属性或者方法
		//new TestStatic1().sayHi();
	}
	//对象方法
	public void sayHi(){
		System.out.println(age);
		System.out.println(num); //在同一个类中直接使用
	}
	public static void show(){
		System.out.println(num); //在同一个类中直接使用
		//sayHi();
		//System.out.println(age);
	}

}
