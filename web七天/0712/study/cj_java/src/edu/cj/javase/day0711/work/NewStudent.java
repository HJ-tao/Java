package edu.cj.javase.day0711.work;

import java.util.Scanner;

public class NewStudent {
    String stuName; //学生的名字
    String schoolName; //学校名字
    
    //此时的NewCalculator cal为形式参数
    public void useCalculator(NewCalculator cal){
    	//拿到计算器对象后就可以使用计算器计算了
    
    	cal.brand = "联想";
    	cal.type = "T100";
    	System.out.println(schoolName+"学校的"+stuName+"同学开启了品牌为"+cal.brand+",型号为"+cal.type+"的超级计算器在计算......");
    	Scanner sc = new Scanner(System.in);
    	System.out.print("请输入第一个数:");
    	int num1 = sc.nextInt();
    	System.out.print("请输入运算符号: + - * / ");
    	char op = sc.next().charAt(0);
    	System.out.print("请输入第二个数:");
    	int num2 = sc.nextInt();
    	//此时传入的num1,num2,op称之为实际参数,简称实参，实参列表的类型、顺序、个数一定和形式参数列表的类型、顺序、个数严格一致（相同）
    	int result = cal.cal(num1, op, num2);
    	
    	System.out.printf("%d %c %d = %d\n",num1,op,num2,result);
    }
}
