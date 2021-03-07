package day06;

import java.util.Scanner;

public class MethodDemo {

	public static void main(String[] args) {
		//sayHi();//编译错误，需要加实参
		System.out.println("---------------------");
		System.out.println("---------存款--------");
		System.out.println("---------取款--------");
		System.out.println("---------贷款--------");
		System.out.println("---------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入操作：");
		String input = sc.nextLine();
		switch(input){
		case "取款":
			System.out.println("请输入取款金额:");
			double out = sc.nextDouble();
			withDraw(out);
			break;
		case "存款":
			System.out.println("请输入存款金额:");
			double in = sc.nextDouble();
			deposit(in);
			break;
		case "贷款":
			System.out.println("请输入贷款金额:");
			double debt = sc.nextDouble();
			loan(debt);
			break;
		}
	}
	
	public static void withDraw(double money){
		System.out.println("已经成功取出金额："+money);
	}
	
	public static void deposit(double money){
		System.out.println("已经成功存入金额："+money);
	}
	
	public static void loan(double money){
		System.out.println("已经贷款金额："+money);
	}
	
	public static double getNum(){
		//return;  //编译错误，必须返回一个值
		//return "Hi";  //编译错误，返回值类型不匹配
		return 8.88;    //1) 结束方法的执行   2)返回结果给调用方法
	}
	
	//有参无返回值
	public static void sayHi(String name){
		System.out.println("大家好，我是"+name);
	}
	
	//无参无返回值
	public static void say(){
		System.out.println("大家好,我叫WKJ");
	}

}
