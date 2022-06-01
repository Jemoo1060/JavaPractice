// 좌표 객체
class Axis{
	private int x;
	private int y;
	
	// 일반 생성자
	public Axis(int x, int y) {
		if((x >= 0 && x<=100)&&(y >= 0 && y<=100)){
		this.x = x;
		this.y = y;
		} else {
			System.out.println("좌표의 범위가 벗어남");
			System.exit(1);
		}
	}
	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
	
	// 좌표정보 출력
	public String getAxis() {
		return String.format("(%d, %d)",x,y);
	}
}

// 원의 정보 (중심점, 반지름)
class Circle {
	private Axis center; // 중심점(100,150)
	private int radius; // 반지름
	
	// 생성자
	public Circle(Axis center, int radius) {
		// TODO Auto-generated constructor stub
		this.center = center;
		this.radius = radius;
		ShowCircle.displayCircle2(this);
	}
	
	public Axis getCenter() {
		return center;
	}
	
	public int getradius() {
		return radius;
	}
	// String 문자열 정보 출력
	public String getCircle1() {
		String message = "";
		message += String.format("중심점: %s\n", center.getAxis());
		message += String.format("반지름: %d", radius);
		return message;
	}
	public String getCircle2() {
		String message = "";
		message += String.format("중심점: (%d, %d)\n",center.getX(),center.getY());
		message += String.format("반지름: %d", radius);
		return message;
	}
}
class ShowCircle{
	
	public ShowCircle(Circle c) {
		// TODO Auto-generated constructor stub
		displayCircle(c);
	}
	
	public void displayCircle(Circle c) {
		System.out.printf("중심점: (%d, %d)\n", c.getCenter().getX(),c.getCenter().getY());
		System.out.printf("중심점: %s\n",c.getCenter().getAxis());
		System.out.printf("반지름: %d\n",c.getradius());
	}
	public static void displayCircle2(Circle c) {
		System.out.printf("중심점: (%d, %d)\n", c.getCenter().getX(),c.getCenter().getY());
		System.out.printf("중심점: %s\n",c.getCenter().getAxis());
		System.out.printf("반지름: %d\n",c.getradius());
	}

}
public class Example7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Axis pt = new Axis(70,80);
		Circle my = new Circle(pt,15);
		System.out.println(my.getCircle1());
		System.out.println(my.getCircle2());
		
		ShowCircle ob = new ShowCircle(my);
		ShowCircle.displayCircle2(my);
	}

}
