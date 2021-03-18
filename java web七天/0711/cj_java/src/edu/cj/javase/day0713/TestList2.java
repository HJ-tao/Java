package edu.cj.javase.day0713;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestList2 {

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
         * 
         */
		
		List list = new ArrayList() ;   
	    list.add(1);
        list.add(1L);
        list.add(1.0);
        list.add(1.0f);
        list.add('1');
        list.add("1");
        
        Object obj  = list.get(0);
        int i = (Integer)obj;
        System.out.println("i = "+i);
	}
      
}
