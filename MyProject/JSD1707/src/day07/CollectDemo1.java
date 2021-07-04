package day07;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection
 * 集合 
 * Collection是所有几个的顶级父接口
 * 两个子接口：
 * java.util.List:可重复集且有序
 * java.util.Set:不可重复集
 * 元素是否重复是依靠equals比较的结果 
 * 
 * 
 * int size()
 * 返回当前集合的元素个数
 * boolean isEmpty()
 * 判断当前集合是否没有元素
 * void clear()
 * 清空集合
 * boolean contains(E e)
 * 判断集合是否包含给定元素(用于判断给定元素与集合现有元素是否有equals比较为true)
 */
public class CollectDemo1 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("two");
		System.out.println(c);
		
		int size = c.size();
		System.out.println(size);
		
		System.out.println(c.isEmpty());
		c.clear();
		System.out.println(c.isEmpty());
	}

}
