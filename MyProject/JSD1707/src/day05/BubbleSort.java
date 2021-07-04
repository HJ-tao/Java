package day05;

public class BubbleSort {

	public static void main(String[] args) {
		long[] arr = new long[10];
		System.out.println("排序之前的数组为：");
		for(int i = 0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*100);
			System.out.print(arr[i]+"\t");
		}
		System.out.println("\n"+"排序之后的数组为：");
		for(int times=0;times<arr.length-1;times++){
			for(int num=0;num<arr.length-1-times;num++){
				if(arr[num]<arr[num+1]){
					long t = arr[num];
					arr[num] = arr[num+1];
					arr[num+1] = t;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		/*int[] num = new int[10];
		System.out.println("排序之前的数组为:");
		for(int i=0;i<num.length;i++){
			num[i] = (int)(Math.random()*100);
			System.out.print(num[i]+"\t");
		}
		int temp = 0;
		for(int times=0;times<num.length-1;times++){
			for(int i=0;i<num.length-1-times;i++){
				if(num[i]>num[i+1]){
					temp = num[i];
					num[i] = num[i+1];
					num[i+1] = temp;
				}
			}
		}
		System.out.println("\n"+"排序之后的数组为：");
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+"\t");
		}*/
	}
}
