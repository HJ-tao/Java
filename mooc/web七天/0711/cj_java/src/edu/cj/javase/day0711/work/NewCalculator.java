package edu.cj.javase.day0711.work;

public class NewCalculator {
    String brand;
    String type;
    
    //��ʱ��Ӧ�Ĳ��� num1,op,num2��֮Ϊ��ʽ����������β�
    public int cal(int num1,char op,int num2){
    	int result = 0;
    	switch(op){
	    	case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			default:
				break;
		}
    	return result;
    }
    
  
}
