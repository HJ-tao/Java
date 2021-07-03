package day04;
/*
 * 通过对循环变量guess的操作实现只有猜对正确数字或者输入数字0才会退出循环，然后在循环体
 * 外部通过判断分支语句得到对应输出语句
 */
import java.util.Scanner;

public class Guessing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*1000+1);
		System.out.println(num);
		int guess;
		do{
			System.out.println("猜吧！");
			guess = sc.nextInt();
			if(guess == 0){
				break;
			}
			if(guess>num){
				System.out.println("太大了");
			}else if(guess<num){
				System.out.println("太小了");
			}
		}while(guess!=num);
		if (guess == num) {
			System.out.println("恭喜你，猜对了！");
		}else{
			System.out.println("下次再来吧！");
		}
		
		
		
		/*System.out.println("猜吧！");
		int guess = sc.nextInt();
		while(guess!=num){
			if(guess == 0){
				break;
			}
			if(guess>num){
				System.out.println("太大了");
			}else{
				System.out.println("太小了");
			}
			
			System.out.println("猜吧！");
			guess = sc.nextInt();
		}
		if (guess == num) {
			System.out.println("恭喜你，猜对了！");
		}else{
			System.out.println("下次再来吧！");
		}*/
		sc.close();
	}

}
