package day08;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * ����������
 * ���Խ�һ���ֽڶ�ȡ��ԭΪ���ʾ�Ķ���
 * ǰ���������ֽ�Ӧ���Ƕ����������һ������
 * ת�����ֽ�.������׳��쳣.
 * @author adminitartor
 *
 */
public class ObjectInputStream_readObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis
			= new FileInputStream("person.obj");
		
		ObjectInputStream ois
			= new ObjectInputStream(fis);
	
		Person p = (Person)ois.readObject();
		System.out.println(p);
		
		ois.close();
	}
}









	