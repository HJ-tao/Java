package binary;
/**
 * 2进制运算符
 * ～取反运算
 * &与运算
 * |或运算
 * >>> 逻辑右移位运算
 *  >> 数学右移位运算
 *  << 左移位运算
 * @author soft01
 * >>>与>>的区别
 * 无论正负,高位都补0,负数高位补1,结果满足数学规律,用于数学计算
 * 使用频率更高
 */
public class Demo8 {

	public static void main(String[] args) {
		//按位与运算 
		/*
		 * 0&0=0
		 * 0*1=0
		 * 1*0=0
		 * 1*1=1 
		 */
		//经典计算:掩码(mask)计算
		int n = 0x6adf246b;
		int m = 0xff;
		int k = n&m;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		System.out.println(Integer.toBinaryString(k));
		
		/*
		 * Java IO流:
		 * 1.每次处理1个byte
		 * 2.将一个整数保存到文件中：将整数拆分为4个byte，逐一保存到文件中
		 */
		//掩码计算和逻辑右移位运算配合可以将整数拆分为4个Byte
		n = 0x6adf246b;
		k = n>>>1;
		int p = n>>>2;
		m = n>>>8;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(k));
		System.out.println(Integer.toBinaryString(p));
		System.out.println(Integer.toBinaryString(m));
		//以下内容与writeInt(int)方法一致
		/*
		 * 方法的底层原理就是将int拆分为4个byte写入到文件中.
		 */
		m = 0xff;
		int b4 = n&m;
		int b3 = (n>>>8)&m;
		int b2 = (n>>>16)&m;
		int b1 = (n>>>24)&m;
		/*System.out.println(Integer.toBinaryString(b1));
		System.out.println(Integer.toBinaryString(b2));
		System.out.println(Integer.toBinaryString(b3));
		System.out.println(Integer.toBinaryString(b4));*/
		
		//按位或运算
		n = 0xd6;
		m = 0xac00;
		k = n|m;
		System.out.println(Integer.toBinaryString(k));
		//以下内容与int readInt()方法的底层采用了拼接计算,连续读取4个byte,拼接为一个int
		b1 = 0xb5;
		b2 = 0x2b;
		b3 = 0xb7;
		b4 = 0x9c;
		n = (b1<<24)|(b2<<16)|(b3<<8)|(b4<<0);
		System.out.println(Integer.toBinaryString(n));
		//数学右移位运算>>
		/*
		 * 移位计算的数学意义
		 * 2进制：小数点位置不动,数字向左移动:数字向左移动一次扩大两倍
		 * 右移位:移动一次是数字除2,溢出时候向消防向取整数的结果
		 * 移位时候:正数高位补0,负数高位补1
		 */
		n = 50;
		m = n<<2;//相当与n*4
		k = n<<3;//相当与n*8
		System.out.println(m);
	}

}
