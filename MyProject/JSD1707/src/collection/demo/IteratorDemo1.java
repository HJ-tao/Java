package collection.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Iterator迭代器
 * 用来遍历集合元素的
 * Collection提供了用于遍历集合元素的迭代器方法Iterator iterator()
 * Iterator是一个接口，规定了遍历集合的相关方法
 * 不同的集合实现类都提供了一个可以遍历自身的迭代器实现类
 * 
 * 使用迭代器遍历集合遵循步骤：
 *   问，取，删(不是必要操作)
 * 
 * boolean hasNext()判断集合是否还有元素可以取出
 * E next()  通过迭代器获取集合下一个元素
 * 
 * 泛型 
 * 泛型又称为为参数化类型，是将一个类中属性的类型，方法参数的
 * 类型，方法返回值的类型的定义权交给了使用者.使用者在实例化当
 * 前类实例时传入实际类型.
 * 泛型的原型就是Object
 * 泛型是编译器认可,它会检查泛型实参的类型是否符合泛型指定的类型.
 * 当获取一个泛型数据时,编译器也会自动添加类型转换.
 * 
 * @author soft01
 *
 */
public class IteratorDemo1 {

	public static void main(String[] args) {
		Point<Integer> p1 = new Point<Integer>(1,3);
		p1.setX(2);
		int x = p1.getX();
		
		Point p2 = p1;
		p2.setX("二");
		String m = (String)p2.getX();
		
		//类造型异常
		int x1 = p1.getX();
		System.out.println(x1);
		
		/*Collection c = new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		
		Iterator it = c.iterator();
		while(it.hasNext()){  //问还有没有
			String str = (String)it.next(); //取出数据，最好数据类型一样，取出时方便设置变量类型
			System.out.println(str);
			if("#".equals(str)){
//				c.remove(str);
				
				 * 迭代器的remove方法会将刚通过next方法获取的元素
				 * 从集合中删除.
				 * 注意，在迭代器遍历集合的过程中不要通过集合的方法
				 * 增删元素，否则抛出异常.
				 * 
				 
				it.remove();
			}
		}
		System.out.println(c);*/
	}

}
