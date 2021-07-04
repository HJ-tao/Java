                                     //复习题
/*一．	选择题
1．	假定要在某个类中定
义两个int类型的域（属性或成员变量）x和y，
    下面哪些方式是正确的？
	
	（1）*/
public class XYZ
 {  
    public static void main(String args[])
     {
           System.out.println(“hello”);
              int x;
              int y;
     }
}

//(2)
public class XYZ
 {  
	 int x;
     int y;
    public static void main(String args[])
     {
           System.out.println(“hello”);
     }
}
//(3)
public class XYZ
 {  
    public static void main(String args[])
     {
           System.out.println(“hello”);
     }
	 int x;
     int y;
}
//(4)
public class XYZ
 {  
	 
    public static void main(String args[])
     {
           System.out.println(“hello”);
     }
	 
}
     int x;
     int y;
/* 2.下面代码错误在哪里？
*/
public class Ex1
{
	int x = 1; y = 1; int x = 2;
}
/*3. 下面的代码错误在哪里？
*/
public class Ex2   属性+方法
{
	int x = 1;    
	int y = 2;    
	int z  ;       
	z = x+y;     
	System.out.println("Hello world!"); 
}
/*4. 假定income是某个类中的方法，
哪些income方法的定义是正确的？
*/

(1) void income(){} 
(2) int void income()
{System.out.println("hhh");}
(3) int income()
{System.out.println("hhh");}
(4) int income()
{System.out.println("hhh"); return 1;}
(5) income(){System.out.println("hhh");}

/*5. 运行下面的程序会在屏幕上输出hello吗？ 为什么*/
public class Ex3
{
	public void main(String[] args)
	{ System.out.println("hello"); }
}

/*6. 阅读下面的程序，该程序的目的
是在屏幕上输出hello，main方法调用m2方法
m2方法调用m1方法，m1方法输出hello。
那么这个程序有什么错误？如果保持方法之间
的这种调用顺序，如何改正错误？*/
public class Ex4
{
	void m1()
	{System.out.println("hello");}
	static void m2()
	{ m1();}
	public static void main(String [] args)
	{ m2();}
}

/*7. 下面是ExTwoClass1.java文件的代码，
它有两个类，该程序有什么编译错误？*/
public class Class1
{
}
public class ExTwoClass1
{
}

/*8. 编译和运行下面的程序的结果是什么？*/
public class Ex5
{
	int x = 0;
	public static void main(String[] args)
	{  int x = 1; System.out.println("x = "+x);}
}
 /*9. 类Ex6的定义如下,如果要创建一个该类的对象，
 下面哪些语句正确*/
 public class Ex6
 {
	 Ex6(int i) {
		 System.out.
			 println("Constructor i = "+i);}
 }
 (1) Ex6 obj1 = new Ex6(); 
 (2)Ex6 obj1 = new Ex6(3);
 (3)Ex6 obj1 = new Ex6("3");
 (4) Ex6 obj1 = Ex6(3); 
 (5) Ex6 obj1 = new Ex6(3.0);
/*10. 下列程序编译没有问题，那么其运行结果是？*/
public class Ex7
{
	static void m(int x){
		System.out.println("method/int= "+x);}
	static void m(String x){
		System.out.println("method/String= "+x);}
	static void m(boolean x){
		System.out.println("method/boolean= "+x);}
	public static void main(String[] args)
	{ m(true);m(3);m("3");m("true");}
}
/*11. 下面是Ex8的代码，在main方法中增加代码，
使其能够输出类Parent中的数据i并调用方法m*/
class Parent
{
	int i = 1; void m(){
		System.out.println("method in parent");}
}
public class Ex8 extends Parent
{
	public static void main(String[] args)
	{
	}
}
/*12. 下面是Ex9的代码，当编译完该类后，
要在屏幕上输出Class1，应该使用下面的什么命令？*/
class Class1
{
	public static void main(String[] args)
	{System.out.println("Class1");}
}
public class Ex9 
{
	public static void main(String[] args)
	{System.out.println("Ex9");}
}
(1) java Ex9 
(2)java Class1 
(3)java Ex9Class1 
(4) java Ex9.Class1

/*13 下面程序编译没有错误，其运行结果是什么？*/
class Parent
{
  void m(){
	  System.out.println("method in parent");}
}
public class Ex10 extends Parent
{
	void m(){
		System.out.println("method in Ex10");}
	public static void main(String[] args)
	{  Ex10 child = new Ex10(); 
	   child.m();
	   Parent parent = new Parent(); 
	   parent.m();
	}
}
/*14. 下面程序编译没有错误，其运行结果是什么？ */
class Parent
{
  Parent(){System.out.println("parent1");}
  Parent(int i){System.out.println("parent2");}
}
public class Ex11 extends Parent
{
	Ex11(){	
		
		System.out.println("Child1");}
	Ex11(int i){		
		System.out.println("Child2");}
	public static void main(String[] args)
	{  Ex11 child1 = new Ex11(); 
	   Ex11 child2 = new Ex11(3);
	}
}

