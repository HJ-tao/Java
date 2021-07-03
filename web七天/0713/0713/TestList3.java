package edu.cj.javase.day0713;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestList3 {

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
         */
		
		List<Float> list = new ArrayList<Float>();
		   float f = 87.8f;
		   int num = 12;
	        list.add(1.0f);
	        list.add(f); 
	        list.add(new Float(num));
	        //list.add(0, 12.56f); //在指定的索引位置上插入对应的元素 add(Float f)的重载方法
	        //取出泛型集合中的数据时不需要类型转换
	       float number =  list.get(0);
	       System.out.println(number);
	       
	        
	}
      
}
