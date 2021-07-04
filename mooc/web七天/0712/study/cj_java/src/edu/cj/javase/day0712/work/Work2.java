package edu.cj.javase.day0712.work;

public class Work2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Work2 w = new Work2();
		String src = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789������ѧ�ƿ�רҵ�ı�����������";
		String code = w.getRandomVCode(6, src);
		System.out.println("���ɵ���֤��Ϊ:"+code);

	}
	public String getRandomVCode(int length,String src){
		String code = "";
		for (int i = 0; i < length; i++) {
			int index = (int)(Math.random()*src.length());
			char ch = src.charAt(index);
			code+=ch;
		}
		return code;
	}

}
