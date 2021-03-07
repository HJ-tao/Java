package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * �����ļ�
 * @author soft01
 *
 */
public class CopyDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile src = new RandomAccessFile("music.mp3","r");
		RandomAccessFile desc = new RandomAccessFile("music_cp.mp3","rw");
		int d = -1;
		//�����ļ�
		while((d=src.read())!=-1){
			desc.write(d);
		}
		System.out.println("�������!");
		
		src.close();
		desc.close();
	}

}
