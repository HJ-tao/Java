                                     //��ϰ��
/*һ��	ѡ����
1��	�ٶ�Ҫ��ĳ�����ж�
������int���͵������Ի��Ա������x��y��
    ������Щ��ʽ����ȷ�ģ�
	
	��1��*/
public class XYZ
 {  
    public static void main(String args[])
     {
           System.out.println(��hello��);
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
           System.out.println(��hello��);
     }
}
//(3)
public class XYZ
 {  
    public static void main(String args[])
     {
           System.out.println(��hello��);
     }
	 int x;
     int y;
}
//(4)
public class XYZ
 {  
	 
    public static void main(String args[])
     {
           System.out.println(��hello��);
     }
	 
}
     int x;
     int y;
/* 2.���������������
*/
public class Ex1
{
	int x = 1; y = 1; int x = 2;
}
/*3. ����Ĵ�����������
*/
public class Ex2   ����+����
{
	int x = 1;    
	int y = 2;    
	int z  ;       
	z = x+y;     
	System.out.println("Hello world!"); 
}
/*4. �ٶ�income��ĳ�����еķ�����
��Щincome�����Ķ�������ȷ�ģ�
*/

(1) void income(){} 
(2) int void income()
{System.out.println("hhh");}
(3) int income()
{System.out.println("hhh");}
(4) int income()
{System.out.println("hhh"); return 1;}
(5) income(){System.out.println("hhh");}

/*5. ��������ĳ��������Ļ�����hello�� Ϊʲô*/
public class Ex3
{
	public void main(String[] args)
	{ System.out.println("hello"); }
}

/*6. �Ķ�����ĳ��򣬸ó����Ŀ��
������Ļ�����hello��main��������m2����
m2��������m1������m1�������hello��
��ô���������ʲô����������ַ���֮��
�����ֵ���˳����θ�������*/
public class Ex4
{
	void m1()
	{System.out.println("hello");}
	static void m2()
	{ m1();}
	public static void main(String [] args)
	{ m2();}
}

/*7. ������ExTwoClass1.java�ļ��Ĵ��룬
���������࣬�ó�����ʲô�������*/
public class Class1
{
}
public class ExTwoClass1
{
}

/*8. �������������ĳ���Ľ����ʲô��*/
public class Ex5
{
	int x = 0;
	public static void main(String[] args)
	{  int x = 1; System.out.println("x = "+x);}
}
 /*9. ��Ex6�Ķ�������,���Ҫ����һ������Ķ���
 ������Щ�����ȷ*/
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
/*10. ���г������û�����⣬��ô�����н���ǣ�*/
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
/*11. ������Ex8�Ĵ��룬��main���������Ӵ��룬
ʹ���ܹ������Parent�е�����i�����÷���m*/
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
/*12. ������Ex9�Ĵ��룬������������
Ҫ����Ļ�����Class1��Ӧ��ʹ�������ʲô���*/
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

/*13 ����������û�д��������н����ʲô��*/
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
/*14. ����������û�д��������н����ʲô�� */
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

/*15. �Ķ�����Ĵ��룬������ı���Ex12�е��κδ��룬
����޸�Parent��
ʹ�������������Ϣ����һ����Parent��
�ڶ�����Child��*/
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

/*16. ����ĳ�����ʲô����*/	
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

/*17. ����ĳ���û�д����������Ľ����ʲô��*/
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

/*18. ����ĳ���û�д����������Ľ����ʲô��*/
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

/*19. �Ķ�������룬�ó������ֱ������
���Ҫ���������룬���ǿ��Ը�������˳��
����޸ģ�*/
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
/*20. ����ĳ���û�д����������Ľ����ʲô��*/
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

/*21. ����ĳ�����ʲô�������*/
package mycodes.ide1;
package mycodes.ide2;
public class Ex18
{
}

/*22. ����ĳ�����ʲô�������*/
import mycodes.ide1.*;
package mycodes.ide2;
public class Ex19
{
}

/*23. ����ĳ�����ʲô�������*/
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
/*24. ����ĳ�����ʲô�������*/
public  class Ex21
{
	void m1(){ System.out.println("m1");}
	void m2();
}

/*25. ����ĳ���û�д����������Ľ����ʲô��*/
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

/*26. ����ĳ�����ʲô�������*/
public interface Ex23
{
	int i; void m1(){}; void m2();
}
/*27. ����ĳ�����ʲô�������*/
interface Parent
{
	int i = 1; void m1();
}
public class Ex24 extends Parent
{
	void m1() {System.out.println("m1 in child");}
}
/*28. ����ĳ�����ʲô�������*/
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



/*29. ����ĳ�����ʲô�������*/
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

/*30. ָ����������еĴ���*/
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

/*31. ����ĳ���û�д����������Ľ����ʲô��*/
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