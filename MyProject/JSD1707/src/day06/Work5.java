package day06;

public class Work5 {

	public static void main(String[] args) {
		int[][] num = new int[10][100];
		for(int row=0;row<num.length;row++){
			num[row][0] = 1;
			num[row][row] = 1;
		}
		for(int row=2;row<num.length;row++){
			for(int col=1;col<row;col++){
				num[row][col] = num[row-1][col]+num[row-1][col-1];
			}
		}
		System.out.println("杨辉三角形：");
		for(int row=0;row<num.length;row++){
			for(int col=0;col<=row;col++){
				System.out.print(num[row][col]+"\t");
			}
			System.out.println();
		}
	}

}
