package day04;
/**
 * �����Ǳ������Ͽ�
 * ���͵�ʵ��������Object����ʹ�õ�ʱ�����������м����Զ�����.
 * ���Է��ͱ�����ֵʱ,����������Ƿ��������Ҫ���ȡ����ֵʱ,������
 * �Ჹ���Զ����͵Ĵ���.
 * @author soft01
 *
 */
public class TestPoint2 {
	public static void main(String[] args) {
		Point<Integer> p1 = new Point<Integer>(1,2);
		System.out.println("p1:"+p1);
		p1.setX(2);
		System.out.println("p1:"+p1);
		int x1 = p1.getX();
		System.out.println("x1:"+x1);
		
		Point p2 = p1;
		System.out.println("p2:"+p2);
		p2.setX("��");
		System.out.println("p2:"+p2);
		
		x1 = p1.getX();
		System.out.println("x1:"+x1);
	}
}
