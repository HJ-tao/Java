package edu.cj.javase.day0712;



/**
 * final:���յ� ���ݴ�  ��������������final���ε��������ǳ�֮Ϊ�������������ڳ������й�����
 * ʼ�ձ��ֲ��������
 *  ��final���εķ������ǳ�֮Ϊ��̬�ķ��������������ܱ���д��
 *  ��final���ε������ǳ�֮Ϊ��̬���ࡪ���������ܱ��̳е�      
 * finally:���յ� ���ʡ�����������������java�е��쳣��׽������,���ܷ�������û�����쳣finally�е���䶼�ᱻִ��
 * 
 * ���峣�����﷨:
 *    public final ��������  ������;
 *     �������������淶: ���е���ȫ����д,����ж��������ôÿ�����ʼ���"_"����
 *     ��:EXIT_ON_CLOSE  DARK_GRAY ....
 *     ����ĳ���һ��Ҫ��ɸ�ֵ,������򱨴�
 *     ���Ϊ��Ӧ�ĳ�����ֵ?
 *       1.����������ֵ
 *          final double PI;
 *         �ڶ�Ӧ�Ĺ��췽������ɳ�ʼ�� 
 *       2.��������ʼ��
 *        final double PI = 3.14; 
 *       3.�����Ӧ�ĳ�����static �����ˣ�����,��ô��ֻ�ܲ��õڶ�����������ʼ���ķ�ʽ��ɸ�ֵ
 *     public static final ��������  ������ = ֵ;
 *     
 *     public static final�����ؼ��ֵ�˳�����������ϣ��������:
 *     public static final
 *     public  final static
 *     static public  final
 *     static   final public
 *     final  public staic
 *     final staic public
 *
 *��������д������ȷ
 *
 */
public class TestFinal {
	 final double PI;
	 final double GOLD_POINT = 0.618;
	 static final int MAX_NUM = 100 ;
  public static void main(String[] args) {
	  //new TestFinal().PI = 3.1415926;
   }
  public void show(){
	 // PI = 3.1415;
  }
  TestFinal(){
	  PI = 3.1415;
	//  MAX_NUM = 100;
  }
}
