package day02;

//变量的演示
public class VarDemo {
	public static void main(String[] args) {
		int a;
		int b,c,d;
		int e = 250;
		int f ;
		f = 250;
		int g = 5;
		int h = g+10;
		System.out.println(h);
//		int i = 3.14;//3.14为双精度浮点型数据
//		System.out.println(m);//m没有声明
//		int m;
//		System.out.print(m);//m没有初始化
		{
			int number1 = 12;
			System.out.println(number1);
			System.out.println("number1");
			int number2;
			number2 = 23;
			int number3 = number1 + number2;
			System.out.println(number3);
		}//正确
		/*{
			int number4 = 10.3;
			int number5 = 3;
			double number7 = 7;
			number6 = number5 + 1;
			System.out.println(number6);
			int number8 = number7/number5;
			System.out.println(number8);
		}//错误
*/	}

}
