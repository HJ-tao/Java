package edu.cj.javase.day0712;

public class Person{
    String name;
    String sex;
	private Person() {
		System.out.println("Person���޲ι��췽���������ˡ�");
	}
	
	public static Person getInstance(){
		return new Person();
	}
	public Person(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}
    
   
}
class TestPerson{
	public static void main(String[] args) {
		//Person p = new Person();
		Person p1 = new Person("la","na");
		//Person p = Person.getInstance();
	}
}
