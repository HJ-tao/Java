package collection.other;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 双端队列java.util.Deque
 * 两端都可以进出队的队列
 * Deque继承自Queue
 * 
 * 栈
 * 通常使用栈来完成"后退"效果
 */

public class Deque_Demo {

	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();
		deque.offer("one");   //从右边插入
		deque.offer("two");
		System.out.println(deque);
		deque.offerFirst("three");  //从左边插入
		System.out.println(deque);
		deque.offerLast("four");   //从右边插入
		System.out.println(deque);
		
		String str = deque.poll();  //从左边出队列
		System.out.println(str);
		System.out.println(deque);
		
		str = deque.pollFirst();   //从左边出队列
		System.out.println(str);
		System.out.println(deque);
		
		str = deque.pollLast();  //从右边出队列
		System.out.println(str);
		System.out.println(deque);
		/*
		 * 双端队列为栈提供了相应的出入栈方法push,pop
		 */
		Deque<String> stack = new LinkedList<String>();
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		stack.push("five");
		
		System.out.println(stack);
		str = stack.pop();
		System.out.println(str);
		System.out.println(stack);
	}

}
