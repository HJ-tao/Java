package binary;
/**
 * 10进制
 * 逢10进1
 * 数字:0 1 2 3 4 5 6 7 8 9 
 * 权:10000 1000 100 10 1
 * 基数:10
 * 
 * 2进制
 * 逢2进1
 * 数字:0 1
 * 权:128 64 32 16 8 4 2 1
 * 基数:2
 */
import org.apache.commons.lang.StringUtils;

public class Demo3 {

	public static void main(String[] args) {
		/*
		 * 输出0～50实际的存储情况:
		 */
		for(int i=0;i<50;i++){
			String bin = Integer.toBinaryString(i);
			String s = StringUtils.leftPad(bin, 32, "0");//右对齐
			System.out.println(s);
		}
	}

}
