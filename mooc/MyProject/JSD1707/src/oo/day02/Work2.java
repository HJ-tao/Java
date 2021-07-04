package oo.day02;

import java.util.Arrays;

public class Work2 {

	public static void main(String[] args) {
		int[] nums = {12,1,3,23,34,47,12,78};
		int[] results = remove(nums,0);
		System.out.println("实现删除操作之后："+Arrays.toString(results));
	}

	public static int[] remove(int[] ary,int index){
		int[] temp=new int[ary.length-1];
		if(index!=0){
			System.arraycopy(ary, 0, temp, 0, index);
			System.arraycopy(ary, index+1, temp, index, ary.length-index-1);
		}else{
			System.arraycopy(ary, 1, temp, 0, ary.length-1);
		}
		return temp;
		
	}
}
