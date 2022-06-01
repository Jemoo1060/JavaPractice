// 주석(comment) : 코드 실행에 영향을 주지 않음
// 객체 : 현실 세계의 복잡한 대상(문제)을 구체화 시킨 정보
// 객체는 속성 (데이터)와 동작 메서드(기능,함수)으로 구성
// 객체 지향 프로그래밍 : 객체를 만들거나 있던 객체를 사용하여 프로그래밍
// 객체는 클래스로 부터 생성
// 클래스는 객체를 만들기 위한 설계도
// 자바는 클래스를 나열하여 프로그래밍
// 클래스를 정의할 때 반드시 메인 클래스를 정의하여야 한다.
// 메인 클래스는 프로그램이 시작될 때 자동으로 객체를 생성한다.
// 메인 클래스는 자바의 파일이름과 동일함
// 메인 클레스 앞에는 반드시 public이라는 키워드를 붙인다.

// 일반 클래스
class police{
	// 속성
    // 모자, 옷, 신발, 등등
	// 메서드
	// 방망이는 흔든다, 달리기를 잘한다.
	void swing() {
		System.out.println("방망이를 흔들다");
	}
	
	void run() {
		System.out.println("달리기를 잘한다");
	}
}

class korea {
	
	
}

class japan {
	
	
}

class china {
		
}
// 자바는 코드를 실행할 때 메인 클래스의 객체를 자동으로 만들어서 실행
// 메인 클래스에는 main()이름의 메서드가 반드시 존재해야함
// 객체가 만들어진 후에 main()메서드를 자동을 먼저 실행한다.
// 자바 코드를 실행(ctrl + F11) 운영체제가 메인 클래스의 메인 메서드를 자동 호출
public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 여기에 작성된 코드가 가장 먼저 실행됨
		System.out.println("1.Hello");
		insa1(); // 메서드(함수)를 호출
		System.out.println("5.end1");
		
		police man = new police();// 객체를 생성
		man.swing();
		man.run();
	}
	
	// void : 함수를 호출할 때 아무런 전달값이 없다
	// void : 함수의 호출이 끝나고 아무런 반환값이 없다
	public static void insa1() {
		// 문자열은 문자를 차례로 나열한 것 : 반드시 ""로 묶어야 함
		System.out.println("2.Hi");
		insa2();
		System.out.println("4.end2");
	}
	
	public static void insa2() {
	    System.out.println("3.welcome");  //출력 순서 봐바
	}

}
