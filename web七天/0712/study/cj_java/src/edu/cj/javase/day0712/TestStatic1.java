package edu.cj.javase.day0712;

public class TestStatic1 {

	/**
	 * static:��̬��,�����������Ի��߷����Լ������
	 * ��static���ε����Գ�֮Ϊ�����ԣ�Ҳ�о�̬����
	 * ��static���εķ�����֮Ϊ�෽����Ҳ�о�̬����
	 * �ǿ�����������"."�ķ�ʽֱ�ӵ��ã��������ͬһ�����л����м̳й�ϵ��ʱ�����ֱ��ʹ��
	 * ��̬�����Ի��߷���������ͨ����������"."�ķ�ʽ����
	 * 
	 * û�б�static���ε����Ի��߷�����֮Ϊʵ����������Ի��߷���,ֻ��ͨ��������"."�ķ�ʽ���ã�
	 * ��Ȼ�����ͬһ�����еķǾ�̬�����п���ֱ��ʹ��
	 * 
	 * ˵��!!!!
	 * 
	 *      ��̬�����Ի��߷��������ڷǾ�̬�����Ի��߷����е���
	 *      ��֮������Ŷ
	 */
	static int num;
	int age;
	public static void main(String[] args) {
		System.out.println(num); //��ͬһ������ֱ��ʹ��
		System.out.println(TestStatic1.num); //����ͨ������.��̬����
		System.out.println(new TestStatic1().num); //����ͨ��������.��̬����
		//System.out.println(age); �ھ�̬�ķ����в���ֱ�����÷Ǿ�̬���Ի��߷���
		//new TestStatic1().sayHi();
	}
	//���󷽷�
	public void sayHi(){
		System.out.println(age);
		System.out.println(num); //��ͬһ������ֱ��ʹ��
	}
	public static void show(){
		System.out.println(num); //��ͬһ������ֱ��ʹ��
		//sayHi();
		//System.out.println(age);
	}

}
