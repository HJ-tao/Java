package edu.cj.javase.day0712;

public class TestStringBuilder2 {

	/**
	 * 
	 */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb);
		sb.append("hello");
		System.out.println(sb);
		StringBuffer sf = new StringBuffer("12345678");
		System.out.println(sf);
		for (int i = sf.length()-3; i > 0; i-=3) {
			sf.insert(i, ",");
		}
		//System.out.println(sf.indexOf("1"));
		System.out.println(sf);
	}
	 
}
