package edu.cj.javase.day0710;

public class Demo3 {
	/*
	 * 变量:在程序运行过程中发生变化的量
	 * 常量:在程序运行过程中保持不变的量  圆周率  黄金分割点  
	 * 
	 * 声明变量的语法:
	 *  1.先声明,后赋值
	 *    数据类型 dataType   变量名;    如 int score;
	 *    变量名 = 值;                    score = 90;
	 *  2.声明即初始化(将上述两个表达式合二为一即可)
	 *   数据类型 dataType   变量名 = 值;
	 *   
	 *  3.声明多个类型相同的数据
	 *   数据类型 dataType 变量名1,变量名2,...变量名n; 
	 *   
	 *  4. 声明多个类型相同的数据并初始化
	 *   数据类型 dataType 变量名1 = 值1,变量名2 = 值2,...变量名n = 值n;
	 * 
	 * 注意!!!变量名称遵循驼峰命名法,起的名字要有意义
	 * 运算符:
	 *    1.赋值运算符 ____  =   将等号右边的值赋给左边的变量 右结合性
	 *    2.算术运算符
	 *         2.1 一元算术运算符   ++  -- 自增或者自减  可以在变量前或者变量后
	 *            如   ++num1; num2--
	 *            说明:++或者--在前的时候执行流程为: 自身先加1或者减1，然后将计算的结果再赋值给引用它们的变量
	 *                ++或者--在后的时候执行流程为: 先将自身的结果赋值给引用它们的变量，然后自身再加1或者减1
	 *                
	 *         2.2 二元算术运算符    +  - * /  % 
	 *         
	 *         2.3 三元算术运算符   （也就是常用的问号表达式 ）
	 *            语法:
	 *               表达式1 = 表达式 2 ? 表达式 3 : 表达式 4
	 *            注意！！！表达式 2的值一定是一个boolean类型的数据,如果表达式 2的值为true就将表达式 3的值赋给表达式1
	 *            否则就将表达式 4的值赋给表达式1.所以该结果的功效等同于一个简单的if-else结构
	 *            如下:
	 *                if(表达式 2){
	 *                   表达式1 = 表达式 3
	 *                }else
	 *                {
	 *                   表达式1 = 表达式 4
	 *                }
	 *      3.关系运算符(比较运算符):
	 *            > < >= <= != ==
	 *      4.逻辑运算符:
	 *           4.1  && ____逻辑与   当两个及两个以上的条件同时为真的时候整个表达式为真,如果有一个为假则整个表达式为假
	 *           4.2  ||_____逻辑或    当两个及两个以上的条件中有一个为真的时候整个表达式为真,如果全部为假则整个表达式为假   
	 *           4.3  !——————逻辑取反 逻辑非  即非真即为假 非假即为真   !false = true 
	 *           
	 *                      
	 *      五种条件分支结构:
	 *         1. 简单的if结构  
	 *         
	 *                语法:
	 *                   if(表达式){
	 *                   
	 *                   }
	 *         2.  简单的if-else结构 
	 *             if(表达式){
	 *             
	 *             }else{
	 *             
	 *             }         
	 *         3.多重的if-else结构 
	 *            if(条件1){
	 *            
	 *            }else if(条件2){
	 *            
	 *            }    
	 *            ...条件n
	 *            else{
	 *            
	 *            }    
	 *            最后的else可以省略
	 *            
	 *       4.嵌套的if-else结构
	 *          if(条件1){
	 *              if(条件2){      
	 *                if(条件3){
	 *                    。。。。条件n
	 *                    ...
	 *                 } else{}   
	 *             } else{}    
	 *          
	 *          } else{}
	 *          
	 *      5.等值判断结构
	 *         switch(条件){
	 *             case 常量1:
	 *                   语句;
	 *                   break;
	 *              case 常量2:
	 *                   语句;
	 *                   break;
	 *              .....
	 *              case 常量n:
	 *                   语句;
	 *                   break;
	 *              default:
	 *                     语句;
	 *                     break;          
	 *         
	 *         }   
	 *         
	 *      从键盘输入数据  用到java.util.Scanner类
	 *        Scanner sc = new Scanner(System.in);
	 *        sc.nextInt()\float\double\byte。。。
	 *      
	 */
    public static void main(String[] args) {
		//int stuScore = 90;
    	int num1 = 5,num2 = 3;
    	int num3 = ++num1;
    	int num4 = --num2;
    	/*
    	 * 在JDK5.0中java工程师们充分考虑到了C语言的fans们对C的热爱,特别的增加了
    	 * 类似C语言中的printf()方法
    	 * 语法:
    	 *     printf("格式化字符串",变量或者表达式（有多个用逗号隔开）....);
    	 *     如；
    	 *       printf("%d,%f",20,34.5);  输出结果为:  20,34.5
    	 * 此时的%d或者%f表示格式化字符串所对应的占位符
    	 * 常用的如下:
    	 *    %d: 对应的整型数据   byte short int long
    	 *    %c: char
    	 *    %f  float double
    	 *    %b  boolean
    	 *    %s  String
    	 *    
    	 * 
    	 */
    	System.out.printf("num1=%d,num2=%d,num3=%d,num4=%d",num1,num2,num3,num4);
	}
}
