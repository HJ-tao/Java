package day06;

public class Work3 {

	public static void main(String[] args) {
		int[] num = new int[10];
		System.out.println("原数组为：");
		for(int i=0;i<num.length;i++){
			num[i] = (int)(Math.random()*90)+10;
			System.out.print(num[i]+"\t");
		}
		System.out.println("\n倒排之后的数组为：");
		for(int i=num.length-1;i>=0;i--){
			System.out.print(num[i]+"\t");
		}
	}

}
