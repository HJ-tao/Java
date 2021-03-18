package edu.cj.javase.day0713.work;

import java.util.HashMap;
import java.util.Map;

public class StudentTools {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer,Student> map = new HashMap<Integer, Student>();
		for (int i = 0; i < 5; i++) {
			map.put(1000+i, new Student(1000+i, "tom"+i, "ÄÐ", "ÀºÇò"));
		}
		//Ñ­»·±éÀú
		for (Integer key : map.keySet()) {
			System.out.println("key="+key+",value="+map.get(key));
		}

	}

}
