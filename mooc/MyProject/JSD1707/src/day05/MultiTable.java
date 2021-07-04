package day05;
// 九九乘法表
public class MultiTable {

	public static void main(String[] args) {
		for(int times = 1;times<=9;times++){//控制行
			for(int i = 1;i<=times;i++){//控制列
				System.out.print(i+"*"+times+"="+i*times+"\t");
			}
			System.out.println();
		}
	}

}
