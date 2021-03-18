package edu.cj.javase.day0712.work;

public class Work1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Work1 w = new Work1();
		w.showWords("hello");

	}
	public void showWords(String src){
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			System.out.print(ch+" ");
		}
	}

}
