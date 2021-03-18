package edu.cj.javase.day0713;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
 /*
 * abstract class ������:��ָ����ʵ�д��ڵ�����һЩ��Ӧ�ķ���û�о����ʵ�ֵ���ôһ������
 * ��Ӧ���﷨:
 *   public abstract class ����{
 *       ����;
 *       ��ͨʵ������;
 *       ���󷽷�;
 *   }
 * ���󷽷�������������û�з�����ķ�����û�з��������Ӧ�Ĵ�����{}�������Ҷ�Ӧ�ķ�����abstract�ؼ�������
 * ����:
 *     �������η�  abstract �������� ������();
 * ��������ص�:
 * 
 * 1.һ���������п���û�г��󷽷�,����ͨ��ʵ�������������Թ�����ǳ�����һ��
 * 2.���������һ�����󷽷�������ô�����������Ϊ������ 
 * 3.�������ǲ���ֱ��ʵ������,������ͨ��new�ؼ���ȥʵ��������
 *    ����������ǳ�����,������ֱ��ʵ���������¾��Ǵ��
 *       Calendar cal = new Calendar();  (X)
 * 4.�����������������ʵ�������������ʵ�������������     
 *       Calendar cal =  Calendar.getInstance();
 * 5.����������д��ڳ��󷽷�,������̳иó�����ʱ������д��Ӧ�ĳ��󷽷�������ڲ���д�Ҳ������
 * ǰ���»����Խ���Ӧ������Ҳ����Ϊabstract��ſ���
 * 
 *   ��Ϊ�����֮��ֻ�����̳м�һ������ֻ�ܼ̳�һ�����࣬��һ����������������ܶ���������
 *   �����ʹ��ڲ���,�����ʵ�ֲ��˸�ǿ��Ĺ���,���Կ���interface�ӿ�����һ����չ��Ӧ��Ĺ���
 *   
 *   Ϊ���ֲ������֮��ĵ��̳��ص�,�����Ƴ��˽ӿ�
 * �ӿ�:��ָ����һ��������һ�ֹ��򣬲��ṩ�����ʵ��,��Ҫʹ�õ�ʱ�����и��ݶ�Ӧ��Լ����ʵ�ּ���
 * 
 * �ӿڵ��ص�:
 *   1.�ӿ��ж�������Զ��Ǿ�̬�ĳ��� ����  public static final ��������  ������ = ֵ;
 *    public static final�������ؼ��ֿ���ʡ�Բ�д
 *   2.�����ڽӿ��еķ������ǳ��󷽷�,�����Ǳ�public abstract �����εģ�public abstract�����ؼ���
 *   ����ʡ�Բ�д���������ؼ��ֵ�˳������
 *   3.�ӿڲ���ֱ��ʵ����ͬ������
 *   4.�ӿ�ֻ�Ƕ���Ĺ���������Ҫͨ����Ӧ��ʵ����ȥʵ�ֶ�Ӧ�Ľӿڲ���д�ӿ��е����г��󷽷�
 *   5.�������д���Խ�ʵ��������Ϊ����ģ������Ƽ�
 *   6.�ӿ��������̳е�,�ؼ�����extends,����ӿڼ��ö��Ÿ�������
 *     ����   public interface A  extends B,C,D...{}
 *   7.һ��ʵ�������ͬʱʵ�ֶ���ӿ�,�ͺñ�һ����ͬʱӵ�ж�������һ��  
 *   ʵ�ֽӿڵĹؼ��� implements
 *   �﷨:
 *      class  ��  implements A,B,C,D
 *   8����������м̳к�ʵ�ֽӿڵ�ǰ����,Ӧ�����ȼ̳�Ȼ����ȥʵ�ֶ�Ӧ�Ľӿ�
 *   ����:
 *      class  ���� extends ����  implements �ӿ�1,�ӿ�2,....�ӿ�n{
 *         //ʵ�ֽӿڻ��߳������еĳ��󷽷�....
 *      }
 *  
 *      
 *  ��̬:
 *  ������ʵ�ֶ�̬�ķ�ʽ.
 *  1.�����������Ϊ�β�ʵ��
 *  2.�����������Ϊ��������  
 *   
 *  ��̬�����ó���:
 *     1.���ڼ̳��е�����͸���֮����߽ӿں�ʵ����֮��
 *     2.�������ʵ����Ҫ��д�����л��߽ӿ��ж�Ӧ�ķ���
 *     3.��������Ϊ�β�,����������������Ϊ�������(����ת��)
 *     
 */
abstract class A{
	int num;
	public  void sayHi(){
		
	}
	//����һ�����󷽷�
	abstract void show();
}
class C{
	
	
}
class B extends A{

	@Override
	void show() {
		// TODO Auto-generated method stub
		
	}
	
}

class TestAbstractClass{
	
	public static void main(String[] args) {
		//Calendar cal = new Calendar(); 
		Calendar cal = new GregorianCalendar(); //�������ʵ����
		Calendar cal1 = Calendar.getInstance();  //ʵ���ϻ�����������ɵ�ʵ����
		System.out.println(cal.get(Calendar.YEAR)+"��"+(cal.get(Calendar.MONTH)+1)+"��"+cal.get(Calendar.DAY_OF_MONTH));
	    
		Date date = new Date();
		//System.out.println(date.getYear()+"��"+date.getMonth()+"��"+date.getDate());
	   System.out.println(date.toLocaleString());
	}
}
public interface MyInterface {
    int MAX = 100;
    //��ͬ�����´���
    //public static final int MAX = 100;
    void show(); //public abstract void show();
    //protected void sayHi(); �����,ֻ����public���һ���abstract
    int getStuNo(int no);
}
