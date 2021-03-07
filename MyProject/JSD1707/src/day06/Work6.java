package day06;

import java.util.Arrays;

public class Work6 {

	public static void main(String[] args) {
		int []num = generateArray(5,100);
		System.out.println(Arrays.toString(num));
	}
	
	public static int[] generateArray(int len,int maxfiled){
		int[] arr = new int[len];
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*maxfiled);
		}
		return arr;
	}

}
