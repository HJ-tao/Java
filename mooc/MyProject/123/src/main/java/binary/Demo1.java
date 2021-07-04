package binary;
public class Demo1 {

	public static void main(String[] args) {
		/*
		 * i在内存中存储的是2进制数据
		 * java编译器在编译的时候将"50"
		 * 计算(Integer.parseInt)为2进制的110010,在运行期间i的值
		 * 是110010,在输出时候println会自动调
		 * 用算法(Integer.toString())
		 * 将二进制110010转换为10进制字符串"50"
		 * 显示出来.
		 */
		int i=50;
		//显示i在内存中的2进制存储情况
		System.out.println(Integer.toBinaryString(i));
		System.out.println(i);
	}

}
