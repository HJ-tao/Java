package day06;

public class Work2 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum = 0;
		System.out.println("数组为：");
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*90)+10;
			sum += arr[i];
			System.out.print(arr[i]+"\t");
		}
		int max = arr[0],min = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
			if(arr[i]<min){
				min = arr[i];
			}
		}
		System.out.println("\n最大值为："+max);
		System.out.println("最小值为："+min);
		System.out.println("和值为："+sum);
		System.out.println("平均值为："+(double)sum/arr.length);
	}

}
