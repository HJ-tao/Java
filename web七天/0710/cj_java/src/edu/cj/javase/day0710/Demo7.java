package edu.cj.javase.day0710;

public class Demo7 {

	/**
	 * 循环结构:
	 *    重复执行的代码
	 * java中的循环分类:
	 *    2. do-while循环————直到型循环即循环先执行直到循环条件为假就停止(不管循环条件为真还是为假循环至少执行一次)
	 *    典型的可以理解为 先执行 、后判断  先上车 后买票  
	 *    而while循环是 先判断 后执行 (如果循环条件为假则循环一次都不执行)
	 *    语法:
	 *       循环变量;
	 *       do{
	 *          循环操作的语句;
	 *          ....
	 *          改变循环变量的初始值;
	 *       } while(循环条件);
	 *       
	 *     注意!!! 此时的分号一定不能省略
	 *     在循环中有四个要素一个都不能少哦,当然四个要素可以缩写成三个
	 *     一般可以将第二个要素与第四个要素进行合并 
	 *     do-while循环的四要素:
	 *        1.初始化循环的变量——————即循环从哪里开始，一般用整型、布尔型、字符串等表达式来表示
	 *        如:   int i = 1; String ans = "yes" boolean flag = true;.....
	 *        
	 *        3.循环的操作语句——————即对应的循环体,重复执行的代码，可以是多条语句
	 *        4.改变循环变量的初始值来保证循环正常结束。如果没有改变循环变量的值那么循环就会变成死循环 
	 *       
	 *        2.循环条件——————即该循环结构执行的次数.它的值的类型为boolean类型，一般用关系表达式、逻辑表达式或者是boolean
	 *        类型的表达式  如  while(i<101)   while(flag)  while("yes".equals(ans))  
	 *        一般可以用循环次数的自增或者自减完成,如  i++ j--  或者重新为循环变量赋值   ans = "no" flag = false
	 *     
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
