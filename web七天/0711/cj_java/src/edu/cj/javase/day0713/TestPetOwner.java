package edu.cj.javase.day0713;

public class TestPetOwner {
    public static void main(String[] args) {
		PetOwner po = new PetOwner();
		Pet dog = new Dog(); //向上转型
		po.feed(dog);
		Pet cat = new Cat();	
		po.feed(cat);	
	}
}
