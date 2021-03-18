package edu.cj.javase.day0713;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestList1 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		//ArrayList()默认的长度为10
		List list = new ArrayList();
        list.add(1);
        list.add(1L);
        list.add(1.0);
        list.add(1.0f);
        list.add('1');
        list.add("1");
        list.add(new Date());
        int []nums = {1,2,3,4,5,6};
        list.add(nums);
        //list.add(new int[]{1,2,3,4,5,6});
        List list1 = new ArrayList();
        list1.add("hello");
        list.add(list1);
        
        /*
         * add()用于将对应的数据放置到集合中去,
         * 在没用到泛型之前放入集合的数据类型自动上升为Object
         * 取出来的时候也是Object,所以如果要还原数据则需要强制类型转换
         * 取数据用get(int index) index从0开始
         * 整个集合的长度可以size()方法获取到
         * 
         * 在JDK5.0中推出了java的泛型集合,针对保存到集合中的数据类型的一种约定
         * 在使用泛型时存入的数据类型必须和指定类型匹配
         * 取出来的时候不需要强制转换
         * 
         */
        //System.out.println(list.get(0));
        
        /*
         * 循环遍历集合元素
         * 可以用三种不同的循环
         *   while do-while for
         *   
         *   还可以用增强型的for循环
         *   
         *   还可以通过集合中的迭代器循环输出
         */
        //普通循环
        for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
        //System.out.println("*******************************************");
        //增强型for循环
        /*for (Object object : list) {
			System.out.println(object);
		}
        System.out.println("*******************************************");
        //迭代器循环
        /*Iterator it = list.iterator();
        for (;it.hasNext();) 
        {
			System.out.println(it.next());
		}*/
	   }

}
