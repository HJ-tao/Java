package edu.cj.javase.day0712;

public class TestArray1 {

	/**
	 * 
	 */
	public static void main(String[] args) {
		TestArray1 ta = new TestArray1();
		/*int num1 = 5;
		int num2 = 3;
		int num3 = 2;
		//num1,num2为实参
		int result = add(num1, num2,num3);*/
		/*int[]arrs = {1,2,3,4,5};
		int[]arrs1 = {1,2};
		
		int result = ta.add(arrs1);
		System.out.println("result="+result);*/
		
		int result = ta.add('+',new int[]{1,1,3});
		System.out.println(result);
		
	}
   //定义方法时对应的参数列表为形式参数
	/*private static int add(int num1, int num2,int num3) {
		int result = num1 + num2 + num3;
		return result;
	}*/
    /*
     * 将普通数组作为形式参数
     * 实现对多个数据的累加求和
     */
	public int add(int[]nums){
		int result = 0;
		for (int i : nums) {
			result += i;
		}
		return result;
	}
 /*
  * 在JDK5.0中新增了支持变长数组的使用，也就是
  * 根据用户传入的实际参数实现长度可变的数组
  * 变长数组只能在对应的方法中以形式参数的方式出现且
  * 只能在对应的参数列表中最后一个出现
  * 形如:数据类型...数组名
  * 对应的语法:
  *    访问修饰符   返回类型  方法名(数据类型 参数1,...,数据类型 参数n,数据类型...数组名){
  *        方法体...
  *    }
  *     
  */
	
	public int add(char op,int...args){
		int result = 0;
		if (op=='+') {
			for (int i : args) {
				result+=i;
			}
		}
		/*for (int i : args) {
			result+=i;
		}*/
		return result;
	}
    
}
