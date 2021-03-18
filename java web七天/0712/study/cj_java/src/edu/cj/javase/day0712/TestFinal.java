package edu.cj.javase.day0712;



/**
 * final:最终的 形容词  ——————用final修饰的属性我们称之为常量————在程序运行过程中
 * 始终保持不变的数据
 *  用final修饰的方法我们称之为终态的方法————不能被重写的
 *  用final修饰的类我们称之为终态的类————不能被继承的      
 * finally:最终地 副词——————出现在java中的异常捕捉机制中,不管发生或者没发生异常finally中的语句都会被执行
 * 
 * 定义常量的语法:
 *    public final 数据类型  常量名;
 *     常量名的命名规范: 所有单词全部大写,如果有多个单词那么每个单词间用"_"连接
 *     如:EXIT_ON_CLOSE  DARK_GRAY ....
 *     定义的常量一定要完成赋值,否则程序报错
 *     如何为对应的常量赋值?
 *       1.先声明、后赋值
 *          final double PI;
 *         在对应的构造方法中完成初始化 
 *       2.声明及初始化
 *        final double PI = 3.14; 
 *       3.如果对应的常量被static 修饰了，如下,那么就只能采用第二种声明及初始化的方式完成赋值
 *     public static final 数据类型  常量名 = 值;
 *     
 *     public static final三个关键字的顺序可以任意组合，组合如下:
 *     public static final
 *     public  final static
 *     static public  final
 *     static   final public
 *     final  public staic
 *     final staic public
 *
 *上述六种写法都正确
 *
 */
public class TestFinal {
	 final double PI;
	 final double GOLD_POINT = 0.618;
	 static final int MAX_NUM = 100 ;
  public static void main(String[] args) {
	  //new TestFinal().PI = 3.1415926;
   }
  public void show(){
	 // PI = 3.1415;
  }
  TestFinal(){
	  PI = 3.1415;
	//  MAX_NUM = 100;
  }
}
