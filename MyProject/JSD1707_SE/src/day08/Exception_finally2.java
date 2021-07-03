package day08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/**
 * 异常处理机制在IO中的操作
 * @author soft01
 *
 */
public class Exception_finally2 {

	public static void main(String[] args){
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/day08/Exception_finally2.java")));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
