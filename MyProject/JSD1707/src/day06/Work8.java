package day06;

public class Work8 {

	public static void main(String[] args) {
		int num = 12321;      //个位：%10  十位：/10%10  百位：/100%10  千位：/1000%10  万位： 
		if(isCircleNum(num)){
			System.out.println(num+"是回文数.");
		}else{
			System.out.println(num+"不是回文数.");
		}
	}
	
	public static boolean isCircleNum(int num){
		int[] port = new int[5];
		int times = 1;
		boolean flag = true;
		for(int i=0;i<port.length;i++){
			port[i] = num/times%10;
			times *= 10;
		}
		for(int i=0;i<=port.length/2;i++){
			if(port[i] != port[port.length-i-1]){
				flag = false;
				break;
			}
		}
		return flag;
	}
	

}
