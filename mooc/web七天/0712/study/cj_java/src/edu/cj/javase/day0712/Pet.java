package edu.cj.javase.day0712;

public class Pet {
   String name;
   int health;
   int love;
   
   public void eat(){
	   System.out.println(name+"在愉快的进食哦!");
   }

protected Pet() {
	
	System.out.println("Pet无参构造方法被执行了");
}

public Pet(String name, int health, int love) {
	System.out.println("Pet有参构造方法被执行了");
	this.name = name;
	this.health = health;
	this.love = love;
}
   
}
