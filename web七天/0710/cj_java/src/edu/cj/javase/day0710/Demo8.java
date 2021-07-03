package edu.cj.javase.day0710;

public class Demo8 {

	/**
	 * 循环结构:
	 *    重复执行的代码
	 * java中的循环分类:
	 *    1. for循环————次数型循环即循环的次数在确定的情况优先使用for
	 *    原因是for循环的结构简单明了
	 *  
	 *    语法:
	 *       
	 *       for(循环变量;循环条件;改变循环变量的初始值){
	 *          循环操作的语句;
	 *       
	 *       } 
	 *       
	 *     注意!!! 在循环中有四个要素一个都不能少哦,当然四个要素可以缩写成三个
	 *     一般可以将第二个要素与第四个要素进行合并 
	 *     while、for循环的四要素:
	 *        1.初始化循环的变量——————即循环从哪里开始，一般用整型、布尔型、字符串等表达式来表示
	 *        如:   int i = 1; String ans = "yes" boolean flag = true;.....
	 *        2.循环条件——————即该循环结构执行的次数.它的值的类型为boolean类型，一般用关系表达式、逻辑表达式或者是boolean
	 *        类型的表达式  如  while(i<101)   while(flag)  while("yes".equals(ans))   
	 *        3.循环的操作语句——————即对应的循环体,重复执行的代码，可以是多条语句
	 *        4.改变循环变量的初始值来保证循环正常结束。如果没有改变循环变量的值那么循环就会变成死循环 
	 *        一般可以用循环次数的自增或者自减完成,如  i++ j--  或者重新为循环变量赋值   ans = "no" flag = false
	 *       
	 *       
	 *       说明:
	 *          while、for两种循环的执行流程相同 1-->2-->3-->4-->2--->3-->4 ...
	 *          do-while 执行流程 1--4--3--2--4--3--2  ....
	 *          
	 */
	public static void main(String[] args) {
		/*if(5<3);
		{
			System.out.println(5>3);
		}*/
		
		int i = 1;
		int sum = 0;
		while(i<101);	
		{
			
			sum += i;
			i++;
		}
       System.out.println(sum);
	}

}
