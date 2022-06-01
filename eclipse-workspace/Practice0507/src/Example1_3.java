abstract class Shape3 {
	public double width, height;
	
	public Shape3(double width, double height) {
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height = height;
	}
	abstract public void computeArea();
}

class Triangle3 extends Shape3 {
	
	public Triangle3(double width, double height) {
		// TODO Auto-generated constructor stub
		super(width,height);
	}
	@Override
	public void computeArea() {
		System.out.printf("삼각형 면적: %.2f\n", (width * height)/2);
	}
}

class Rectangle3 extends Shape3 {
	
	public Rectangle3(double width, double height) {
		// TODO Auto-generated constructor stub
		super(width,height);
	}
	@Override
	public void computeArea() {
		System.out.printf("사각형 면적: %.2f\n", (width * height));
	}
}
public class Example1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	public static void test1() {
		Shape3 ob;
		
		ob = new Triangle3(15.2,13.3);
		ob.computeArea();
		
		ob = new Rectangle3(15.2,13.3);
		ob.computeArea();	
	}
}