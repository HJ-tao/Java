package edu.cj.javase.day0712;

public class TestArray1 {

	/**
	 * 
	 */
	public static void main(String[] args) {
		TestArray1 ta = new TestArray1();
		/*int num1 = 5;
		int num2 = 3;
		int num3 = 2;
		//num1,num2Ϊʵ��
		int result = add(num1, num2,num3);*/
		/*int[]arrs = {1,2,3,4,5};
		int[]arrs1 = {1,2};
		
		int result = ta.add(arrs1);
		System.out.println("result="+result);*/
		
		int result = ta.add('+',new int[]{1,1,3});
		System.out.println(result);
		
	}
   //���巽��ʱ��Ӧ�Ĳ����б�Ϊ��ʽ����
	/*private static int add(int num1, int num2,int num3) {
		int result = num1 + num2 + num3;
		return result;
	}*/
    /*
     * ����ͨ������Ϊ��ʽ����
     * ʵ�ֶԶ�����ݵ��ۼ����
     */
	public int add(int[]nums){
		int result = 0;
		for (int i : nums) {
			result += i;
		}
		return result;
	}
 /*
  * ��JDK5.0��������֧�ֱ䳤�����ʹ�ã�Ҳ����
  * �����û������ʵ�ʲ���ʵ�ֳ��ȿɱ������
  * �䳤����ֻ���ڶ�Ӧ�ķ���������ʽ�����ķ�ʽ������
  * ֻ���ڶ�Ӧ�Ĳ����б������һ������
  * ����:��������...������
  * ��Ӧ���﷨:
  *    �������η�   ��������  ������(�������� ����1,...,�������� ����n,��������...������){
  *        ������...
  *    }
  *     
  */
	
	public int add(char op,int...args){
		int result = 0;
		if (op=='+') {
			for (int i : args) {
				result+=i;
			}
		}
		/*for (int i : args) {
			result+=i;
		}*/
		return result;
	}
    
}
