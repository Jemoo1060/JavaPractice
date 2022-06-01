class Area{
	public void computeArea() {
		System.out.println("면적을 구할 도형이 없음");
	}
	public void computeArea(int width) {
		System.out.printf("정사각형: %d\n", width * width);
	}
	public void computeArea(int width, int height) {
		System.out.printf("직사각형: %d\n",width * height);
	}
	public void computeArea(int width,int height, int depth) {
		System.out.printf("정육면체: %d\n",width * height * depth);
	}
}
class Counter{
	static int number;
	public static void increment() {
		number++;
	}
	public static void increment(int n) {
		number += n;
	}
}
public class Example5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();
	}
	public static void computeAdd() {
		System.out.println("test1");
	}
	public static void computeAdd(int a) {
		System.out.println("test2");
	}
	public static void computeAdd(int a, int b) {
		System.out.println("test3");
	}
	public static void computeAdd(double a, double b) {
		System.out.println("test4");
	}
	//리턴값이 달라져도 오버로딩이 성립하지 않는다. 오류나옴
	// 반환타입과는 무관함
	/*public static int computeAdd(int a, int b) {
		System.out.println("test5");
		return a+b; 
	} */
	public static void test1() {
		// 오버로딩 (Overloading)
		computeAdd();
		// 클래스내 기본적으로 같은 이름의 메서드 정의는 불가
		// 단 매개변수의 개수가 다르거나 자료형이 다르면 허용
		computeAdd(10);
		computeAdd(10,20);
		computeAdd(10.0,20);
	}
	public static void test2() {
		Area ob = new Area();
		ob.computeArea();
		ob.computeArea(10);
		ob.computeArea(10,20);
		ob.computeArea(10,20,30);
	}
	public static void test3() {
		Counter.increment();
		Counter.increment();
		Counter.increment(3);
		System.out.println(Counter.number);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
