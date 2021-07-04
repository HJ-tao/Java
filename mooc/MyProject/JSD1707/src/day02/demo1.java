package day02;

public class demo1 {
	public static void main(String[] args) {
		int m = 0;
		for(char i = '\u4e00';i<'\u9fa5';i++){
			System.out.print(i+"\t");
			if(++m%10==0){
				System.out.println();
			}
		}
	}

}
