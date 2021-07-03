package collection.demo;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * java.util.List
 * Collection的一个子接口
 * 可重复集且有序，提供了一系列基于下标操作的方法
 * E get(int index)
 * 获取指定下标处对应的元素 
 * E set(int index,E e)
 * 替换指定下标处的元素，返回原下标处元素
 * List提供了add和remove的重载方法,可以基于下标进行增加和删除操作.
 * void add(int index,E e)
 * 在指定位置增加元素
 * E remove(int index)
 * 删除并返回指定位置对应的元素
 * List subList(int start,int end)
 * 截取子集
 */

public class List_Demo1 {

	public static void main(String[] args) {
		List<String> c = new ArrayList<String>(); 
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		
		System.out.println(c);
		String str = c.get(2);
		System.out.println(str);
		
		for(int i=0;i<c.size();i++){
			str = c.get(i);
			System.out.println(str);
		}
		
		String old = c.set(1,"2");
		System.out.println(c);
		System.out.println("old:"+old);
		
		c.add(1, "3");
		System.out.println(c);
		
		String s = c.remove(1);
		System.out.println(c);
		System.out.println("s="+s);
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		System.out.println(list);
		List<Integer> subList = list.subList(3, 10);
		System.out.println(subList);
		
		for(int i=0;i<subList.size();i++){    //对子集的操作就是对原集合的操作
			int num = subList.get(i)*10;
			subList.set(i, num);
		}
		System.out.println(subList);
		System.out.println(list);
		
		//删除一定范围的元素
		list.subList(2, 7).clear();
		System.out.println(list);
	}

}
