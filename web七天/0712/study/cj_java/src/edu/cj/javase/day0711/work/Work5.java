package edu.cj.javase.day0711.work;

public class Work5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//外层控制行数
		for (int i = 0; i < 30; i++) {
			//外层控制列数,即星星的个数
			for (int j = 0; j < 40; j++) {
				//第一行、第一列、最后一行、最后一列打印星星,其他的不打就可以实现空心的长方形
				if(i==0 || i==29 || j==0 || j==39)
				   System.out.print("*");
				else
					System.out.print(" ");
			}
			//每次打完一行星星后在换行
			System.out.println();
		}
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		char[][]star = new char[30][40];
		//用嵌套循环完成对二位数组元素的赋值
		//外层控制行数
				for (int i = 0; i < star.length; i++) {
					//外层控制列数,即星星的个数
					for (int j = 0; j < star[i].length; j++) {
						if(i==0 || i==star.length-1 || j==0 || j==star[i].length-1)
						    star[i][j] = '*';
					}
		
				}
        //通过循环将数组中的元素输出到控制台哦
				for (int i = 0; i < star.length; i++) {
					//外层控制列数,即星星的个数
					for (int j = 0; j < star[i].length; j++) {
						System.out.print(star[i][j]);
					}
					System.out.println();
				}	
	}

}
