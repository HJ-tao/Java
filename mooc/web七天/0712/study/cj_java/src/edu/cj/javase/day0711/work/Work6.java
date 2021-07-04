package edu.cj.javase.day0711.work;

public class Work6 {
   public static void main(String[] args) {
	   //外层控制行数
	   for (int i = 0; i < 5; i++) {
		   //内层控制星星的个数   2*i + 1
		   for (int j = 0; j < 2*i+1 ; j++) {
			   System.out.print("*");
		    }
		   System.out.println();
	    }
	   
	   System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	 //外层控制行数
	   for (int i = 0; i < 5; i++) {
		   //内层控制星星的个数 5-i
		   for (int j = 0; j < 5-i ; j++) {
			   System.out.print("*");
		    }
		   System.out.println();
	    }
   }
}
