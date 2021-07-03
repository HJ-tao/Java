package edu.cj.javase.day0710;

public class Demo5 {

	/**
	 * 循环结构:
	 *    重复执行的代码
	 * java中的循环分类:
	 *    1. while循环————当型循环即当满足某个条件的时候循环一直执行,如果对应的条件为假了则循环结束
	 *    语法:
	 *       循环变量;
	 *       while(循环条件){
	 *          循环操作的语句;
	 *          ....
	 *          改变循环变量的初始值;
	 *       } 
	 *       
	 *     注意!!! 在循环中有四个要素一个都不能少哦,当然四个要素可以缩写成三个
	 *     一般可以将第二个要素与第四个要素进行合并 
	 *     while循环的四要素:
	 *        1.初始化循环的变量——————即循环从哪里开始，一般用整型、布尔型、字符串等表达式来表示
	 *        如:   int i = 1; String ans = "yes" boolean flag = true;.....
	 *        2.循环条件——————即该循环结构执行的次数.它的值的类型为boolean类型，一般用关系表达式、逻辑表达式或者是boolean
	 *        类型的表达式  如  while(i<101)   while(flag)  while("yes".equals(ans))   
	 *        3.循环的操作语句——————即对应的循环体,重复执行的代码，可以是多条语句
	 *        4.改变循环变量的初始值来保证循环正常结束。如果没有改变循环变量的值那么循环就会变成死循环 
	 *        一般可以用循环次数的自增或者自减完成,如  i++ j--  或者重新为循环变量赋值   ans = "no" flag = false
	 *     注意!!!!
	 *     
	 *        while循环结构中的"()"后面一定不要加上了";"，加上了分好程序不会报错但整个循环的结构就被破坏了
	 *        就如同if结构的小括号()后面跟上了";"
	 *        加了";"后的if结构不再控制"{}"所对应的代码块了
	 *        while循环加了";"后不再控制"{}"所对应的代码块了
	 *        
	 *        加了";"后结构就变成了一个空的if接口或者一个空的while循环
	 *        如下：
	 *           if(条件);{语句。。。}
	 *           
	 *           等同于如下代码:
	 *              if(条件){空的语句块}
	 *              {
	 *                语句。。。
	 *              }
	 *              
	 *          while(条件);{循环语句。。。}   
	 *           等同于如下代码:
	 *           while(条件){}
	 *          
	 *           {
	 *           循环语句。。。
	 *           } 
	 *           
	 *           上述的讲解同样适用于for循环 不要随意的在 for循环的"()"后面加上";"
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
