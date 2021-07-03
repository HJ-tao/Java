package edu.cj.javase.day0711.work;

public class NewCalculator {
    String brand;
    String type;
    
    //此时对应的参数 num1,op,num2称之为形式参数，简称形参
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
