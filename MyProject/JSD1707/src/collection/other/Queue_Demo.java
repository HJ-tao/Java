package collection.other;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue
 * 队列也可以存储一组元素,但是对于存取元素要求必须从两端进行.
 * 队列存取元素要求:先进先出
 * @author soft01
 *
 */

public class Queue_Demo {

	public static void main(String[] args) {
		/*
		 * java.util.LinkedList也是队列的实现类
		 * 因为LinkedList可以存一组元素,并且由于链表的特性,首尾增删元素效果好
		 * 所以也满足队列的特点.于是java就让LinkedList也实现了队列接口.
		 */
		Queue<String> queue = new LinkedList<String>();
        /*
         * boolean offer(E e)
         * 入队操作,向队列末尾追加给定元素
         * 元素入队成功则返回true
         */
		queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        queue.offer("forth");
        queue.offer("fifth");
        System.out.println(queue);
        /*
         * E poll()
         * 出队操作
         */
        String str = queue.poll();
        System.out.println(str);
        System.out.println(queue);
        
        /*
         * E peek()
         * 引用队首元素,获取队首元素,但该元素不做出队操作
         */
        
        str = queue.peek();
        System.out.println(str);
        System.out.println(queue);
        
        for(String s:queue){
        	System.out.println(s);
        }
        System.out.println(queue);
        
        /*
         * 自行遍历的形式,那么队列的遍历是一次性的
         */
        while(queue.size()>0){
        	str = queue.poll();
        	System.out.println(str);
        }
        System.out.println("while循环:"+queue);
        
        for(int i=queue.size();i>0;i++){
        	str = queue.poll();
        	System.out.println(str);
        }
        System.out.println("for循环倒序:"+queue);
        
        for(int i=0;i<queue.size();i++){
        	str = queue.poll();
        	System.out.println(str);
        }
        System.out.println("for循环正序:"+queue);
	}

}
