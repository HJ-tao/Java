package edu.cj.javase.day0712;

public class TestStringBuilder1 {

	/**
	 * 
	 */
	public static void main(String[] args) {
		System.out.print(" = "+jieChen(6));

	}
	 public static int jieChen(int num){
	    	System.out.print(num+"! = ");
	    	int result = 1;
	    	StringBuilder s = new StringBuilder();
	    	
	    	for (; num > 0; num--) {
				s.append(num).append("*");
	    		result *= num;
			}
	    	//System.out.print(s.substring(0,s.length()-1)+" = ");
	    	System.out.print(s.deleteCharAt(s.length()-1));
	    	return result;
	    }
}
