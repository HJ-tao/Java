package edu.cj.javase.day0711.work;

public class Calculator {
    String brand;
    String type;
    int num1;
    int num2;
    
    public int add(){
    	int result = num1 + num2;
    	return result;
    }
    
    public int minus(){
    	int result = num1 - num2;
    	return result;
    }
    public int multi(){
    	int result = num1 * num2;
    	return result;
    }
    public int divide(){
    	if (num2 == 0 ) {
			System.out.println("除数不能为零");
			return -1;
		} 
    	int result = num1 / num2;
    	return result;
    }
}
