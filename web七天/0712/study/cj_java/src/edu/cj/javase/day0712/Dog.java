package edu.cj.javase.day0712;

public class Dog extends Pet {
	/*
	 * 重写:override
	 * 子类将父类中的方法进行重新实现的过程
	 * 规则:
	 *    1.返回类型、方法名、参数列表必须和父类中的方法一样
	 *    2.在重写方法时子类方法不能缩小父类中方法的访问权限,只能大于或者等于父类中的方法访问权限
	 * 
	 */
    @Override
    public void eat() {
    	System.out.println("名字叫"+name+"的狗狗在愉快的啃着骨头,留了好多哈喇子!!!");
    }
	public Dog() {
		//super("",87,89);
		//this("",89,98);
		/*
		 *在子类的构造方法的第一行 一定是调用父类中的无参构造方法，对应的是 super(),
		 *可以省略不写
		 *如果父类的无参构造方法不存在程序就会报错
		 *可以用super关键字显示的去调用父类中的有参构造方法
		 *注意super只能在构造方法的第一行
		 *this表示当前对象、super表示父类对象
		 *可以通过this或者super以"."的方式调用属性和实例方法
		 *还可以this或者super去调用对应类的构造方法
		 *但是在调用对应的构造方法时只能在对应的构造方法中的第一行！！！！
		 *
		 *注意!!!!
		 *     this、super表示的是对象，它们是不能够出现在静态方法中的，原因为
		 *     在静态的方法中对象都还没生成
		 */
		//super("",89,98);
		
		System.out.println("Dog无参构造方法被执行了");
		
	}

	public Dog(String name, int health, int love) {
		//this();
		//super(name,health,love);
		System.out.println("Dog有参构造方法被执行了");
	}
	

}
class TestPet{
	public static void main(String[] args) {
		/*Dog dog = new Dog("tom",89,98);
		dog.name = "旺财";
		dog.eat();*/
		
		Pet p = new Dog(); //向上转型 即将子类当做父类来使用
		p.name = "旺财";
		p.eat();
		//Pet p1 = new Cat();  
		//虽然强转可以编译通过但执行时可能报 ClassCastException的异常
		//因为强制转换的父类对象它跟本就不属于某个子类对象
		//为了避免出现转换失败而导致的异常可以通过 instanceof关键字来进行判断
		if (p instanceof Dog) {
			Dog dog = (Dog)p; //向下转型 把父类对象当做子类使用 必须强制转换
			dog.name = "tom";
			dog.eat();
		}else{
			System.out.println("对不起！p1对象不是Dog类的实例");
		}
		
		
		
	}
}