/*15. 阅读下面的代码，如果不改变类Ex12中的任何代码，
如何修改Parent类
使程序输出两行信息，第一行是Parent，
第二行是Child？*/
class Parent
{
  Parent(int i){System.out.println("Parent");}
}
public class Ex12 extends Parent
{
	Ex12(int i){System.out.println("Child");}
	
	public static void main(String[] args)
	{  
	   Ex12 child2 = new Ex12(3);
	}
}

/*16. 下面的程序有什么错误？*/	
public class Ex13
{
	static final int PI = 3.14;
	public static void main(String[] args)
	{
		System.out.println("PI = "+PI);
		PI = 3.1415926;
        System.out.println("PI = "+PI);
	}
}

/*17. 下面的程序没有错误，运行它的结果是什么？*/
class Parent
{
  void m(){System.out.println("Parent");}
}
public class Ex14 extends Parent
{
	void m(){System.out.println("Child");}
	void n(){  super.m();   m();   }
	
	public static void main(String[] args)
	{  
	   Ex14 child = new Ex14(); 
	   child.m();  child.n();
	}
}

/*18. 下面的程序没有错误，运行它的结果是什么？*/
public class Ex15
{
	int i = 1;
	void m(int i){this.i = i+1;
	i = this.i+1;
	System.out.println("i in m= "+i);}
	
	public static void main(String[] args)
	{  
	   Ex15 obj = new Ex15();  obj.m(2);  
	   System.out.println("i in main= "+obj.i);	
	}
}

/*19. 阅读下面代码，该程序会出现编译错误。
如果要求不增减代码，但是可以更改语句的顺序，
如何修改？*/
class Parent
{
  Parent(int i){System.out.println("Parent");}
}
public class Ex16 extends Parent
{
	
	Ex16(int i)
		{
		System.out.println("Child");
	    super(i);
	    }
	
	public static void main(String[] args)
	{  
	   Ex16 child = new Ex16(3);
	}
}

//********************
/*20. 下面的程序没有错误，运行它的结果是什么？*/
class Parent
{
  void m1(){System.out.println("m1 in Parent");}
}
public class Ex17 extends Parent
{
	void m(Parent p){   p.m1();  }
	void m1() { System.out.println("m1 in Child"); }	
	public static void main(String[] args)
	{  
	   Ex17 child = new Ex17();  child.m(child); 
	  Parent parent = new Parent(); child.m(parent);
	  child.m1(); parent.m1();
	}
}

/*21. 下面的程序有什么编译错误*/
package mycodes.ide1;
package mycodes.ide2;
public class Ex18
{
}

/*22. 下面的程序有什么编译错误*/
import mycodes.ide1.*;
package mycodes.ide2;
public class Ex19
{
}

/*23. 下面的程序有什么编译错误*/
class Parent
{
	private void m() { System.out.println("parent");}
}
public class Ex20
{
		public static void main(String[] args)
	     { 
			Parent parent = new Parent(); parent.m();
	     }
}
/*24. 下面的程序有什么编译错误*/
public  class Ex21
{
	void m1(){ System.out.println("m1");}
	void m2();
}

/*25. 下面的程序没有错误，运行它的结果是什么？*/
abstract class Parent
{
	 void m1() { System.out.println("m1 in parent");}
	 abstract void m2();
}
public class Ex22 extends Parent
{
		void m1() { System.out.println("m1 in child");}
		void m2() { System.out.println("m2 in child");}		
		public static void main(String[] args)
	     { 
			Ex22 child = new Ex22(); 
			child.m1();
			child.m2();
	     }
}

/*26. 下面的程序有什么编译错误*/
public interface Ex23
{
	int i; void m1(){}; void m2();
}
/*27. 下面的程序有什么编译错误*/
interface Parent
{
	int i = 1; void m1();
}
public class Ex24 extends Parent
{
	void m1() {System.out.println("m1 in child");}
}
/*28. 下面的程序有什么编译错误*/
interface Parent1
{
	void m1();
}
interface Parent2
{
	void m2();
}
public class Ex25 implements Parent1,Parent2
{
	void m1() {System.out.println("m1 in child");}
}



/*29. 下面的程序有什么编译错误*/
interface Parent1
{
	void m1();
}
interface Parent2
{
	void m2();
}
public abstract class Ex26 implements Parent1,Parent2
{
	void m1() {System.out.println("m1 in child");}
}

/*30. 指出下面程序中的错误*/
interface Parent
{
	void m1();
}
public abstract class Ex27 implements Parent
{
	public void m1() {System.out.println("m1 in child");}
	public static void main(String [] args)
	{  Ex27 child = new Ex27(); child.m1(); }
}

/*31. 下面的程序没有错误，运行它的结果是什么？*/
interface GrandParent
{
	void m1();
}
class Parent implements GrandParent
{
	public void m2(GrandParent grandParent){grandParent.m1();}
	public void m1(){System.out.println("m1 in parent");}
}
public class Ex28 extends Parent
{
	public void m1() {System.out.println("m1 in child");}
	public void m2(GrandParent grandParent) {grandParent.m1();}
	public static void main(String [] args)
	{  Ex28 child = new Ex28(); child.m2(child);
	   Parent parent = new Parent(); child.m2(parent);
	   parent.m2(parent); parent.m2(child); 
	}
}