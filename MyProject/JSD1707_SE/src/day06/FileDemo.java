package day06;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.io.File
 * File���ÿһ��ʵ�����ڱ�ʾ����ϵͳ���ļ�ϵͳ���
 * һ���ļ���Ŀ¼
 * ʹ��File����:
 * 1.�����ļ���Ŀ¼��������Ϣ
 * 2.�����ļ���Ŀ¼(����,ɾ��)
 * 3.����һ��Ŀ¼�е�����
 * ���ǲ��ܷ����ļ�����.
 * @author soft01
 *
 */
public class FileDemo {
	public static void main(String[] args) {
		/*
		 * ����Fileʱ��Ҫָ�����ļ���Ŀ¼��·��.
		 * ·��ͨ��ʹ�����·��(��ƽ̨)
		 * ".":��ǰĿ¼,��ǰĿ¼�����г���Ļ�������,��
		 *     eclipse�е�ǰĿ¼�Ķ�����:��ǰ��������
		 *     Ŀ�ĸ�Ŀ¼(������JSD1705_SE)
		 * Ŀ¼�Ĳ㼶�ָ���:"/","\",���ڲ�ͬ�Ĳ���ϵͳ
		 * ��һ��,java��File���ṩ�˳���separator��
		 * ���β���.
		 */
		File file = new File("."+File.separator+"demo.txt");//.��ʾ��ǰ������Ŀ¼
		//��ȡ�ļ���
		String name = file.getName();
		System.out.println("�ļ���:"+name);
		//�����ļ��Ĵ�С(�ֽ���)
		long length = file.length();
		System.out.println("��С:"+length+"�ֽ�");
		
		boolean canRead = file.canRead();
		boolean canWrite = file.canWrite();
		System.out.println("�ɶ�:"+canRead);
		System.out.println("��д:"+canWrite);
		
		boolean isHidden = file.isHidden();
		System.out.println("�Ƿ�����:"+isHidden);
		/*
		 * ����޸�����
		 */
		long time = file.lastModified();
		System.out.println(time);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��M��d��,H:m:s");
		String str = sdf.format(time);
		System.out.println(str);
	}
}
