package edu.cj.javase.day0710.work;

public class Work6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 1; //第一要素  
		int num1 = 1;
		int num2 = 1;
		System.out.print(num1+" "+num2+" ");
		while(i<=18)//第二要素  
		{
			//第三要素  
			int num3 = num1 + num2;
			System.out.print(num3+" ");
			//将num2的值交还给num1,然后将num3的值交还给num2
			num1 = num2; 
			num2 = num3;
			i++;
		}

	}

}
