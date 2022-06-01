// 멀티테스킹(Multi_tasking) : 프로세스 단위
// 멀티스레딩(Multi_Threading) : 스레드 단위( 경량 )
// 자원 공유 : 파일, DB, 메모리, .....
// 스레스 클래스를 상속 받아 스레드를 구현
// 자바에서는 다중 상속을 지원하지 않으므로 두 개의 클래스를 상속 받을 수 없다.
// 다중 상속처럼 보이기위해 Runnable 이라는 인터페이스 사용


// 스레드로 정의
class MyTest extends Thread{
	public String name;
	
	public MyTest(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	// 스레드로 정의한 클래스는 반드시 run() 메서드를 오버라이딩 해야된다.
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 내부의 코드는 스레드로 동작
		for(int count = 1; count <= 10; count++) {
			System.out.print(name + count);
		}
		System.out.println();
	}
}

class Parent{
	
}
// Runnable 이라는 인터페이스를 사용하면 스레드를 구현 할 수 있음.
// 마찬가지로 run 오버라이딩 필수
class MyRun extends Parent implements Runnable{
	public String name;
	
	public MyRun(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int count = 1; count <= 10; count++) {
			System.out.print(name + count);
		}
		System.out.println();
	}
	
}
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();
	}
	public static void test1() {
		
		// 일반 적인 코드의 수행 결과값
		// A1A2A3A4A5A6A7A8A9A10 
		// B1B2B3B4B5B6B7B8B9B10
		MyTest th1 = new MyTest("A");
		th1.run();
		
		MyTest th2 = new MyTest("B");
		th2.run();
	}
	public static void test2() {
		
		MyTest th1 = new MyTest("A");
		// 스레드로 수행 : 무엇을 run()코드를
		// 처음 실행 값은 같을 수 있으나 연속에서 실행 시켜보니 결과값이 계속 달라짐.
		th1.start(); // 스레드로 수행 , start로 적었지만 run()이 스레드로 실행됨.
		
		MyTest th2 = new MyTest("B");
		th2.start(); 
	}
	public static void test3() {
		MyRun r1 = new MyRun("C");
		//r1.start(); // 그냥 start 쓰면 오류나옴.
		// runnable 객체는 스레드 객체의 인수로 사용되어 스레드를 수행할 수 있다.
		Thread th1 = new Thread(r1); // 형변환 해줘야됨
		th1.start();
		
		MyRun r2 = new MyRun("D");
		Thread th2 = new Thread(r2);
		th2.start();
	}
}






























