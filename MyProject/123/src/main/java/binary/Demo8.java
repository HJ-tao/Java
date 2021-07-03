package binary;
/**
 * 2���������
 * ��ȡ������
 * &������
 * |������
 * >>> �߼�����λ����
 *  >> ��ѧ����λ����
 *  << ����λ����
 * @author soft01
 * >>>��>>������
 * ��������,��λ����0,������λ��1,���������ѧ����,������ѧ����
 * ʹ��Ƶ�ʸ���
 */
public class Demo8 {

	public static void main(String[] args) {
		//��λ������ 
		/*
		 * 0&0=0
		 * 0*1=0
		 * 1*0=0
		 * 1*1=1 
		 */
		//�������:����(mask)����
		int n = 0x6adf246b;
		int m = 0xff;
		int k = n&m;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		System.out.println(Integer.toBinaryString(k));
		
		/*
		 * Java IO��:
		 * 1.ÿ�δ���1��byte
		 * 2.��һ���������浽�ļ��У����������Ϊ4��byte����һ���浽�ļ���
		 */
		//���������߼�����λ������Ͽ��Խ��������Ϊ4��Byte
		n = 0x6adf246b;
		k = n>>>1;
		int p = n>>>2;
		m = n>>>8;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(k));
		System.out.println(Integer.toBinaryString(p));
		System.out.println(Integer.toBinaryString(m));
		//����������writeInt(int)����һ��
		/*
		 * �����ĵײ�ԭ����ǽ�int���Ϊ4��byteд�뵽�ļ���.
		 */
		m = 0xff;
		int b4 = n&m;
		int b3 = (n>>>8)&m;
		int b2 = (n>>>16)&m;
		int b1 = (n>>>24)&m;
		/*System.out.println(Integer.toBinaryString(b1));
		System.out.println(Integer.toBinaryString(b2));
		System.out.println(Integer.toBinaryString(b3));
		System.out.println(Integer.toBinaryString(b4));*/
		
		//��λ������
		n = 0xd6;
		m = 0xac00;
		k = n|m;
		System.out.println(Integer.toBinaryString(k));
		//����������int readInt()�����ĵײ������ƴ�Ӽ���,������ȡ4��byte,ƴ��Ϊһ��int
		b1 = 0xb5;
		b2 = 0x2b;
		b3 = 0xb7;
		b4 = 0x9c;
		n = (b1<<24)|(b2<<16)|(b3<<8)|(b4<<0);
		System.out.println(Integer.toBinaryString(n));
		//��ѧ����λ����>>
		/*
		 * ��λ�������ѧ����
		 * 2���ƣ�С����λ�ò���,���������ƶ�:���������ƶ�һ����������
		 * ����λ:�ƶ�һ�������ֳ�2,���ʱ����������ȡ�����Ľ��
		 * ��λʱ��:������λ��0,������λ��1
		 */
		n = 50;
		m = n<<2;//�൱��n*4
		k = n<<3;//�൱��n*8
		System.out.println(m);
	}

}
