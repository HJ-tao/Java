package day05;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOfArray {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*100);
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		System.out.println("------------------------------------------");
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		System.out.println("------------------------------------------");
		int max = arr[0];
		int index = 0;
		for(int i=1;i<arr.length;++i){
			if(arr[i]>max){
				max = arr[i];
				index = i;
			}
		}
		System.out.println("最大值为："+max+",下标为"+index);
		System.out.println("------------------------------------------");
		Scanner sc = new Scanner(System.in);
		String result = sc.nextLine();
		System.out.println(result);
		System.out.println("\n"+"------------------------------------------");
		arr = Arrays.copyOf(arr, arr.length+1);
		arr[arr.length - 1] = max;
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
}
