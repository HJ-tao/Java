package edu.cj.javase.day0712;

/*
 * ��װ:����ʵ�ֵ�ϸ�ڶ����ṩ���еķ�������Ҫ����ȥʹ�á��� ���˲���Ҫ֪��ҩ����ô����,����ֻҪ֪�������ҩ���Ĳ��Ϳ��Ժ�
 * 
 * java���������ʵ�ַ�װ?
 * ��װ��������:
 *    1.����Ӧ��������private�ؼ�������,��˽�л�����
 *    2.Ϊ��Ӧ��˽�������ṩ���е�setter/getter����
 *    3.�ڶ�Ӧ�ķ����п������Ӷ����ݵ�У���Լ��߼��жϴ���
 * 
 *    java�еķ�װһ������ĳ��ʵ������󡪡����������ݿ��е�ĳ�ű������
 *    
 *    ��private���ε����Ի��߷���ֻ����ͬһ�����б����ʵ�
 *    
 */
public class Student {
	private int stuId; // ���� ��Ա����
	private String stuName;
	private String stuSex;

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

	public String getStuSex() {
		return stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	/*
	 * ���ɹ��е�setter/getter����
	 */
	// �����е�int stuIdΪ�ֲ�����ֻ���ڷ����б�ʹ�õ�,���˷������ܷ��ʵ�
	/*
	 * public void setStuId(int stuId) {
	 * //Ϊ�����ֳ�Ա�����Լ��ֲ�����,java���ṩ��this�ؼ��֣�����ʾ��ǰ���һ������Ȼ��ͨ��thisȥ���ó�Ա�������� this.stuId
	 * = stuId; }
	 * 
	 * public int getStuId(){ return stuId; //this�ؼ�����ʱ����ʡ�Բ�д �� �˴� ����д��
	 * this.stuId; }
	 */

}

class Test {
	public static void main(String[] args) {
		Student tom = new Student();

	}
}