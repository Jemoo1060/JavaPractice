class Shape2 {
	public double width, height;
	
	public Shape2(double width, double height) {
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height = height;
	}
}

class Triangle2 extends Shape2 {
	
	public Triangle2(double width, double height) {
		// TODO Auto-generated constructor stub
		super(width,height);
	}
	public void computeTriangle() {
		System.out.printf("삼각형 면적: %.2f\n", (width * height)/2);
	}
}

class Rectangle2 extends Shape2 {
	
	public Rectangle2(double width, double height) {
		// TODO Auto-generated constructor stub
		super(width,height);
	}
	
	public void computeRetangle() {
		System.out.printf("사각형 면적: %.2f\n", (width * height));
	}
}
public class Example1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	public static void test1() {
		Triangle2 ob1 = new Triangle2(15.2,13.3);
		ob1.computeTriangle();
		
		Rectangle2 ob2 = new Rectangle2(15.2,13.3);
		ob2.computeRetangle();	
	}
}
