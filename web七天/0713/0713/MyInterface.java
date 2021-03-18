package edu.cj.javase.day0713;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
 /*
 * abstract class 抽象类:是指在现实中存在但是有一些对应的方法没有具体的实现的这么一类事物
 * 对应的语法:
 *   public abstract class 类名{
 *       属性;
 *       普通实例方法;
 *       抽象方法;
 *   }
 * 抽象方法——————没有方法体的方法（没有方法主体对应的大括号{}），并且对应的方法被abstract关键字修饰
 * 形如:
 *     访问修饰符  abstract 返回类型 方法名();
 * 抽象类的特点:
 * 
 * 1.一个抽象类中可以没有抽象方法,由普通的实例方法或者属性构成与非抽象类一样
 * 2.如果类中有一个抽象方法存在那么该类必须声明为抽象类 
 * 3.抽象类是不能直接实例化的,即不能通过new关键字去实例化本身
 *    如日历类就是抽象类,它不能直接实例化，如下就是错的
 *       Calendar cal = new Calendar();  (X)
 * 4.抽象类由其子类完成实例化或者自身的实例化方法来完成     
 *       Calendar cal =  Calendar.getInstance();
 * 5.如果抽象类中存在抽象方法,在子类继承该抽象类时必须重写对应的抽象方法。如果在不重写且不报错的
 * 前提下还可以将对应的子类也声明为abstract类才可以
 * 
 *   因为类和类之间只允许单继承即一个子类只能继承一个父类，而一个父类可以派生出很多个子类对象
 *   这样就存在不足,子类就实现不了更强大的功能,所以可以interface接口来进一步扩展对应类的功能
 *   
 *   为了弥补类和类之间的单继承特点,所以推出了接口
 * 接口:它指的是一种能力、一种规则，不提供具体的实现,需要使用的时候自行根据对应的约束来实现即可
 * 
 * 接口的特点:
 *   1.接口中定义的属性都是静态的常量 形如  public static final 数据类型  常量名 = 值;
 *    public static final这三个关键字可以省略不写
 *   2.定义在接口中的方法都是抽象方法,并且是被public abstract 来修饰的，public abstract两个关键字
 *   可以省略不写，且两个关键字的顺序随意
 *   3.接口不能直接实例化同抽象类
 *   4.接口只是定义的规则，所以需要通过对应的实现类去实现对应的接口并重写接口中的所有抽象方法
 *   5.如果不重写可以将实现类声明为抽象的，但不推荐
 *   6.接口是允许多继承的,关键字用extends,多个接口间用逗号隔开即可
 *     形如   public interface A  extends B,C,D...{}
 *   7.一个实现类可以同时实现多个接口,就好比一个人同时拥有多种能力一样  
 *   实现接口的关键字 implements
 *   语法:
 *      class  类  implements A,B,C,D
 *   8。如果存在有继承和实现接口的前提下,应该是先继承然后再去实现对应的接口
 *   如下:
 *      class  子类 extends 父类  implements 接口1,接口2,....接口n{
 *         //实现接口或者抽象类中的抽象方法....
 *      }
 *  
 *      
 *  多态:
 *  程序中实现多态的方式.
 *  1.将父类对象作为形参实现
 *  2.将父类对象作为返回类型  
 *   
 *  多态的适用场合:
 *     1.存在继承中的子类和父类之间或者接口和实现类之间
 *     2.子类或者实现类要重写父类中或者接口中对应的方法
 *     3.将父类作为形参,而子类对象可以上升为父类对象(向上转型)
 *     
 */
abstract class A{
	int num;
	public  void sayHi(){
		
	}
	//定义一个抽象方法
	abstract void show();
}
class C{
	
	
}
class B extends A{

	@Override
	void show() {
		// TODO Auto-generated method stub
		
	}
	
}

class TestAbstractClass{
	
	public static void main(String[] args) {
		//Calendar cal = new Calendar(); 
		Calendar cal = new GregorianCalendar(); //子类完成实例化
		Calendar cal1 = Calendar.getInstance();  //实际上还是由子类完成的实例化
		System.out.println(cal.get(Calendar.YEAR)+"年"+(cal.get(Calendar.MONTH)+1)+"月"+cal.get(Calendar.DAY_OF_MONTH));
	    
		Date date = new Date();
		//System.out.println(date.getYear()+"年"+date.getMonth()+"月"+date.getDate());
	   System.out.println(date.toLocaleString());
	}
}
public interface MyInterface {
    int MAX = 100;
    //等同于如下代码
    //public static final int MAX = 100;
    void show(); //public abstract void show();
    //protected void sayHi(); 错误的,只能是public并且还是abstract
    int getStuNo(int no);
}
