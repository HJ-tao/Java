package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection
 * 集合框架
 * 集合用来存储一组元素,与数组功能相似.
 * 集合提供了一套百年与操作元素的方法,所以使用起来毕数组方便.
 * Collection是所有集合的顶级接口,定义了所有集合都应当具备的方法.
 * 其下有两个常见的子接口:
 * java.util.List：可重复集,且有序.特点是可以通过下标操作元素.
 * java.util.Set:不可重复集,元素是否重复是根据元素自身equals比较的结果判断
 * @author soft01
 *
 */
public class CollectionDeom1 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		/*
		 * boolean add(E e)
		 * 将给定元素添加到当前集合中.添加成功则返回true
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		System.out.println(c);
		
		/*
		 * int size()
		 * 返回当前集合的元素个数
		 */
		int size = c.size();
		System.out.println("size:"+size);
		/*
		 * boolean isEmpty()
		 * 判断当前集合是否为空即,即:不含有任何元素.
		 */
		boolean isEmpty = c.isEmpty();
		System.out.println("isEmpty:"+isEmpty);
		/*
		 * void clear()
		 * 清空当前集合
		 */
		c.clear();
		System.out.println("集合已清空!");
		System.out.println(c);
		System.out.println("size:"+c.size());
		System.out.println("isEmpty:"+c.isEmpty());
	}

}
