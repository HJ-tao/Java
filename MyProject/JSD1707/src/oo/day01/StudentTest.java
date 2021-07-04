package oo.day01;

public class StudentTest {

	public static void main(String[] args) {
		Student zs = new Student(); //创建一个学生对象
		zs.name = "张三";           //给成员变量赋值
		zs.age = 21;
		zs.address = "河北廊坊";
		zs.study();                //调用类的方法
		zs.sayHi();               
		
		
		Student ls = new Student();
		ls.name = "李四";
		ls.age = 18;
		ls.address = "黑龙江佳木斯";
		ls.study();
		ls.sayHi();
		
		//创建了一个学生对象
		//给所有成员变量赋默认值
		//引用数据类型默认值为null
		Student ww = new Student();
		ww.study();
		ww.sayHi();
		
	}

}
