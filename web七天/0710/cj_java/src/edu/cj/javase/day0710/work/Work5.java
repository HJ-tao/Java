package edu.cj.javase.day0710.work;

public class Work5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 123456; //第一要素
		int digit = 0; //用来存取对应位数上的数字
		while (num!=0) //第二要素 
		{
			//第三要素
			digit = num%10;
			System.out.print(digit+ " ");
			//改变循环变量的初始值 即对应的第四要素
			num = num/10;
		}

	}

}
