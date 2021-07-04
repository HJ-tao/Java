package day06;

public class Work4 {

	public static void main(String[] args) {
		int[] a = new int[100];
		int[] b = new int[10];
		System.out.println("a数组为：");
		for(int i=0;i<a.length;i++){
			a[i]=(int)(Math.random()*9000+1000);
			if(i%10==0&&i!=0){
				System.out.println();
			}
			System.out.print(a[i]+"\t");
			switch(a[i]%10){
			case 0:
				b[0]++;
				break;
			case 1:
				b[1]++;
				break;
			case 2:
				b[2]++;
				break;
			case 3:
				b[3]++;
				break;
			case 4:
				b[4]++;
				break;
			case 5:
				b[5]++;
				break;
			case 6:
				b[6]++;
				break;
			case 7:
				b[7]++;
				break;
			case 8:
				b[8]++;
				break;
			case 9:
				b[9]++;
				break;
			}
		}
		System.out.println("\nb数组为：");
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]+"\t");
		}
	}

}
