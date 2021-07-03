package day06;

import java.util.Arrays;


public class MethodDraft {

	public static void main(String[] args) {
		System.out.println(generate(10));
		/*say();
		sayHi("you");
		System.out.println(getNum());
		int a=3,b=5;
		System.out.println(plus(a,b));*/
		/*int[] num = {32,342,44,22,37,0,57,6};
		Arrays.sort(num);
		
		for(int i=0;i<num.length;i++){
			num[i] = random(10);
		}
		System.out.println(Arrays.toString(num));*/
	}
	
	
	/*public static int random(int a,int b){
		int rd = (int)(Math.random()*(b-a+1)+a);
		return rd;
	}
	
	public static int random(int a){
		int rd = (int)(Math.random()*a);
		return rd;
	}*/
	
	public static void say(){
		System.out.println(111);
	}
	
	public static void sayHi(String name){
		System.out.println(111+name);
	}
	
	public static double getNum(){
		return 88.8;
	}
	
	public static int plus(int num1,int num2){
		return num1+num2;
	}
	
	public static char[] generate(int len){
		char[] chs = new char[len];
		boolean[] flags = new boolean[100];
		for(int i=0;i<chs.length;i++){
			int index;
			do{
				index = (int)(Math.random()*26+65);
			}while(flags[index]);
			chs[i] = (char)index;
			flags[index] = true;
		}
		return chs;
	}

}
