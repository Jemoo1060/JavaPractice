// 일반 클래스의 정의(속성과 메서드로 구성)
class Point1 {
	// 속성 정의 (클래스의 멤버 변수)
	int x = 100, y = 200;
}
class Point2 {
	int x,y; // 초기 값 없음
	double z; // 0.0으로 초기화
	String name; // null로 초기화
}

class Point {
	// 속성을 정의
	int x,y;
	
	//메서드를 정의
	void display() {	
		System.out.printf("(%d %d)\n", x,y);
	}
	void myDisplay() {
		System.out.println("x축 : " + x);
		System.out.println("y축 : "+ y);
	}
}


public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();
		test3();
	}
	
	public static void test1() {
		Point1 pt = new Point1(); // 객체생성
		// pt : 객체 참조 변수, new Point1() : 실제 객체
		// 객체 참조 변수를 사용하여 멤버(속성)에 접근 : 메세지
		// 메세지 표현 방법 : 객체.속성, 객체.메서드
		System.out.println(pt.x);
		System.out.println(pt.y);
		
		pt.x = 10;
		pt.y = 20;
		System.out.println(pt.x + pt.y);
		
		Point1 mypt = new Point1();
		System.out.printf("(%d, %d)\n", mypt.x, mypt.y);
	}
	
	public static void test2() {
		Point2 pt1 = new Point2();
		System.out.println(pt1.x+", "+pt1.y + ", " + pt1.z + ", " + pt1.name);
	}
	
	public static void test3() {
		Point pt = new Point();
		pt.x=100;
		pt.y=200;
		pt.display(); //객체를 사용하여 메서드를 호출
		pt.myDisplay();

	}

}
