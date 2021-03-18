package edu.cj.javase.day0711.work;

import java.util.Scanner;

public class Student {
    String stuName; //学生的名字
    String schoolName; //学校名字
    
    public void useCalculator(){
    	//拿到计算器对象后就可以使用计算器计算了
    	Calculator cal = new Calculator(); //获得计算器对象的实例
    	cal.brand = "联想";
    	cal.type = "T100";
    	System.out.println(schoolName+"学校的"+stuName+"同学开启了品牌为"+cal.brand+",型号为"+cal.type+"的超级计算器在计算......");
    	Scanner sc = new Scanner(System.in);
    	System.out.print("请输入第一个数:");
    	cal.num1 = sc.nextInt();
    	System.out.print("请输入运算符号: + - * / ");
    	char op = sc.next().charAt(0);
    	System.out.print("请输入第二个数:");
    	cal.num2 = sc.nextInt();
    	int result = 0;
    	switch (op) {
		case '+':
			result = cal.add();
			break;
		case '-':
			result = cal.minus();
			break;
		case '*':
			result = cal.multi();
			break;
		case '/':
			result = cal.divide();
			break;
		default:
			break;
		}
    	System.out.printf("%d %c %d = %d\n",cal.num1,op,cal.num2,result);
    }
}
