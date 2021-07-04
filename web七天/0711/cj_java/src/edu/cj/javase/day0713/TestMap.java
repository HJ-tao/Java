package edu.cj.javase.day0713;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	/**
	 * ����ӳ�䵽ֵ�Ķ���һ��ӳ�䲻�ܰ����ظ��ļ���ÿ�������ֻ��ӳ�䵽һ��ֵ�� 
	 * 
	 * �˽ӿ�ȡ�� Dictionary �࣬������ȫ��һ�������࣬������һ���ӿڡ�
	 * 
	 * Map �ӿ��ṩ����collection ��ͼ��
	 * �����Լ�����ֵ�����-ֵӳ���ϵ������ʽ�鿴ĳ��ӳ������ݡ�
	 * ӳ��˳�� ����Ϊ��������ӳ��� collection ��ͼ�Ϸ�����Ԫ�ص�˳��
	 * ĳЩӳ��ʵ�ֿ���ȷ��֤��˳���� TreeMap �ࣻ��һЩӳ��ʵ���򲻱�֤˳���� HashMap �ࡣ 
	 * 
	 * ���ڹ�ϣ��� Map �ӿڵ�ʵ�֡�
	 * ��ʵ���ṩ���п�ѡ��ӳ�������
	 * ������ʹ�� null ֵ�� null ����
	 * �����˷�ͬ��������ʹ�� null ֮�⣬HashMap ���� Hashtable ������ͬ����
	 * ���಻��֤ӳ���˳���ر���������֤��˳���ò��䡣 
	 * 
	 * ͨ����Ĭ�ϼ������� (.75) 
	 * ��ʱ��Ϳռ�ɱ���Ѱ��һ�����ԡ�
	 * �������ӹ�����Ȼ�����˿ռ俪����
	 * ��ͬʱҲ�����˲�ѯ�ɱ����ڴ���� HashMap ��Ĳ����У�
	 * ���� get �� put ����������ӳ����һ�㣩��
	 * �����ó�ʼ����ʱӦ�ÿ��ǵ�ӳ�����������Ŀ������������ӣ�
	 * �Ա�����޶ȵؼ��� rehash ����������
	 * �����ʼ�������������Ŀ�����Լ������ӣ��򲻻ᷢ�� rehash ������
	 * 
	 * map�ӿ������Ԫ���õ�����put(K,V)����ȡԪ�ػ�����get(��),Ԫ�ظ�������size()
	 * K��ʾ��Ӧ�ļ� 
	 * V��ʾ��Ӧ��ֵ
	 * 
	 *  ���û�õ�������ô����ֵ�����Ͷ�ΪObject
	 *  ���˷�������Լ����������ʹ��
	 */
	public static void main(String[] args) {
	 /**
	  * Map<String, Student> map = new HashMap<String, Student>();
	  * map.put("1001", new Student(1001,"tom"));
	  * map.put("1002", new Student(1002,"lily"));
	  * ȡ���� ���ݶ�Ӧ�ļ�key����ȡ��Ӧ��ֵvalue
	  * Student t = map.get("1002");
	  * System.out.println(t); 
      */
       //Ĭ�ϵĳ�ʼ����Ϊ16,��������Ϊ0.75��StringBuffer��StringBuilder��ʼ�ĳ���ҲΪ16
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("andy", "���»�");
		map.put("jacky", "��ѧ��");
		map.put("steven", "���ǳ�");
		map.put("coco", "����");
		map.put("lily", "����");
		map.put("null", "���ǳ�");
		map.put(null, "����");
		map.put("steven", null);
		map.put(null, "����");
		map.put(null, "null");
		map.put(null, null);
		System.out.println(map.size());
		
		//���ļ��� 
		System.out.println("���ļ���:"+map.keySet());
		
		//ֵ�ļ��� 
		System.out.println("ֵ�ļ���:"+map.values());
		
		//��-ֵ�ļ��� 
		System.out.println("��-ֵ�ļ���:"+map);
		
		System.out.println(map.get("steven"));
		
		
		//��α���map���ϵ�����
		for (String key : map.keySet()) {
			System.out.println(key+":"+map.get(key));
		}
	}

}
class Student{
	private int stuId;
	private String stuName;
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stuId, String stuName) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + "]";
	}
	
	
}
