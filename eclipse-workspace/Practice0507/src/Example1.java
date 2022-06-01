interface Shape {
	
	abstract public void computeArea();
}

class Triangle implements Shape {
	public double width, height;
	
	public Triangle(double width, double height) {
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height = height;
	}
	@Override
	public void computeArea() {
		System.out.printf("삼각형 면적: %.2f\n", (width * height)/2);
	}
}

class Rectangle implements Shape {
	public double width, height;
	
	public Rectangle(double width, double height) {
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height = height;
	}
	@Override
	public void computeArea() {
		System.out.printf("사각형 면적: %.2f\n", (width * height));
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	public static void test1() {
		Shape ob;
		
		ob = new Triangle(15.2,13.3);
		ob.computeArea();
		
		ob = new Rectangle(15.2,13.3);
		ob.computeArea();	
	}
	public static void test2() {
		Shape[] s = new Shape[2];
		//Shape[] s = {new Triangle(15.2,13.3), new Rectangle(15.2,13.3)};
		s[0] = new Triangle(15.2,13.3);
		s[1] = new Rectangle(15.2,13.3);
		
		for(Shape sp : s) {
			if(sp instanceof Triangle)
				System.out.println("삼각형");
			else if(sp instanceof Rectangle)
				System.out.println("사각형");
			
			sp.computeArea();
		}
	}
}

