package oo.day02;

public class Work3 {

	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i=0;i<nums.length;i++){
			nums[i] = (int)(Math.random()*10+1);
			System.out.print(nums[i]+"\t");
		}
		int max = nums[0];
		int count = 0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]>max){
				max = nums[i];
				count = 1;
			}else if(nums[i]==max){
				count++;
			}
		}
		System.out.println("最大值为："+max+",出现次数有"+count+"次.");
	}
}
