package oo.day06;

public class AnimalTest {

	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		a1.run();
		a2.run();
		a1.sleep();
		a2.sleep();
	}

}

abstract class Animal{
	String name;
	protected void sleep(){
		System.out.println("睡觉中,请勿打扰.......");
	}
	
	public abstract void run();
}

class Dog extends Animal{
	public Dog(){
		name = "Puppy";
	}
	
	public void run(){
		System.out.println("小狗"+name+"在跑步.");
	}
}

class Cat extends Animal{
	public Cat(){
		name = "Kitty";
	}
	
	public void run(){
		System.out.println("小猫"+name+"在跳高");
	}
}
