package day08;

import java.io.Serializable;
import java.util.List;

/**
 * ʹ�ø����ʵ�����Զ������Ķ����д����
 * @author adminitartor
 *
 */
public class Person implements Serializable{
	/**
	 * ��һ����ʵ����Serializable�ӿں�
	 * Ӧ������һ������:���л��汾��
	 * serialVersionUID
	 * �������û��ָ��,����������ݵ�ǰ��
	 * �Ľṹ����һ���汾��,����ֻҪ��ǰ��
	 * �����˸ı�,��ô�汾�Ż���֮�ı�.
	 * 
	 * �汾��Ӱ��ObjectInputStream�ڽ���
	 * �������л�ʱ�Ľ��
	 * ��OIS����Ҫ���з����л��Ķ����뵱ǰ
	 * ��汾�Ѿ���һ��,��ô�����л�ֱ��ʧ��
	 * ��һ��,�����л��ɹ�,����ö�����
	 * ��ǰ��ṹ����ȫһ��ʱ,�����ü���ģʽ,
	 * ��:�ܻ�ԭ��������Ȼ��ԭ.û�е������.
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	/*
	 * ��һ�����Ա�transient���κ�,��ô
	 * �������ڽ��ж������л�ʱֵ�ᱻ����
	 * ������Ҫ�����Ժ��Կ��Դﵽ����"����"
	 * ��Ŀ��
	 */
	private transient List<String> otherInfo;
	
	public Person(){
		
	}

	public Person(String name, int age, String gender, List<String> otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(List<String> otherInfo) {
		this.otherInfo = otherInfo;
	}
	
	public String toString(){
		return name+","+age+","+gender+","+otherInfo;
	}
}







