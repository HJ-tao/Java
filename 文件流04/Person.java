package day09;
/**
 * ʹ�ø������throw,throws���÷�
 * @author adminitartor
 *
 */
public class Person {
	private int age;

	public int getAge() {
		return age;
	}
	/**
	 * throw�����򷽷��ĵ������׳�һ���쳣
	 * ͨ����������»������׳��쳣:
	 * 1:��ǰ�����ڵ���ʱ������һ�������﷨
	 *   Ҫ��(���������������),���ǲ������
	 *   ������Ƶ�ҵ���߼�����ʱ,���Ե���һ
	 *   ���쳣�׳���������.
	 * 2:��ǰ����ȷʵ�����г������쳣,���Ǹ�
	 *   �쳣��Ӧ���ڵ�ǰ�����и����ʱ,����
	 *   �׳��������߽��.  
	 *   
	 *   
	 * throws��������������������ͬʱ�����÷���
	 * �����׳����쳣��֪ͨ�������ڵ��ø÷���ʱ
	 * ȥ������쳣.
	 * ����RuntimeException�����������쳣�ڷ���
	 * �б��׳�ʱ,�÷���������throws���������쳣
	 * ���׳�,������벻ͨ��.  
	 * @param age
	 */
	public void setAge(int age)throws IllegalAgeException {
		if(age<=0||age>100){
			throw new IllegalAgeException("���䲻�Ϸ�");
		}
		this.age = age;
	}
	
	
}





