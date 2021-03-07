package oo.day05;
//43+  45-
public class Work1 {
	public static void main(String[] args) {
		for(int i=34;i<100;i++){
			System.out.print((char)i+"\t");
			if((i-34)%10==0 && i!=34){
				System.out.println();
			}
		}
	}
}

