package day07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流复制文件
 * @author soft01
 *
 */
public class CopyDemo1 {

	public static void main(String[] args) throws IOException {
		FileInputStream src = new FileInputStream("fos.txt");
		FileOutputStream desc = new FileOutputStream("fis.txt");
		
		byte[] car = new byte[1024*10];
		
		int len = -1;
		
		while((len=src.read(car))!=-1){
			desc.write(car,0,len);
		}
		
		src.close();
		desc.close();
	}

}
