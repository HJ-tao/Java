package edu.cj.javase.day0711.work;

import java.util.Scanner;

public class NewStudent {
    String stuName; //ѧ��������
    String schoolName; //ѧУ����
    
    //��ʱ��NewCalculator calΪ��ʽ����
    public void useCalculator(NewCalculator cal){
    	//�õ������������Ϳ���ʹ�ü�����������
    
    	cal.brand = "����";
    	cal.type = "T100";
    	System.out.println(schoolName+"ѧУ��"+stuName+"ͬѧ������Ʒ��Ϊ"+cal.brand+",�ͺ�Ϊ"+cal.type+"�ĳ����������ڼ���......");
    	Scanner sc = new Scanner(System.in);
    	System.out.print("�������һ����:");
    	int num1 = sc.nextInt();
    	System.out.print("�������������: + - * / ");
    	char op = sc.next().charAt(0);
    	System.out.print("������ڶ�����:");
    	int num2 = sc.nextInt();
    	//��ʱ�����num1,num2,op��֮Ϊʵ�ʲ���,���ʵ�Σ�ʵ���б�����͡�˳�򡢸���һ������ʽ�����б�����͡�˳�򡢸����ϸ�һ�£���ͬ��
    	int result = cal.cal(num1, op, num2);
    	
    	System.out.printf("%d %c %d = %d\n",num1,op,num2,result);
    }
}
