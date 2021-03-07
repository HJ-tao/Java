package day05;

import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) {
		/*for(int j=2;j<=20;j++){
			boolean flag = true;
			for(int i=2;i<j;i++){
				if(j%i==0){
					flag = false;
					break;
				}
			}
			if(flag == true){
				System.out.println(j+"是质数.");
			}else{
				System.out.println(j+"不是质数.");
			}
		}*/
		System.out.print("请输入查找质数的范围：2～");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count = 0;//计数器
		for(int i = 2;i<=number;i++){
			boolean flag = true;//开关
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j == 0){
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.print(i+"\t");
				count ++;
				if(count%10==0){
					System.out.println();
				}
			}
		}
		System.out.println("\n共有"+count+"个质数");
		sc.close();
	}
}
