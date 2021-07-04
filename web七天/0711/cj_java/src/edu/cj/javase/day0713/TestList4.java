package edu.cj.javase.day0713;

import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestList4 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {		
		         
        /*
         * add()用于将对应的数据放置到集合中去,
         * 在没用到泛型之前放入集合的数据类型自动上升为Object
         * 取出来的时候也是Object,所以如果要还原数据则需要强制类型转换______如果是要转换成基本类型
         * 需要用到java中8种基本数据类型对应的8种包装类来完成强转,否则转换失败！
         * 取数据用get(int index) index从0开始
         * 整个集合的长度可以size()方法获取到
         * 
         * 在JDK5.0中推出了java的泛型集合,针对保存到集合中的数据类型的一种约定
         * 在使用泛型时存入的数据类型必须和指定类型匹配
         * 取出来的时候不需要强制转换
         *   泛型集合的语法如下:
         *      集合<指定存储的数据类型(只能是对象类型)>  集合对象名  = new 集合中接口的某个实现类<指定存储的数据类型(只能是对象类型)>();
         *      List<Float> list = new ArrayList<Float>();
         *      泛型集合的集中变形(兼容性的考虑)
         *      1.List<Float> list = new ArrayList<Float>();
         *      2.List<Float> list = new ArrayList(); //兼容JDK5.0前的集合
         *      3.List list = new ArrayList<Float>(); //高版本兼容低版本
         *      错误的写法:_____原因是类型不匹配
         *      List<Float> list = new ArrayList<Object>();  
         *      List<Object> list = new ArrayList<Float>();
         *      
         *      
         *      
         *      一个线性 collection，支持在两端插入和移除元素。
         *      名称 deque 是“double ended queue（双端队列）”的缩写，
         *      通常读为“deck”。大多数 Deque 实现对于它们能够包含的元素数没有固定限制
         *      ，但此接口既支持有容量限制的双端队列，也支持没有固定大小限制的双端队列。 

				此接口定义在双端队列两端访问元素的方法。提供插入、移除和检查元素的方法。
				每种方法都存在两种形式：一种形式在操作失败时抛出异常，
				另一种形式返回一个特殊值（null 或 false，具体取决于操作）。
				插入操作的后一种形式是专为使用有容量限制的 Deque 实现设计的；在大多数实现中，插入操作不能失败。 
				
				下表总结了上述 12 种方法： 
				
				 第一个元素（头部） 最后一个元素（尾部） 
				 抛出异常 特殊值 抛出异常 特殊值 
				插入 addFirst(e) offerFirst(e) addLast(e) offerLast(e) 
				移除 removeFirst() pollFirst() removeLast() pollLast() 
				检查 getFirst() peekFirst() getLast() peekLast() 	

         */
		
		LinkedList<Float> list = new LinkedList<Float>();
		    float f = 87.8f;
		    int num = 12;
	        list.add(1.0f);
	        list.add(f); 
	        list.add(new Float(num));
	        list.addFirst(1.2f);
	        //list.add(0, 12.56f); //在指定的索引位置上插入对应的元素 add(Float f)的重载方法
	        //取出泛型集合中的数据时不需要类型转换
	        //float number =  list.get(0);
	        //通过getFirst()就可以快速获取第一条数据
	        float number1 = list.getFirst();
	        float number2 = list.getLast();
	        System.out.println(number1+" "+number2);
	           
	}
      
}
