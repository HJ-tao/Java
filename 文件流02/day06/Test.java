package day06;

import java.io.File;

/**
 * 1:��д�������:
 *   1��Ǯ������1ƿ��ˮ,2����ƿ���Ի�1ƿ��ˮ
 *   3��ƿ�ǿ��Ի�һƿ��ˮ,����:20��Ǯ������
 *   ����ƿ��ˮ?
 *   
 * 2:��дһ�δ���
 *   ����1+2+3+4+...100
 *   ��������.
 *   ����δ����в��ó���while,for�ؼ���
 *     
 * 
 * ��д�������ɾ��ָ�����ļ���Ŀ¼
 * @author adminitartor
 *
 */
public class Test {
	public static void main(String[] args) {
		File dir = new File("a");
		delete(dir);
	}
	/**
	 * ��������File����ʾ���ļ���Ŀ¼ɾ��
	 * @param file
	 */
	public static void delete(File file){
		if(file.isDirectory()){
			//�ֽ���Ŀ¼����������ɾ��
			File[] subs = file.listFiles();
			for(File sub : subs){
				//�ݹ����
				delete(sub);
			}
		}
		file.delete();	
	}
}





