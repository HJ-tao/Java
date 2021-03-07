package day04;

public class Work1 {
	public static void main(String[] args) {
		long sum = 0L;
		long num = 0L;
		for (int i = 1; i <= 9; i++) {
			num = num*10+9;
			sum += num;
			System.out.print(num+"+");
		}
		num = num*10+9;
		sum += num;
		System.out.println(num+"="+sum);
	}
}
