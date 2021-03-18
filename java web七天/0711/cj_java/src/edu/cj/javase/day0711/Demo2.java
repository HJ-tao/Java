package edu.cj.javase.day0711;
/**
 * class——————类:指 的是拥有相同的外观特征(属性、域、成员变量、全局变量)以及相同的行为或功能的一类事物
 * class是java程序中一个基本结构
 * 设计一个类的三步骤:
 *   1.发现类  即这类事物叫什么名字 如 狗类  人类 ...,通过如下方式进行定义
 *      class  类名{
 *      
 *      }
 *    类名遵循pascal匈牙利命名法
 *    在一个java源文件中允许存在多个class，但是只能有一个class可以被public修饰,一旦被public修饰那么对应的
 *    源文件名就必须和对应的这个被public修饰的类的名字相同
 *    
 *   2.发现该类事物"有什么" ____外观特征 ，用名词表示  如  学生有学号、姓名、年龄等特征
 *   程序中用声明变量的方式表示,此时称它们为属性、域、成员变量、全局变量
 *   String  stuName;
 *   String stuSex;
 *   int stuAge;
 *   
 *   3.发现该类事物"做什么" ____拥有什么功能或者行为,在程序中一般用方法来表示
 *   如:
 *       void sayHi(){
 *       
 *       }
 * 
 * 类设计好之后如何使用？
 * 
 * 使用类需要通过类class去声明对应的对象Object，就如同去定义一个变量一样
 * 首先要确定变量的数据类型,之后再为变量起个变量名
 * 那么class类就是对象Object的数据类型
 * int num;  变量num的数据类型为 int
 * Student tom; 对象tom的数据类型为Student类型
 * 
 * 使用类的步骤!
 *   1.先声明 ,后实例化，最后赋值
 *   Student tom;
 *   通过new关键字实例化
 *   如下:
 *       tom = new Student();
 *       此时对应的tom对象在内存中就真的存在了
 *   接下来可以通过对象名以"."的方式去调用类中的属性和方法了
 *   如:
 *      tom.stuName = "张三";
 *      tom.sayHi();    
 *   
 *   可以一句话完成对象的实例化
 *     如  :
 *         类名   对象名 = new 类名();
 *    也可同时声明多个对象,中间用逗号隔开
 *      如:  Student tom ,lily;
 *      Student tom = new Student(),lily= new Student();
 *   
 *   说明:
 *       一个类class它是虚拟的(客观不存在的，存在于意识形态中),而对象则是指客观存在的、看得见、摸得着、可以感受得到的
 *       在世界上独一无二的。
 *          类是虚拟的，而对象是实际存在的
 *          类是模子,而对象由模子批量生成
 *      类的组成
 *         一个类可以由  属性  + 方法 构成
 *         说明！！！ 除了属性和方法外，类还可以由代码块block code构成——————{}   
 *         
 *         
 *    属性:(property)  ______  域 field  全局变量  成员变量，它是用来描述该类事物所拥有的外观特征，即有什么
 *    
 *    方法:（method）——————是用来独立实现某个具体的功能而编写的代码的集合的一种结构，形如:
 *    访问修饰符  [abstract][static] 返回类型  方法名(参数列表){
 *        具体的实现代码。。。。
 *        //如果该方法的返回值不为void那么一定要在方法体中的有效代码的最后一行加上return语句
 *        [return 语句];
 *    }   
 *    
 *         访问修饰符：
 *            1.public
 *            2.protected
 *            3.default or  friendly   默认的或者友好的
              4.private
              
      abstarct 是否是抽象的方法或者抽象的类，可以加上或者不加，加上表示该方法为抽象方法或者该类为抽象类 
      static 是否为类方法(静态方法)
      
      返回类型:即该方法被使用后可以返回给调用者什么类型的数据。对应的类型可以是Java中的8种基本数据类型,
      也可以是数组类型(8种基本的数据类型构成的数组，也可以是对象类型的数组)、enum枚举类型，
      ，还可以是引用(class或者接口)类型,不需要返回类型则声明为void即可
    
              方法名:即对实现该功能的代码块起一个有意义的名字,遵循驼峰命名法camel
       ()  :这个是方法的标志,就如同数组种的[]一样
       参数列表:如果在方法的"()"什么也没有表示该方法为无参方法,如果不为空则表示带了参数即有参方法
       有参方法中可以带1个或者多个参数,中间用逗号隔开即可,具体的如下:
          public  void show(){}  ___无参方法
          public  void show(String name,int age,char sex){}  ___有参方法   
   对应的参数列表中的数据类型可以是  Java中的8种基本数据类型,、enum枚举类型
      也可以是数组类型(8种基本的数据类型构成的数组，也可以是对象类型的数组)
      ，还可以是引用(class或者接口)类型 
      
           {}:表示的是实现对应功能的方法主体
          
          
 */

public class Demo2{
	  
}
class Student1 {
	 String  stuName;
	 String stuSex;
	 int stuAge;
	 void sayHi(){
		System.out.println(stuName+"同学在跟大家say hello!");        
	 }
	 public static void main(String[] args) {
		 Student1 tom = new Student1();
		 tom.stuName = "tom";
		 tom.sayHi();
		
		 
	}
	
}
