package day03;

public class Staff {
	String name;
	int age;
	char sex;
	double salary;
	public void print(Staff s){
		System.out.println("----------------------------");
		System.out.println("姓名："+s.name);
		System.out.println("年龄："+s.age);
		System.out.println("性别："+s.sex);
		System.out.println("薪水："+s.salary);
		System.out.println("----------------------------");
	}
}
