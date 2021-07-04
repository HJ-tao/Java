package day05;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		/*int[] arr = new int[10];
		int[] arr1 = {2,5,8,9};
		int[] arr2 = new int[]{2,5,8,9};
		int[] arr3 = new int[3];
		System.out.println(arr3.length);
		arr3[0] = 100;
		arr3[1] = 200;
		arr3[2] = 300;
//		arr3[3] = 400;//下标越界异常java.lang.ArrayIndexOutOfBoundsException: 3
		System.out.println(arr3[arr3.length-1]);
		long[] arrs = new long[1000000];
		long interval = 0;
		for(int i = 0;i<arrs.length;i++){
			arrs[i] = (int)(Math.random()*10000000);
		}
		long a = System.currentTimeMillis();
		Arrays.sort(arrs);
		long b = System.currentTimeMillis();
		interval = b - a;
		System.out.println("时间间隔为："+interval);*/
//		for(int i=1;i<10;i++){
//			for(int j=1;j<i+1;j++){
//				System.out.print(i+"*"+j+"="+i*j+"\t");
//			}
//			System.out.println();
//		}
		int[] arr1 = new int[10];
		for(int i=0;i<arr1.length;i++){
			arr1[i] = (int)(Math.random()*100);
		}
		int max = arr1[0];
		for(int i=1;i<arr1.length;i++){
			if(max<arr1[i]){
				max = arr1[i];
			}
		}
		int[] arr2 = new int[11];
		System.arraycopy(arr1,0,arr2,0,10);
		arr2[arr2.length-1] = max;
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+"\t");
		}
		
		
		
		//数组的初始化
		/*int[] arr = new int[10];
		int[] arr1 = {1,4,6,8};
		int[] arr2 = new int[]{1,4,6,7};
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*100); 
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
		}*/
		
	}

}
