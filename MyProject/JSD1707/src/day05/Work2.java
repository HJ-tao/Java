package day05;

import java.util.Arrays;

public class Work2 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		System.out.print("数组中的数据为：");
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*100);
			System.out.print(arr[i]+"   ");
		}
		int min = arr[0];
		for(int i=1;i<arr.length;i++){
			if(min>arr[i]){
				min = arr[i];
			}
		}
		System.out.println("\n"+"数组的最小值为："+min);
		arr = Arrays.copyOf(arr, arr.length+1);
		int[] arr1 = new int[arr.length+1];
		System.arraycopy(arr, 0, arr1, 1, arr.length);
		/*int temp = 0;
		for(int i=arr.length-1;i>0;i--){
			temp = arr[i];
			arr[i] = arr[i-1];
			arr[i-1] = temp;
		}*/
		arr1[0] = min;
		System.out.print("新数组中的数据为：");
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+"\t");
		}
	}

}
