
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();
		test3();
		test4();
		test5();
		test6();
	}

	public static void test1() {
		// 자료형(data type)
		// 숫자(정수, 실수)
		// 정수 : (char(1), byte(1), short(2), int(4), long(8)) 
		byte number1= 127; // -128~127 1byte = 8비트 = 2의 8승
		short number2 = 20;// -32768~32767 2의 16승 까지
		// 실수 : float(4), double(8)
		// 실수 상수의 경우 8byte 할당 2의 64승
		float pi = (float)3.14; 
		// 상수에도 할당 받을 메모리 공간의 크기를 지정 3.14는 8byte지만 강제로 4byte 지정
		System.out.println(number1+number2+pi);
		
		int a = (int)65.94; 
		System.out.println(a);
		
		char b = (char)a;
		System.out.println(b);
		// 형변환 (casting) : 데이터타입을 변경
		
		// boolean 타입 (true/false) : 소문자
		boolean result = 10 < 9; // 참(1), 거짓(0)
		System.out.println(result);
	}
	
	public static void test2() {
		int number1 = 10;
		int number2 = 3;
		// 연산 : 몫, 나머지 
		System.out.println(number1 / (double)number2);
		System.out.println(number1/number2); //정수연산
		// 정수끼리의 / 연산 = 나눈 몫
		System.out.println(number1 % number2); //모듈라(나머지)
	}
	public static void test3() {
		// 전체 초를 시분초로 표시하기
		int full_second = 8345;
	    // 출력 : ??시간 ??분 ??초
		int hour = (full_second/60)/60;
		int minute = (full_second/60)%60;
		int second = full_second%60;
		System.out.printf("%d시간 %d분 %d초\n", hour, minute, second);	
	}
	public static void test4() {
		// 상수(constant) : 문자열(""), 문자('')
		// 10진수, 2진수 ,8진수, 16진수
		int number1 = 0725; //8진수
		System.out.println(number1); // 10진수 469
		System.out.printf("%x\n", number1); // = 16진수 값 1d5
		
		int number2 = 0x1d5; //16진수
		System.out.println(number2);
		System.out.printf("%o\n",number2); // = 8진수 값 725
		System.out.printf("%d\n",number2);// 10진수 469
		
	}
	public static void test5() {
		// 축약연산 : 변수의 개수를 줄이자
		int a = 10;
		int b = a + 5;
		System.out.println(b);
		
		int c = 10;
		c += 5; // c = c + 5;
		System.out.println(c);
		
		int d = 20;
		d += 1;
		System.out.println(d);
	
		int e = 30;
		//e++; // 1증가
		++e;
		System.out.println(e); // 선 증가, 후 증가 상관없이 무조건 1증가
		
		int f = 40;
		System.out.println(f++); // 후 증가 상태 먼저 40 출력됨
		System.out.println(f);
		// f--, --f도 존재
		
	}
	
	public static void test6() {
		// 동전 교환 (% 나머지) -> %= 
		int money = 5680;
		// 출력
		// 500원 ??개, 100원 ??개, 50원 ??개, 10원 ??개
		/*int m500 = money/500;
		int m100 = (money%500)/100;
		int m50 = ((money%500)%100)/50;
		int m10 = (((money%500)%100)%50)/10;*/
		
	int m500 = money/500;
	money %= 500;
	int m100 = money/100;
	money %=100;
	int m50 = money/50;
	money %= 50;
	int m10 = money/ 10;
		System.out.printf("500원 %d개, 100원 %d개, 50원 %d개, 10원 %d개\n", m500, m100,m50,m10);
	}
	
	
}























