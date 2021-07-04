package edu.cj.javase.day0712.work;

public class TestRandom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 0;i<50;i++){
		//double num = Math.random();
		//System.out.println(num);
		
		//double num1 = num*10;
		//System.out.println(num1);
		
		int num2 = (int)(Math.random()*101);
		System.out.print(num2+"  ");
		}
	}

}
