package mypackage;

public class TestT {

	public static void main(String[] args) {
		T t = new T(0,1);
		System.out.println("原始坐标为：");
		t.print();
		t.moveRight();
		System.out.println("右移之后坐标为：");
		t.print();
	}
}
