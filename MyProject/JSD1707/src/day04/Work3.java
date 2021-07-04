package day04;

import java.util.Arrays;
import java.util.Scanner;

public class Work3 {
	public static void main(String[] args) {
		/*for(int i=0,j=0,k=0;i<10&&j<4&&k<10;j+=2){
			System.out.println(i++);//0 1
			System.out.println(++k+i);//2 4
		}*/
		/*System.out.println("-----------------------");
		System.out.print("请输入查找质数的范围：2～");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count = 0;
		for(int i = 2;i<=number;i++){
			boolean flag = true;
			for(int j=2;j<=(int)Math.sqrt(i);j++){
				if(i%j == 0){
					flag = false;
				}
			}
			if(flag == true){
				System.out.print(i+"\t");
				count ++;
				if(count%10==0){
					System.out.println();
				}
			}
		}
		System.out.println();*/
		System.out.println("-----------------------");
		int []arr = new int[]{66,61,64,5,97,74,34,54,55};
		int []newArr = new int[10];
		int min = arr[0];
		for(int i = 1;i<arr.length;i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		newArr[0] = min;
		System.arraycopy(arr, 0, newArr, 1, 9);
		System.out.println(Arrays.toString(newArr));
	}
}
