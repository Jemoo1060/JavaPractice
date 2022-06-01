
// 자바는 클래스의 나열이다.
// 클래스는 객체를 설계하기 위한 설계도이다.
// 객체는 속성과 메서드로 정의한다.
// 하나의 자바코드에는 반드시 메인 클래스가 존재한다.
// 메인 클래스는 자바소스 코드의 파일 이름과 동일하다

// 일반 클래스
class Korea {
	
	
}

class Japan {
	
	
}

//메인 클래스
public class Example1 {
	
	// 메인클래스에는 반드시 메인 메서드가 포함
	// 메인 메서드는 프로그램이 실행될 때 가장 먼저 딱 한번 호출된다. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 같은 클래스안의 메서드는 이름만 사용
		// 다른 클래스의 메서드를 호출할 때는 객체를 생성해서 사용
		test1(); // 메서드를 호출
		test2();
		test3();
		test4();
		test5();
		test6();
		test7();
	}
	
	// 필요하면 다른 메서드(함수)도 정의 가능
	// void : 전달 하는 인수나 반환값이 없을 경우 표시
	// 자바의 메서드로 전달하는 인수가 없을 경우 void를 생략해도 된다.
	// 특히 메인 클래스안의 메서는 반드시 public static를 붙인다.
	public static void test1() {
		// 문자열 출력 : System.out 객체를 사용하여 출력
		// System.out 객체가 가지고 있는 println() 메서드를 사용
		// println()은 문자열을 인수로 전달
		// 문자열은 문자들의 나열 " "로 묶어서 정의
		System.out.println("Hello");
		System.out.println("반갑습니다");
		// println() : 줄바꿈(enter)
		System.out.print("어서오세요");
		System.out.print("안녕하세요\n");
		// print() : 줄바꿈 생략
		// 참고 : 이스케이프 문자('\n': 줄바꿈)
		System.out.println("\"Oh\"my god");
		// printf() : format(문자열, 숫자(정수,실수))지정
		// %s : 문자열, %d : 정수, %f : 실수
		System.out.printf("반갑습니다 %s입니다\n", "홍길동");
		System.out.printf("나이는 %d세입니다", 20);
		System.out.printf("몸무게는 %fkg입니다\n", 67.8);
		// 실수(%f)의 경우 소수점 6자리까지 다 표시 // 67.800000
		System.out.printf("몸무게는 %.2fkg입니다\n", 67.8);
		System.out.printf("몸무게는 %.2fkg입니다\n", 67.8472);
		// %.2f : 수소점 2자리(반올림)
		// 문자 : 'A' : %c
		System.out.printf("혈액형 %c형 입니다\n", 'A');
		//포맷을 여러개 사용할 경우 
		System.out.printf("이름은 %s이고, 나이는 %d입니다\n","홍길동",20);
	}
	
	public static void test2() {
		// 변수 : 메모리 공간에 이름을 할당(예약)하고 이름을 붙인 것
		// 변수에 데이터를 저장하고 변경 가능함
		// 변수를 정의 : 저장할 데이터의 종류와 크기를 고려하여 결정
		// int형 변수 : 4byte 크기의 메모리 공간을 할당하고 정수를 저장
		// double형 변수 : 8byte 크기를 할당, 실수를 저장
		int number1; //변수를 선언
		number1 = 100; //변수의 값을 초기화
		
		System.out.println(number1);
		
		double number2;
		number2= 3.14;
		
		System.out.println(number2);
		
		// c와의 차이점
		// c++이나 자바에서는 변수 선언은 언제든지 코드 중간에 가능하다
	}
	
	public static void test3() {
		// 사각형 면적
		int width = 10; //변수를 선언함과 동시에 초기화 가능
		int height = 20;
		int area = width * height; // * : 곱하기, / : 나누기
		System.out.println("면적 : "+ area);
		System.out.printf("면적 : %d\n", area);
	}
	public static void test4() {
		// 삼각형 면적
		// 변수는 자신이 만들어진 영역에서만 유효
		// 영역이 끝나면 자동으로 메모리에서 해제
		// 변수의 이름이 같더라도 선언된 영역이 다르면 사용 가능함
		int height = 7;
		int width = 3;
		double value = height*width/2.0;
		// 산술연산 : 정수와 정수의 연산 결과는 정수
		// 실수 결과가 나오려면 한쪽이 실수이어야 함
		System.out.printf("삼각형의 면적 : %.2f\n", value);
		System.out.println("삼각형의 면적 : "+ value);
	}
	public static void test5() {
		// 3명이 식사를 하고 나온 금액이 14500원
		// 팁으로 5%를 추가로 지불
		// 각자 얼마를 내야하나?
		int money = 14650;
		double tip = 0.05;
		double pay = (money + money*tip)/3;
		//출력 : 소수 둘째자리 까지, ???원
		System.out.printf("각자 %.2f원\n", pay);
	}
	public static void test6() {
		// 자료형 (data type)
		// 자바에서는 8가지 자료형이 존재한다.
		// 문자(char) : 1byte 메모리 공간 할당
		char blood = 'A'; // 문자는 작은 따옴표로 상수를 정의
		System.out.println(blood);
		System.out.printf("%c\n", blood); //문자	
	}
	public static void test7() {

		int blood1 = 'A';
		System.out.println(blood1);
		System.out.printf("%c\n", blood1); 
		System.out.printf("%d\n", blood1); 
		
		char number = 66;
		// char의 용도는 문자를 저장하기 위한것
		// char를 사용하여 작은 크기의 정수를 저장하는 용도로도 사용한다.
		System.out.println(number);
		System.out.printf("%c\n", number);
		// 형변환(casting)
		int n = (int)number;
		System.out.printf("%d\n",n);
	}

}
