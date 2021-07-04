package oo.day05;

public class ShapeTest {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[9];
		shapes[0] = new Circle(6);
		shapes[1] = new Circle(7);
		shapes[2] = new Circle(8);
		shapes[3] = new Square(6);
		shapes[4] = new Square(7);
		shapes[5] = new Square(8);
		shapes[6] = new Six(6);
		shapes[7] = new Six(7);
		shapes[8] = new Six(8);
		printMax(shapes);
	}
	
	public static void printMax(Shape[] shapes){
		double max = shapes[0].area();
		int maxIndex = 0;
		for(int i=1;i<shapes.length;i++){
			double area = shapes[i].area();
			if(area>max){
				max = area;
				maxIndex = i;
			}
		}
		System.out.println("最大面积为:"+max+",对应的下标为:"+maxIndex);
	}
}

abstract class Shape{
	protected double c;
	public abstract double area();
}

class Square extends Shape{
	public Square(double c){
		super.c = c;
	}
	
	public double area(){
		return 0.0625*c*c;
	}
}

class Circle extends Shape{
	public Circle(double c){
		this.c = c;
	}
	
	public double area(){
		return 0.0796*c*c;
	}
}

class Six extends Shape{
	public Six(double c){
		super.c = c;
	}
	
	public double area(){
		return 0.0721*c*c;
	}
}


/*
 * 
 * public static void main(String[] args)
 * public static void printMax(Shape[] shapes)
 * public abstract double area()
 * protected double c
 * public double area()
 * public Circle()
 *  
 */

