package edu.cj.javase.day0712;

public class Pet {
   String name;
   int health;
   int love;
   
   public void eat(){
	   System.out.println(name+"�����Ľ�ʳŶ!");
   }

protected Pet() {
	
	System.out.println("Pet�޲ι��췽����ִ����");
}

public Pet(String name, int health, int love) {
	System.out.println("Pet�вι��췽����ִ����");
	this.name = name;
	this.health = health;
	this.love = love;
}
   
}
