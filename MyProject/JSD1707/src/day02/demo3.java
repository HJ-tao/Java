package day02;
//冒泡排序法

import java.util.Arrays;

public class demo3 {
	public static void main(String []args){
		int []array = new int[]{10,30,18,96,70,43,42,2,77,9};
		int temp = 0;
		for(int i = 0;i<array.length-1;i++){
			for(int j = 0;j<array.length-1-i;j++){
				if(array[j]>array[j+1]){
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			System.out.println("第"+(i+1)+"次排序结果为："+Arrays.toString(array));
		}
		
	}
}
