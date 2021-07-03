package collection.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * 集合转为数组
 * Collection 提供了相应的方法
 * Object []toArray()
 * 之后修改集合元素就是修改数组元素
 *
 * 数组转换为List集
 * 通过数组的工具类,Arrays的静态方法asList	
 * 数组转换的集合是不能添加新元素的，因为这会导致数组扩容，那么就不能表示原数组，所以不支持这样的操作.
 */
public class List_Demo2 {

	public static void main(String[] args) {
		Collection<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		//Object[] obj = list.toArray();已经舍弃不用
		String[] arr = list.toArray(new String[list.size()]);//大小随意,大了多的为null,小了系统会自动转为适合的大小
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		
		String[] str = {"out","in","not","enter"};
		List<String> list1 = Arrays.asList(str);
		
		System.out.println(list1.size());
		System.out.println(list1);
		
		list1.set(1,"3");
		System.out.println(list1);
		System.out.println(Arrays.toString(str));
		
		//list1.add("one");
		//System.out.println(list1);//会有不支持操作异常
		
		//如果需要添加元素,需要重新创建一个集合
		List<String> list2 = new ArrayList(list1);//直接将list1的值传给list2，相当与list2.addAll(list1);
		list2.add("one");
		System.out.println(list2);
	}
}
