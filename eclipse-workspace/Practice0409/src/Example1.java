class Scope{
	int number;
	
	public void range() {
		int number = 200; // 메서드 안과 밖에서 같은 이름으로 선언해도 됨
		// 전역 변수와 같은 이름의 변수를 지역으로 정의할 경우
		// 지역이 우선으로 적용 
		System.out.println("in range number = " + ++ number);
	}
}
class Number {
	static int number = 10;
	int value = 100;
	public static void increment() {
		number++;
		// value++; 오류나옴. static이 붙은 공동창고 number과 개인창고 value가 같이 쓰일수 없음.
		// static 메서드는 static 속성만 접근가능
		increment2();
		// static 메서드는 static 메서드만 호출 가능
	}
	
	public static void increment2() {
		number = number +2;
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();
	}
	public static void test1() {
		int number1 = 10; // 지역(local) 변수
		{
			// int number1 = 100; // 같은 지역 중첩 정의 x
			int number2 = 20; // 가능
		}
		System.out.println("number1 = "+ number1);
		for(int count = 0; count < 3; count++) {
			int number3 = 30;
			System.out.println("number3 = "+ ++number3);
		}
		Scope ob = new Scope();
		System.out.println("number = "+ob.number); 
		// 클래스의 속성을 초기화하지 않을 경우 0으로 초기화
	}
	public static void test2() {
		Scope ob = new Scope();
		ob.range();
	}
	public static void test3() {
		int number1 = 20;
		int number2 = number1;
		System.out.println("number2 = "+ number2); // 20
		Number ob1 = new Number();
		System.out.println("ob1 number = "+ob1.number);
		
		Number ob2 = ob1; // ob2는 ob1의 참조값(주소값?)을 복사
		ob2.number++;
		System.out.println("ob2 number = "+ob2.number); // 11
		System.out.println("ob1 number = "+ob1.number); // 11, 10일줄 알았는데 11임
		System.out.println(ob1); 
		System.out.println(ob2);
		
		Number ob3 = new Number();
		ob3.increment();
		System.out.println("ob3 number = "+ob3.number);
		
		Number.increment();
		System.out.println("ob number = "+Number.number);
		// 클래스 변수
		// 클래스내에 static 속성은 정적 변수 모든 객체가 공유
		// 클래스 이름을 객체로 하여 속성을 사용할 수 있다.
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
