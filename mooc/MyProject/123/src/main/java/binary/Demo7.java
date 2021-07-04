package binary;

public class Demo7 {

	public static void main(String[] args) {
		int max = Integer.MAX_VALUE;
		System.out.println(Integer.toBinaryString(max));
		int min = Integer.MIN_VALUE;
		System.out.println(Integer.toBinaryString(min));
		
		max = 0xfffffff;
		min = 0x8000000;
		
		long lmax = Long.MAX_VALUE;
		System.out.println(Long.toBinaryString(lmax));
	}

}
