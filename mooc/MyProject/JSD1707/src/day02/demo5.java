package day02;
//九九乘法表
public class demo5 {
	public static void main(String []args){
		for(int i = 1;i < 10;i++){
			for(int j = 1;j < i+1;j++){
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
			}
			System.out.println();
		}
	}
}
