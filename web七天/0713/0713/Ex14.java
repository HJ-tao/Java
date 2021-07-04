package edu.cj.javase.day0713;

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