package day02;
//随机产生数放到数组中，将数组的最大值放在最后一位
import java.util.Arrays;
import java.util.Random;

public class demo4 {
	public static void main(String []args){
		Random r = new Random();
		int max = 0;
		int []string = new int[10];
		for(int i = 0;i < string.length;i++){
			string[i] = r.nextInt(100);
		}
		for(int i = 0;i<string.length;i++){
			if(string[i]>max){
				max = string[i]; 
			}
		}	
		int []newString = Arrays.copyOf(string, string.length+1);
		newString[string.length] = max;
		System.out.println("最终数组为："+Arrays.toString(newString));
	}
}
