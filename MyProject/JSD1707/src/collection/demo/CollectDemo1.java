package collection.demo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection
 * 闆嗗悎 
 * Collection鏄墍鏈夐泦鍚堢殑椤剁骇鐖舵帴鍙�
 * 涓や釜瀛愭帴鍙ｏ細
 * java.util.List:鍙噸澶嶉泦涓旀湁搴�
 * java.util.Set:涓嶅彲閲嶅闆�
 * 鍏冪礌鏄惁閲嶅鏄緷闈爀quals姣旇緝鐨勭粨鏋� 
 * 
 * 
 * int size()
 * 杩斿洖褰撳墠闆嗗悎鐨勫厓绱犱釜鏁�
 * boolean isEmpty()
 * 鍒ゆ柇褰撳墠闆嗗悎鏄惁娌℃湁鍏冪礌
 * void clear()
 * 娓呯┖闆嗗悎
 * boolean contains(E e)
 * 鍒ゆ柇闆嗗悎鏄惁鍖呭惈缁欏畾鍏冪礌(鐢ㄤ簬鍒ゆ柇缁欏畾鍏冪礌涓庨泦鍚堢幇鏈夊厓绱犳槸鍚︽湁equals姣旇緝涓簍rue)
 */
public class CollectDemo1 {

	public static void main(String[] args) {
		Collection c = new ArrayList<String>();
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
