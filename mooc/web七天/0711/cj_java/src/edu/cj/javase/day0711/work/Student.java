package edu.cj.javase.day0711.work;

import java.util.Scanner;

public class Student {
    String stuName; //ѧ��������
    String schoolName; //ѧУ����
    
    public void useCalculator(){
    	//�õ������������Ϳ���ʹ�ü�����������
    	Calculator cal = new Calculator(); //��ü����������ʵ��
    	cal.brand = "����";
    	cal.type = "T100";
    	System.out.println(schoolName+"ѧУ��"+stuName+"ͬѧ������Ʒ��Ϊ"+cal.brand+",�ͺ�Ϊ"+cal.type+"�ĳ����������ڼ���......");
    	Scanner sc = new Scanner(System.in);
    	System.out.print("�������һ����:");
    	cal.num1 = sc.nextInt();
    	System.out.print("�������������: + - * / ");
    	char op = sc.next().charAt(0);
    	System.out.print("������ڶ�����:");
    	cal.num2 = sc.nextInt();
    	int result = 0;
    	switch (op) {
		case '+':
			result = cal.add();
			break;
		case '-':
			result = cal.minus();
			break;
		case '*':
			result = cal.multi();
			break;
		case '/':
			result = cal.divide();
			break;
		default:
			break;
		}
    	System.out.printf("%d %c %d = %d\n",cal.num1,op,cal.num2,result);
    }
}
