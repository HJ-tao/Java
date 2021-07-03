package day04;

public class WhileDemo {

	public static void main(String[] args) {
		//输出行动是成功的阶梯
		System.out.println("--------------------------------------");
		int times = 1;
		while(times <= 10){
			System.out.println("行动是成功的阶梯");
			times++;
		}
		/*
		 *           times=1
		 *true 输出  times=2
		 *true 输出  times=3
		 *true 输出  times=4
		 *true 输出  times=5
		 *true 输出  times=6
		 *true 输出  times=7
		 *true 输出  times=8
		 *true 输出  times=9
		 *true 输出  times=10
		 *true 输出  times=11
		 *false
		 */
		//正序：1-9
		System.out.println("--------------------------------------");
		int num1 = 1;
		while(num1<10){
			System.out.println(num1+"*9="+num1*9);
			num1++;
		}
		//倒序：9-1
		System.out.println("--------------------------------------");
		int num2 = 9;
		while(num2>0){
			System.out.println(num2+"*9="+num2*9);
			num2--;
		}
		//奇数1，3，5，7，9
		System.out.println("--------------------------------------");
		int num3 = 1;
		while(num3<10){
			System.out.println(num3+"*9="+num3*9);
			num3+=2;
		}
	}
}
