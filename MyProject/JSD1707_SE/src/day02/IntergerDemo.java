package day02;
/**
 * ��װ��
 * java��8����������,�������ǲ�����������,�����������������,���Բ���ֱ�Ӳ����������Ŀ���.
 * Ϊ��java����8���������ͷֱ��ṩ�˶�Ӧ�İ�װ�������������.
 * @author soft01
 *
 */
public class IntergerDemo {

	public static void main(String[] arg) {
		/**
		 * ��������ת��Ϊ��װ��ʱ�������ȡnew����ʽ,��Ӧ��ʹ�ð�װ��ľ�̬����:valueOf
		 * 
		 */
		Integer i = Integer.valueOf(-128);
		Integer ii = Integer.valueOf(-128);
		
		System.out.println(i==ii);
		System.out.println(i.equals(ii));
		
		int ia = i.intValue();
		System.out.println(ia);
		
		Double dou = Double.valueOf(23.343);
		double d = dou.doubleValue();
		System.out.println(d);
		
		Boolean b = Boolean.valueOf(true);
		boolean bs = b.booleanValue();
		System.out.println(bs);
		
		Byte be = Byte.valueOf((byte)23);
		byte m = be.byteValue();
		System.out.println(m);
		
		double mm = Math.hypot(3,4);
		System.out.println(Math.cos(Math.PI/4));
		System.out.println(Math.sin(Math.PI/4));
		System.out.println(Math.cos(Math.PI/4)==Math.sin(Math.PI/4));
	}

}
