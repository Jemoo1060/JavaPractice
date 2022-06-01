class Shape1 {
	public double width, height;
	
	public Shape1(double width, double height) {
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height = height;
	}
}

class Triangle1 {
	
	public void computeTriangle(Shape1 sp) {
		System.out.printf("삼각형 면적: %.2f\n", (sp.width * sp.height)/2);
	}
}

class Rectangle1 {
	public void computeRetangle(Shape1 sp) {
		System.out.printf("사각형 면적: %.2f\n", (sp.width * sp.height));
	}
}
public class Example1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	public static void test1() {
		Shape1 s = new Shape1(15.2,13.3);
		Triangle1 ob1 = new Triangle1();
		ob1.computeTriangle(s);
		
		Rectangle1 ob2 = new Rectangle1();
		ob2.computeRetangle(s);
		
	}

}