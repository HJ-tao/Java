package edu.cj.javase.day0711.work;

public class Work6 {
   public static void main(String[] args) {
	   //����������
	   for (int i = 0; i < 5; i++) {
		   //�ڲ�������ǵĸ���   2*i + 1
		   for (int j = 0; j < 2*i+1 ; j++) {
			   System.out.print("*");
		    }
		   System.out.println();
	    }
	   
	   System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	 //����������
	   for (int i = 0; i < 5; i++) {
		   //�ڲ�������ǵĸ��� 5-i
		   for (int j = 0; j < 5-i ; j++) {
			   System.out.print("*");
		    }
		   System.out.println();
	    }
   }
}
