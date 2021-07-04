package edu.cj.javase.day0710;



public class Demo6 {

	/**
	 * Array:用来存储连续的数据类型相同的且具有固定长度的这么一个结构
	 * 特点:
	 *     1.连续存储
	 *     2.数据类型相同
	 *     3.固定长度
	 *    数组根据维度可以分为一维数组、二维数组以及多维数组 
	 *     一维数组的语法:
	 *     1.先声明后分配空间再赋值
	 *         1.1  数据类型 [] 数组名 ;
	 *         1.2  数据类型  数组名[] ;   
	 *         数组名 = new 数据类型[长度];
	 *         
	 *         数组名[下标或者索引] = 值;
	 *         注意!数组中的下标或者索引是从0开始的,最后一个元素的下标或者索引为数组长度-1 表达式为 数组名.length-1
	 *     2.声明即分配空间再赋值
	 *     数据类型 [] 数组名  = new 数据类型[长度];
	 *     数据类型  数组名[]  = new 数据类型[长度];
	 *     数组名[下标或者索引] = 值;
	 *     
	 *     3.声明数组的同时完成赋值
	 *     数据类型 [] 数组名  = new 数据类型[]{值1,值2,...,值n};
	 *     数据类型  数组名[]  = new 数据类型[]{值1,值2,...,值n};
	 *     注意!!!此时数组的长度由具体的值的个数来确定,一定不要显示的加上数组长度
	 *     如下就是错误的
	 *        int[] nums = new int[3]{1,2,3}; 此时的长度3不需要显示给定
	 *     4. 声明数组的同时完成赋值
	 *       数据类型 [] 数组名  = {值1,值2,...,值n};
	 *     数据类型  数组名[]  = {值1,值2,...,值n};
	 *     此时声明数组只能用一条语句完成,不能分割成两条即先声明后赋值的方式
	 *     
	 *     数组一经定义后都有对应的默认值:
	 *       1.对于数字类型的数组,其默认值为0或者0.0
	 *       2.对于字符类型的数组,其默认值为空字符
	 *       3.对于布尔类型的数组,其默认值为false
	 *       4.对于其他的对象类型的数组,其默认值null
	 *       
	 *       java.util包中提供了一个数组类Arrays.它封装了很多处理数组的方法
	 *       如 : sort()
	 *       
	 *       在java JDK5.0中新增了增强型的for循环
	 *       、习惯性的称其为foreach循环
	 *       语法:
	 *          for(数据类型 变量或者对象名 : 数组或者集合){
	 *             直接操作变量或者对象名即可
	 *          }
	 *       
	 */
	public static void main(String[] args) {
		//int[]nums = new int[5];
		//float[]nums = new float[5];
		//char[]nums = new char[5];
		//boolean[]nums = new boolean[5];
		//String[]nums = new String[5];
		//Student[]nums = new Student[5];
		int [] nums = {4,7,1,0,9};
		/*System.out.println("排序前.............."+Arrays.toString(nums));
		System.out.println("排序中..............");
		Arrays.sort(nums);
		System.out.println("排序后.............."+Arrays.toString(nums));
*/
		 System.out.println("普通的for循环遍历数组元素....");
		 for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+"   ");
		}
		 System.out.println();
		 System.out.println("增强型for循环遍历数组元素....");
		 for (int num:nums) {
			 if(num%2==0){
				 System.out.print(num+"   ");
				 break;
			 }
		}
	}

}
class Student{
	
	
}
