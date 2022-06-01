class Point{
	private int x, y;
	
	public Point() {
		// TODO Auto-generated constructor stub
		this(0,0); // 생성자를 호출
		
	}
	public Point(int x) {
		// TODO Auto-generated constructor stub
		this(x,0);
	}
	public Point(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		System.out.println(this);
	}
	
	
	public boolean equals(Point obj) {
		// TODO Auto-generated method stub
		if(this.x == obj.x && this.y == obj.y)
			return true;
		else
			return false;
	}
	
	
	// toString(): 자바의 최상위 클래스인 Object 클래스의 메서드
	// object 클래스가 상속하는 모든 클래스에서 오버라이딩해서 사용할 수 있음.
	// 객체를 문자열로 변환
	// 객체를 출력할 때 toString() 자동호출
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("(%d : %d)",x,y);
	}
	
	public String displayPoint() {
		return String.format("(%d %d)",x,y);
	}
}

class Dates {
	private int year;
	private int month;
	private int day;
	
	public Dates(int year, int month, int day) {
		// TODO Auto-generated constructor stub
		this.year = year;
		this.month = month;
		this.day = day;
	}
	@Override
	public String toString() {
		// TODO Auto-generatead method stub
		return String.format("%d년 %d월 %d일", year,month,day);
	}
}

class Patients {
	private Dates admission;
	private Dates discharge;
	
	public Patients(Dates admission, Dates discharge) {
		// TODO Auto-generated constructor stub
		this.admission = admission;
		this.discharge = discharge;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = "";
		message += String.format("입원: %s\n", admission);
		message += String.format("퇴원: %s", discharge);
		return message;
	}
}

class Axis {
	protected int x,y;
	
	public void setAxis(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Axis() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("(%d, %d)", x,y);
	}
}

class Circle extends Axis{
	private int radius;
	public void setCircle(int x, int y, int radius) {
		super.x = x;
		super.y = y;
		this.radius = radius;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = "";
		message += String.format("중심점: %s\n",super.toString()); // super만 쓰면 안됨.
		message += String.format("반지름: %s", this.radius);
		return message;
	}
}

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();
	}
	public static void test1() {
		Point pt = new Point(100, 200);
		System.out.println(pt.displayPoint()); 
		System.out.println(pt);
		
		Point pt1 = new Point(101, 201);
		if(pt1.equals(pt))
			System.out.println("같다");
		else
			System.out.println("다르다");
		
		String message = "hello";
		if(message.equals(""))
			System.out.println("공백이다");
		else
			System.out.println("공백이 아니다");
	}
	public static void test2() {
		Dates admission = new Dates(2010, 3, 5);
		Dates discharge = new Dates(2013, 7, 25);
		Patients man = new Patients(admission, discharge);
		System.out.println(man);
	}
	public static void test3() {
		Circle mycircle = new Circle();
		mycircle.setCircle(100, 200, 5);
		System.out.println(mycircle);
	}
}
