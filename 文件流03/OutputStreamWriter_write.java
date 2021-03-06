package day08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * �ַ���
 * Reader,Writer
 * Reader�������ַ��������ĸ���,Writer������
 * �ַ�������ĸ���
 * 
 * �ַ��������ַ�Ϊ��С��λ��д���ݵ�,Ȼ��ʵ��
 * ���ʵײ㻹�Ƕ�д�ֽ�,ֻ���ַ����ֽڵ�ת��
 * �������ַ����������.
 * 
 * �����ַ��������������д�ַ�����,�����ַ���
 * ��ͨ���ڶ�д�κ����������,ֻ������д�ı�
 * ����.
 * 
 * 
 * ת����,ת�������ַ�����һ��ʵ����
 * OutputStreamWriter,InputStreamReader
 * �ص�:���԰���ָ�����ַ������ַ����ֽ�֮��
 * ת��Ȼ���д
 * 
 * ת����֮���Գ�Ϊת��������Ϊ��ʵ�ʵĿ���
 * ��,�ڽ��������Ӳ���ʱ,�������ַ��߼�����
 * ֻ�ܴ��������ַ���,Ȼ��ͼ����󲿷ֶ���
 * �ֽ���,��͵������ַ����������ӵ��ֽ���
 * ��,����ת�����ǿ��Դ����ֽ�����,����������
 * �����ַ���,��������������һ�����ν�����
 * �ַ��߼������ֽ���������.
 * 
 * @author adminitartor
 *
 */
public class OutputStreamWriter_write {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			= new FileOutputStream("osw.txt");
		/*
		 * OSW���ù��췽��:
		 * OutputStreamWriter(OutputStream out)
		 * 
		 * OutputStreamWriter(
		 * 	OutputStream out,
		 * 	String charSetName
		 * )
		 * ������ڶ�������ʱ,���԰���ָ�����ַ�
		 * �����ַ���ת��Ϊ�ֽں�д��.
		 */
		OutputStreamWriter osw
			= new OutputStreamWriter(
				fos,"UTF-8"
			);
		
		osw.write("��С��,���û�������΢Ц.");
		osw.write("���������һ��,������˥��.");
		
		System.out.println("д�����!");
		osw.close();
		
	}
}










