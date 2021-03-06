package day09;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 异常处理机制在IO中的操作
 * @author adminitartor
 *
 */
public class Exception_finally2 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(
					new InputStreamReader(
						new FileInputStream(
							"src/day08/Exception_finally2.java"	
						)	
					)	
				);
			String line = null;
			while((line = br.readLine())!=null){
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(br!=null){
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}			
		}
 	}
}





