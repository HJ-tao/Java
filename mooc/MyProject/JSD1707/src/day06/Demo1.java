package day06;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		int[] s1 = new int[10];
		int[] s2 = new int[20];
		for(int i=0;i<s1.length;i++){
			s1[i]=(int)(Math.random()*100);
		}
		System.arraycopy(s1, 0, s2, 10, s1.length);//实现数组的复制
		System.out.println(Arrays.toString(s2));
		s2 = Arrays.copyOf(s2, s2.length+1);
		System.out.println(Arrays.toString(s2));//实现扩容
	}

}
