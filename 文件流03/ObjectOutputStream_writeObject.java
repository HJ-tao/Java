package day08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * ������
 * ��������һ�Ը߼���,�����Ƿ������Ƕ�дjava
 * �е��������.
 * 
 * ���������
 * java.io.ObjectOutputStream
 * ������������Խ������Ķ����սṹת��
 * Ϊһ���ֽ�.Ȼ����ͨ���䴦�����������
 * �ֽ�д��.
 * @author adminitartor
 *
 */
public class ObjectOutputStream_writeObject {
	public static void main(String[] args) throws IOException {
		Person p = new Person();
		p.setName("����ʦ");
		p.setAge(18);
		p.setGender("Ů");
		
		List<String> otherInfo
			= new ArrayList<String>();
		otherInfo.add("��һ����Ա");
		otherInfo.add("����дë����");
		otherInfo.add("�ٽ������Ļ�����");
		otherInfo.add("�ǹ������ͬ����������ʦ");
		p.setOtherInfo(otherInfo);
		
		FileOutputStream fos
			= new FileOutputStream("person.obj");
		
		ObjectOutputStream oos
			= new ObjectOutputStream(fos);
		/*
		 * void writeObject(Object o)
		 * ����������ĸ÷����ǽ���������
		 * ת��Ϊһ���ֽں�д��.
		 * ��ϣ����OOSд��,��Ҫ��ö���������
		 * ����ʵ�ֿ����л��ӿ�.
		 * 
		 * ����Ĵ��뽫p����д��ʱ,������
		 * ��������:
		 * 1:ͨ��OOS����������ת��Ϊһ���ֽ�
		 *   ������̳�Ϊ:�������л�
		 * 2:�ڽ������ֽ�ͨ��FOSд�뵽Ӳ��
		 *   �е�������̳�Ϊ:���ݳ־û�  
		 */
		oos.writeObject(p);
		System.out.println("д�����!");
		
		oos.close();
	}
}






	
