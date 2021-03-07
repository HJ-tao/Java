package day02;
//通过数组存放随机产生的随机数，并排序之后打印出数组
import java.util.Arrays;

public class demo2 {
	public static void main(String[] args) {
		int []numbers = new int[10];
		int t = 0;
		for(int i = 0;i<numbers.length;i++){
			numbers[i] = (int)(Math.random()*101); 
		}
		for(int i = 0;i<numbers.length-1;i++){
			for(int j = i;j<numbers.length;j++){
				if(numbers[i]>numbers[j]){
					t = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = t;
				}
			}
		}
		System.out.println("排序后的数组为："+Arrays.toString(numbers));
	}
}
