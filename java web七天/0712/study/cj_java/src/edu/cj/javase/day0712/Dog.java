package edu.cj.javase.day0712;

public class Dog extends Pet {
	/*
	 * ��д:override
	 * ���ཫ�����еķ�����������ʵ�ֵĹ���
	 * ����:
	 *    1.�������͡��������������б����͸����еķ���һ��
	 *    2.����д����ʱ���෽��������С�����з����ķ���Ȩ��,ֻ�ܴ��ڻ��ߵ��ڸ����еķ�������Ȩ��
	 * 
	 */
    @Override
    public void eat() {
    	System.out.println("���ֽ�"+name+"�Ĺ��������Ŀ��Ź�ͷ,���˺ö������!!!");
    }
	public Dog() {
		//super("",87,89);
		//this("",89,98);
		/*
		 *������Ĺ��췽���ĵ�һ�� һ���ǵ��ø����е��޲ι��췽������Ӧ���� super(),
		 *����ʡ�Բ�д
		 *���������޲ι��췽�������ڳ���ͻᱨ��
		 *������super�ؼ�����ʾ��ȥ���ø����е��вι��췽��
		 *ע��superֻ���ڹ��췽���ĵ�һ��
		 *this��ʾ��ǰ����super��ʾ�������
		 *����ͨ��this����super��"."�ķ�ʽ�������Ժ�ʵ������
		 *������this����superȥ���ö�Ӧ��Ĺ��췽��
		 *�����ڵ��ö�Ӧ�Ĺ��췽��ʱֻ���ڶ�Ӧ�Ĺ��췽���еĵ�һ�У�������
		 *
		 *ע��!!!!
		 *     this��super��ʾ���Ƕ��������ǲ��ܹ������ھ�̬�����еģ�ԭ��Ϊ
		 *     �ھ�̬�ķ����ж��󶼻�û����
		 */
		//super("",89,98);
		
		System.out.println("Dog�޲ι��췽����ִ����");
		
	}

	public Dog(String name, int health, int love) {
		//this();
		//super(name,health,love);
		System.out.println("Dog�вι��췽����ִ����");
	}
	

}
class TestPet{
	public static void main(String[] args) {
		/*Dog dog = new Dog("tom",89,98);
		dog.name = "����";
		dog.eat();*/
		
		Pet p = new Dog(); //����ת�� �������൱��������ʹ��
		p.name = "����";
		p.eat();
		//Pet p1 = new Cat();  
		//��Ȼǿת���Ա���ͨ����ִ��ʱ���ܱ� ClassCastException���쳣
		//��Ϊǿ��ת���ĸ�������������Ͳ�����ĳ���������
		//Ϊ�˱������ת��ʧ�ܶ����µ��쳣����ͨ�� instanceof�ؼ����������ж�
		if (p instanceof Dog) {
			Dog dog = (Dog)p; //����ת�� �Ѹ������������ʹ�� ����ǿ��ת��
			dog.name = "tom";
			dog.eat();
		}else{
			System.out.println("�Բ���p1������Dog���ʵ��");
		}
		
		
		
	}
}
